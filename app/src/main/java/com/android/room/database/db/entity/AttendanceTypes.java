package com.android.room.database.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.android.room.database.db.converterss.ReasonsListConverter;
import com.android.room.database.db.models.Reasons;

import java.util.List;

@Entity
public class AttendanceTypes {

    @PrimaryKey
    public int attendanceid;

    public String name;

    @TypeConverters({ReasonsListConverter.class})
    public List<Reasons> reasons;

    public AttendanceTypes(int attendanceid, String name, List<Reasons> reasons) {
        this.attendanceid = attendanceid;
        this.name = name;
        this.reasons = reasons;
    }
}