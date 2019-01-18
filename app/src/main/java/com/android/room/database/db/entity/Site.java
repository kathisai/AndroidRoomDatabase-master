package com.android.room.database.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity
        (foreignKeys = @ForeignKey(entity = Employee.class,
        parentColumns = "empolyeeID",
        childColumns = "empolyeeID",
        onDelete = CASCADE,
        onUpdate = CASCADE))
public class Site {

//    private int id;

    @ColumnInfo(name = "siteID")
    private int siteID;

    @PrimaryKey
    @ColumnInfo(name = "empolyeeID")
    @Nullable
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
