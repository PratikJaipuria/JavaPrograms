package com.company;

import java.util.HashMap;

public class LongestChainofDoubles {

    public int longestChainofDoubles(int[] input){
        HashMap<Integer,Integer> map = new HashMap();
        int maxSoFar = Integer.MIN_VALUE;
        for(int num : input){
            map.putIfAbsent(num,0);
        }

        for(int i=0 ; i < input.length ; i++){
            int num = input[i];

            int count = 1;
            if(map.get(num)==0){
                if(map.get(num*2)==null){
                    map.put(num, 1);
                    continue;
                }
                while(map.containsKey(num*2) && map.get(num*2) < 1){
                    count++;
                    num = num*2;
                }

                if(map.get(num*2) == null){
                    map.put(num,1);
                    count--;
                }


                while(num!=input[i]){
                    map.put(num/2, 1+ map.get(num));
                    num = num/2;
                }

                if(map.containsKey(num*2) && map.get(num*2)>0){
                    map.put(num,map.get(num*2)+1);
                }


                maxSoFar = Math.max(maxSoFar, map.get(input[i]));


            }

        }
        return maxSoFar;
    }

}
