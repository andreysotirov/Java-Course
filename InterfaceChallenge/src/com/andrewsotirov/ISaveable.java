package com.andrewsotirov;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    ArrayList<String> write();
    void read(ArrayList<String> savedValues);
}
