package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.AttendanceTypes;

import java.util.List;

@Dao
public interface AttendenceTypesDao {

    @Query("SELECT * FROM buildings")
    List<AttendanceTypes> getAll();

    @Query("SELECT * FROM buildings WHERE siteId IN (:siteID)")
    List<AttendanceTypes> getAllLooUpListbySiteID(int siteID);

    @Insert
    void insertAll(AttendanceTypes... employee);

    @Delete
    void delete(AttendanceTypes employee);
}
