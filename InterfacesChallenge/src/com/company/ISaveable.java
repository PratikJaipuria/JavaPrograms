package com.company;

import java.util.List;

/**
 * Created by Pratik on 7/16/2017.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
