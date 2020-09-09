import com.alibaba.fastjson.JSONObject;
import com.zero.hjy.pojo.UnitTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Datetime {


    public static void main(String[] args) {
        String str = "[{ \"buildingNo\": \"A1\", \"unitNumber\": 1},{ \"buildingNo\": \"A2\", \"unitNumber\": null},{ \"buildingNo\": \"A3\", \"unitNumber\": null},{ \"buildingNo\": \"A4\", \"unitNumber\": null}]";

        List<UnitTemplate> templates = JSONObject.parseArray(str, UnitTemplate.class);
        templates.forEach(unitTemplate -> System.out.println(unitTemplate.getBuildingNo()));
    }
}
