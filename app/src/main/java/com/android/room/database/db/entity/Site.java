package com.android.room.database.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity
//        (foreignKeys = @ForeignKey(entity = Employee.class,
//        parentColumns = "employeeId",
//        childColumns = "siteID",
//        onDelete = CASCADE,
//        onUpdate = CASCADE))
public class Site {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "siteID")
    private int siteID;
    @ColumnInfo(name = "employeeId")
    private int empolyeeID;

    public int getSiteID() {
        return siteID;
    }

    public void setSiteID(int siteID) {
        this.siteID = siteID;
    }

    public int getEmpolyeeID() {
        return empolyeeID;
    }

    public void setEmpolyeeID(int empolyeeID) {
        this.empolyeeID = empolyeeID;
    }
}
