package com.company;

/**
 * Created by Pratik on 8/3/2017.
 */
public class CountandSay {

    public String countAndSay(int n) {
//        StringBuilder curr = new StringBuilder("1");
//        StringBuilder prev;
        String curr = "1";
        String prev;
        int count;
        char say;
        for (int i = 1; i < n; i++) {
            prev = curr;
            curr = "";
            count = 1;
            say = prev.charAt(0);

            for (int j = 1, len = prev.length(); j < len; j++) {
                if (prev.charAt(j) != say) {
                    curr = curr + Integer.toString(count) + say;
//                    curr.append(count).append(say);
                    count = 1;
                    say = prev.charAt(j);
                } else count++;
            }
//            curr.append(count).append(say);
            curr = curr + Integer.toString(count) + say;
        }
        return curr.toString();
    }
}