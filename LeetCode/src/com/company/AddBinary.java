package com.company;

/**
 * Created by Pratik on 9/27/2017.
 */
public class AddBinary {
            public String addBinary(String a, String b) {
            int n=0;
            StringBuffer aNew = new StringBuffer();
            StringBuffer bNew = new StringBuffer();
            StringBuffer result = new StringBuffer();
            aNew.append(a).reverse();
            bNew.append(b).reverse();
            int carry = 0;
            int sum = 0;
            int i = 0;
            if(a.length() > b.length()){
                n = a.length();
            }else{
                n = b.length();
            }
            int aI = 0, bI = 0;
            while (i < n){
                if(i < a.length()){
                    aI = Character.getNumericValue(aNew.charAt(i));
                }else{
                    aI = 0;
                }

                if(i < b.length()){
                    bI = Character.getNumericValue(bNew.charAt(i));
                }else{
                    bI = 0;
                }

                sum = aI ^ bI ^ carry;

                if(aI + bI + carry >= 2){
                    carry = 1;
                }else{
                    carry = 0;
                }
                result.append(sum);
                i++;
            }
            if(carry == 1){
                result.append(carry);
            }

            return result.reverse().toString();

        }


}
