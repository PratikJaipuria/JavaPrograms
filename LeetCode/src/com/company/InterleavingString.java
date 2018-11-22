package com.company;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        int s3Len = s3.length();
        int i=0;int j=0; int p=0;

        if(s1Len + s2Len != s3Len) return false;

        while(i < s1Len || j < s2Len){
            if(i < s1Len && s1.charAt(i) == s3.charAt(p)){
                i++;
            }else if(j < s2Len && s2.charAt(j) == s3.charAt(p)){
                j++;
            }else{
                return false;
            }
            p++;
        }

        return true;
    }
}
