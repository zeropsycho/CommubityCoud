package com.zero.hjy.key;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

/**
 * Base64加密解密工具类
 */
public class Base64Util {
    private final Logger logger = LoggerFactory.getLogger(Base64Util.class);

    private final String CHARSET = "utf-8";

    /**
     * 解密
     * @param data
     * @return
     */
    public String decode(String data) {
        try {
            if (null == data) {
                return null;
            }

            return new String(Base64.decodeBase64(data.getBytes(CHARSET)), CHARSET);
        } catch (UnsupportedEncodingException e) {
            logger.error(String.format("字符串：%s，解密异常", data), e);
        }

        return null;
    }

    /**
     * 加密
     * @param data
     * @return
     */
    public String encode(String data) {
        try {
            if (null == data) {
                return null;
            }
            return new String(Base64.encodeBase64(data.getBytes(CHARSET)), CHARSET);
        } catch (UnsupportedEncodingException e) {
            logger.error(String.format("字符串：%s，加密异常", data), e);
        }

        return null;
    }

}