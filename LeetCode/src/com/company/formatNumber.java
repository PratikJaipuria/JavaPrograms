package com.company;

/**
 * Created by Pratik on 9/20/2017.
 */
public class formatNumber {
    String formattedNumber(int num){
        StringBuilder str = new StringBuilder();
        int n=0;
        while(num != 0){
            String a;
            a = Integer.toString(num%10);
            str.append(a);
            num = num/10;
            n++;
            if(n==3){
                str.append(",");
                n=0;
            }


//            System.out.println(str);
//            System.out.println(num);
        }
        return str.reverse().toString();
    }
}
