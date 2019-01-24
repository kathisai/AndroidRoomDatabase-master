package com.android.room.database.service.serviceImpl;

import android.content.Context;

import com.android.room.database.db.AppDatabase;
import com.android.room.database.db.dao.AttendenceTypesDao;
import com.android.room.database.db.entity.AttendanceTypes;
import com.android.room.database.service.AttendenceTypeService;

import java.util.List;

public class AttendenceTypeServiceImpl implements AttendenceTypeService {
    private AttendenceTypesDao attendenceTypesDao;

    public AttendenceTypeServiceImpl(Context context) {
        attendenceTypesDao = AppDatabase.getInstance(context).attendenceTypesDao();
    }

    @Override
    public List<AttendanceTypes> getAll() {
        return attendenceTypesDao.getAll();
    }

    @Override
    public void insertAll(AttendanceTypes... attendanceTypes) {
        attendenceTypesDao.insertAll(attendanceTypes);
    }

    @Override
    public List<AttendanceTypes> getAttendenceTypes(int siteID) {
        return attendenceTypesDao.findAttendenceTypesBySiteID(siteID);
    }
}
