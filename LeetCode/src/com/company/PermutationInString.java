package com.company;

/**
 * Created by Pratik on 7/27/2017.
 */
public class PermutationInString {

        public boolean checkInclusion(String s1, String s2) {


            if (s1.length() > s2.length()){
                String temp = s1;
                s1 = s2;
                s2 = temp;
            }
            int j = 0;
            boolean forward = true;
            for (int i = 0; i < s1.length() ; i++){
                boolean quit = false;

                while(!quit){

                    if(j > s2.length() || j < 0){
                        quit = true;
                    }

                    if(s1.charAt(i) == s2.charAt(j)){
                        break;
                    }


                    if (forward){
                        j++;}
                    else{
                        j--;
                    }
                }


                if(i < s1.length() - 1){
                    if (s1.charAt(i+1) == s2.charAt(j+1)){
                        forward = true;
                    }else if(s1.charAt(i+1) == s2.charAt(j-1)) {
                        forward = false;
                    }else {
                        return false;
                    }
                }
            }

            return true;
        }

    }
