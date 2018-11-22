package com.company;

import java.util.*;

public class sortLogFile {

    public List<String> sortLogs(List<String> list) {

        List<String> result = new ArrayList<String>();
        List<String> numbers = new ArrayList<String>();
        List<String> words = new ArrayList<String>();

        for (String s : list) {
            //Splitting log from identifier
            String[] log = s.split(" ", 2);

            //Separating numbers and words
            if (Character.isDigit(log[1].charAt(0))) {
                numbers.add(s);

            } else {
                //To handle ties appended identifier at the end of log
                String s_updated = log[1] + " " + log[0];
                words.add(s_updated);
            }
        }

        //Sort words
        Collections.sort(words);

        //Rebuilding the words as input format and adding to result list
        for (String word : words) {

            String[] log = word.split(" ");
            StringBuilder original_log = new StringBuilder();

            //Appending Identifier
            original_log.append(log[log.length - 1]);

            for (int i = 0; i < log.length - 1; i++) {
                original_log.append(" ");
                original_log.append(log[i]);
            }

            result.add(original_log.toString());
        }

        //Add numbers to the result at the end
        result.addAll(numbers);

        for (String res : result) {
            System.out.println(res);
        }
        return result;
    }
}
