package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String args[]) {
        Map<String, String> sportMap = new HashMap<String, String>();
        sportMap.put("C", "Cricket");
        sportMap.put("F", "Football");
        sportMap.put("R", "Rugby");

//       for (String key : sportMap.keySet()) {
//           System.out.println(key + " " + sportMap.get(key));
//       }
//
//       for (Map.Entry<String, String> entry: sportMap.entrySet()) {
//           System.out.println(entry.getKey() + " " + entry.getValue());
//       }

        // lambda function
        sportMap.forEach((k,v) ->System.out.println(k + " " + v));
    }
}
