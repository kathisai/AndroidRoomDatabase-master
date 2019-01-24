package com.android.room.database.db.models;

public class Reasons {

    public int reasonId;
    public String name;

    public Reasons(int reasonId, String name) {
        this.reasonId = reasonId;
        this.name = name;
    }
}