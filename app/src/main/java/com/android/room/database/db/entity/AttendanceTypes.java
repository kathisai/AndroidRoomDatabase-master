package com.android.room.database.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.android.room.database.db.models.Reasons;

import java.util.List;

@Entity
public class AttendanceTypes {

    @PrimaryKey
    int attendanceid;
    String name;
    List<Reasons> reasons;

}