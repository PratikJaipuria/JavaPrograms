package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pratik on 8/18/2017.
 */
public class ZigZag {
    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        boolean rising = true;
        int rowNum = 1;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(rowNum)){
                sb = new StringBuilder(map.get(rowNum));
                sb.append(s.charAt(i));
                map.put(rowNum, sb.toString());
            }else{

                map.put(rowNum,Character.toString(s.charAt(i)));
            }


            if (rising) {
                rowNum++;
            } else {
                rowNum--;
            }

            if (rowNum == numRows) {
                rising = false;
            }
            if (rowNum == 1) {
                rising = true;
            }


        }
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " = " + value);
//            // ...
//        }
        int rows = 1;
        StringBuilder result = new StringBuilder();
        while (rows <= numRows) {
            if(map.containsKey(rows)){
                sb = new StringBuilder(map.get(rows));
                result.append(sb.toString());
                rows++;
            }

        }


        return result.toString();


    }
}