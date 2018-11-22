package com.company;

/**
 * Created by Pratik on 7/17/2017.
 */
public class ReverseWordsinString {
    public String reverseWords() {
    String s = "jsdjcsnd sdcsjdn sjndcjsdnc";
    String[] str = s.split(" ");
    int n = str.length;

    StringBuilder result = new StringBuilder();
    for (int i=0;i < n ; i ++){

        String r = new StringBuffer(str[i]).reverse().toString();
        System.out.println(r);
        if(i == n-1){
            result.append(r);
        }else{
            result.append(r).append(" ");
        }
    }

//        System.out.println(result);
        return result.toString();


//    return dest.toString();

}}
