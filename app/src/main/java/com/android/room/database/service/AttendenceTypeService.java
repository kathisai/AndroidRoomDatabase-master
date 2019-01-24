package com.android.room.database.service;


import com.android.room.database.db.entity.AttendanceTypes;

import java.util.List;

public interface AttendenceTypeService {
    List<AttendanceTypes> getAll();

    void insertAll(AttendanceTypes... employees);

    List<AttendanceTypes> getAttendenceTypes(int siteID);
}
