package com.android.room.database.db.models;


import java.util.List;

public class LookupList {

    public String name;
    public List<InstrPair> options;

    public LookupList(String name, List<InstrPair> options) {
        this.name = name;
        this.options = options;
    }
}