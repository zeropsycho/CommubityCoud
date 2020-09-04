package com.zero.hjy.utils.jwt;

import com.zero.hjy.key.Base64Util;
import com.zero.hjy.statuscode.StatusCode;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * jwt 加密解析工具
 */
public class JwtUtils {

    private static Logger log = LoggerFactory.getLogger(JwtUtils.class);
    public static final String AUTH_HEADER_KEY = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String ACCESS_TOKEN = "Access-Token";

    /**
     * 创建jwt
     */
    public static Claims parseJwt(String webToken, String security) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(security))
                    .parseClaimsJws(webToken)
                    .getBody();
            return claims;
        } catch (ExpiredJwtException e) {
            // token 过期
            log.error("token已过期：", e);
            throw new JwtExpiredException(StatusCode.PERMISSION_TOKEN_EXPIRED);
        } catch (Exception e) {
            // 异常
            log.error("token创建时异常：", e);
            throw new JwtExpiredException(StatusCode.PERMISSION_TOKEN_INVALID);
        }
    }

    public static String createJWT(String pw, String userId, String username, String role, Audience audience) {
        try {
            // 使用HS256加密算法
            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

            long nowMillis = System.currentTimeMillis();
            Date now = new Date(nowMillis);

            //生成签名密钥
            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(audience.getSecret());
            Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

            //userId是重要信息，进行加密下
            String encryId = new Base64Util().encode(userId);
            // pw
            String pws = new Base64Util().encode(pw);
            //添加构成JWT的参数
            JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT")
                    // 可以将基本不重要的对象信息放到claims
                    .claim("role", role)
                    .claim("userId", encryId)
                    .claim("pw", pws)
                    // 代表这个JWT的主体，即它的所有人
                    .setSubject(username)
                    // 代表这个JWT的签发主体；
                    .setIssuer(audience.getClientId())
                    // 是一个时间戳，代表这个JWT的签发时间；
                    .setIssuedAt(new Date())
                    // 代表这个JWT的接收对象；
                    .setAudience(audience.getName())
                    .signWith(signatureAlgorithm, signingKey);
            //添加Token过期时间
            int TTLMillis = audience.getExpiresSecond();
            if (TTLMillis >= 0) {
                long expMillis = nowMillis + TTLMillis;
                Date exp = new Date(expMillis);
                // 是一个时间戳，代表这个JWT的过期时间；
                builder.setExpiration(exp)
                // 是一个时间戳，代表这个JWT生效的开始时间，意味着在这个时间之前验证JWT是会失败的
                        .setNotBefore(now);
            }

            //生成JWT
            return builder.compact();
        } catch (Exception e) {
            log.error("签名失败", e);
            throw new JwtExpiredException(StatusCode.PERMISSION_SIGNATURE_ERROR);
        }
    }

    /**
     * 从token中获取用户名
     * @param token
     * @param security
     * @return
     */
    public static String getUsername(String token, String security){
        return parseJwt(token, security).getSubject();
    }

    /**
     * 从token中获取用户ID
     * @param token
     * @param security
     * @return
     */
    public static String getUserId(String token, String security){
        String userId = parseJwt(token, security).get("userId", String.class);
        return new Base64Util().decode(userId);
    }

    /**
     * 是否已过期
     * @param token
     * @param security
     * @return
     */
    public static boolean isExpiration(String token, String security) {
        return parseJwt(token, security).getExpiration().before(new Date());
    }

    public static String getPw(String token, String security){
        return new Base64Util().decode(parseJwt(token, security).get("pw", String.class));
    }
}
