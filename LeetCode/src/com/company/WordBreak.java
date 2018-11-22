package com.company;
import java.util.List;

class WordBreak {

    public boolean findWordinDict(String s, List<String> wordDict){
        if(s.equals("")) return false;
        for (String w : wordDict){
            if(s.equals(w))
                return true;
        }
        return false;
    }


    public boolean wordBreak(String s, List<String> wordDict) {

        if(s.equals(""))
            return false;
        boolean[] wb = new boolean[s.length() + 1];
        for(int i = 1 ; i<= s.length() ; i++)
        {

            if (findWordinDict(s.substring(0,i),wordDict) && !wb[i]){
                wb[i] = true;
            }

            if(wb[i])
            {

                for(int j= i+1 ; j <= s.length(); j++)
                {
                    if (findWordinDict(s.substring(i,j),wordDict) && !wb[j])
                    {
                        wb[j] = true;
                    }

                    if(wb[j] && j == s.length() + 1)
                    {
                        return true;
                    }
                }

            }

        }
        return false;
    }
}