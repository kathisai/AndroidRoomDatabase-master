package com.android.room.database.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(tableName = "employee_site_join",
        primaryKeys = { "employeeId", "siteID" },
        foreignKeys = {
                @ForeignKey(entity = Employee.class,
                            parentColumns = "id",
                            childColumns = "employeeId"),
                @ForeignKey(entity = Site.class,
                            parentColumns = "id",
                            childColumns = "siteID")
                })
public class EmployeeSite {
    @ColumnInfo(name = "employeeId")
    public  int employeeId;

    @ColumnInfo(name = "siteID")
    public  int siteId;

    public EmployeeSite(int employeeId, int siteId) {
        this.employeeId = employeeId;
        this.siteId = siteId;
    }

    public EmployeeSite() {
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getSiteId() {
        return siteId;
    }
}