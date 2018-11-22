package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Pratik on 9/27/2017.
 */
public class Calculator {


    public double parsetoCompute(){
        String d = "[+*/\\-]+";
        double result = 0;
        String input = "14+21/7+6*8/12";
        int len = input.length();
        Queue<String> stack = new LinkedList<>();
//        stack.push(Character.toString(input.charAt(0)));
//        String expr = "2*x^3 - 4/5*y + z^2";
//        String delims = "[+\\-*/ ]+"; // so the delimiters are:  + - * / ^ space
        String[] tokens = input.split(d);

        String[] operators = input.split("");

        result = Integer.parseInt(tokens[0]);
        for(int i = 0 ; i < len ; i++){
            if(operators[i].equals("+") || operators[i].equals("-") || operators[i].equals("*") || operators[i].equals("/")){
                stack.add(operators[i]);
          }
        }

        for(int i = 1 ; i < tokens.length; i++)
        {       String op = stack.remove();
//                System.out.println(op);
                if(op.equals("+")){
                    result += Integer.parseInt(tokens[i]);
//                    System.out.println(temp);
                }else if(op.equals("-")){
                    result -= Integer.parseInt(tokens[i]);
//                    System.out.println(temp);
                }else if(op.equals("*")){
                    result *= Integer.parseInt(tokens[i]);
//                    System.out.println(temp);
                }else if(op.equals("/")){
                    result /= Integer.parseInt(tokens[i]);
//                    System.out.println(temp);
                }



            }


//        result = temp;
        return result;
    }
}
