package com.company;

import java.util.Stack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Pratik on 8/16/2017.
 */
public class ReducedString {

       public static String super_reduced_string(String s){
            // Complete this function
            Stack<Character> myStack = new Stack<>();
            if (s.length() == 0){
                return "";
            }

            if (s.length() > 0){
                myStack.push((Character) s.charAt(0));
                System.out.println("1st stack push"+ myStack);
            }
            //int top = 0;
           int i = 0;
            while(i + 1  < s.length()){
                System.out.println("stack Status"+ myStack);

                if (s.charAt(i) == (Character)myStack.peek()){
                    myStack.pop();
                    if(myStack.isEmpty() && i+2 < s.length() ) {
                        myStack.push((Character)s.charAt(i+1));
                        i++;
                    }
                }
                myStack.push((Character)s.charAt(i+1));


                i++;
            }

            StringBuilder ans = new StringBuilder();
            while(!myStack.isEmpty()){
                char t = myStack.pop();
                ans.append(t);
            }
            System.out.println(ans);
            return ans.toString();
        }

//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            String s = in.next();
//            String result = super_reduced_string(s);
//            System.out.println(result);
//        }
    }


