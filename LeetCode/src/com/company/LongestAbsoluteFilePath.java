package com.company;

import java.util.HashMap;

public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        HashMap<Integer,String> hMap = new HashMap<>();
        String[] inputs = input.split("\n");
        int max = 0;
        for(int i=0;i<inputs.length;i++)
        {
            String cur = inputs[i];
            int j=0;
            int tabCount = 0;
            while(j<cur.length())
            {
                if(cur.charAt(j)=='\t')
                    ++tabCount;
                else
                    break;
                ++j;
            }

            String newString = "";

            if(tabCount==0)
            {
                newString = cur;
            }
            else
                newString = hMap.getOrDefault(tabCount-1,"")+"/"+cur.substring(j);

            if(cur.indexOf(".")>=0)
            {
                max = Math.max(max,newString.length());
            }
            hMap.put(tabCount,newString);
        }
        return max;
    }
}
