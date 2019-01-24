package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.AttendanceTypes;

import java.util.List;

@Dao
public interface AttendenceTypesDao {

    @Query("SELECT * FROM attendancetypes")
    List<AttendanceTypes> getAll();

    @Query("SELECT * FROM attendancetypes WHERE attendanceid IN (:attendeceID)")
    List<AttendanceTypes> getAllLooUpListbySiteID(int attendeceID);

    @Insert
    void insertAll(AttendanceTypes... employee);

    @Delete
    void delete(AttendanceTypes employee);

    @Query("SELECT * FROM AttendanceTypes INNER JOIN SiteAttedance ON siteattedance.attendanceid = AttendanceTypes.attendanceid  WHERE SiteAttedance.siteID=:siteID"
    )
    List<AttendanceTypes> findAttendenceTypesBySiteID(int siteID);
}
