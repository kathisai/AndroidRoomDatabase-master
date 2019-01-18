package com.android.room.database.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

@Entity(tableName = "employee_site_join",
        foreignKeys = {
                @ForeignKey(entity = Employee.class,
                            parentColumns = "empolyeeID",
                            childColumns = "empolyeeID"),
                @ForeignKey(entity = Site.class,
                            parentColumns = "empolyeeID",
                            childColumns = "siteID")
                })
public class EmployeeSite {



    @PrimaryKey
    @ColumnInfo(name = "empolyeeID")
    public  int empolyeeID;

    @ColumnInfo(name = "siteID")
    public  int siteId;

    public EmployeeSite(int employeeId, int siteId) {
        this.empolyeeID = employeeId;
        this.siteId = siteId;
    }

    public EmployeeSite() {
    }

    public void setEmployeeId(int employeeId) {
        this.empolyeeID = employeeId;
    }




    @Nullable
    public int getEmpolyeeID() {
        return empolyeeID;
    }

    public void setEmpolyeeID(@Nullable int empolyeeID) {
        this.empolyeeID = empolyeeID;
    }


    public int getSiteId() {
        return siteId;
    }
}