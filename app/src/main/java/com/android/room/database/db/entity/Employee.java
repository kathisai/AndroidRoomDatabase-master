package com.android.room.database.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Employee {
    @PrimaryKey
    @ColumnInfo(name = "empolyeeID")
    private int empolyeeID;

    @ColumnInfo(name = "userID")
    private int userID;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "email")
    private String email;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpolyeeID() {
        return empolyeeID;
    }

    public void setEmpolyeeID(int empolyeeID) {
        this.empolyeeID = empolyeeID;
    }

}
