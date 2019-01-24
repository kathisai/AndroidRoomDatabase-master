package com.android.room.database.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity
        (foreignKeys = @ForeignKey(entity = AttendanceTypes.class,
                parentColumns = "attendanceid",
                childColumns = "attendanceid",
                onDelete = CASCADE,
                onUpdate = CASCADE))
public class SiteAttedance {

    @PrimaryKey
    @ColumnInfo(name = "attendanceid")
    public int attendanceid;

    public int siteId;

    public SiteAttedance(int attendanceid, int siteId) {
        this.attendanceid = attendanceid;
        this.siteId = siteId;
    }
}