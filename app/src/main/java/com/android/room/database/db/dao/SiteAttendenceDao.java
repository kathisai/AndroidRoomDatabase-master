package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.SiteAttedance;

import java.util.List;

@Dao
public interface SiteAttendenceDao {

    @Query("SELECT * FROM siteattedance")
    List<SiteAttedance> getAll();

    @Query("SELECT * FROM siteattedance WHERE siteId IN (:siteID)")
    List<SiteAttedance> getAllLooUpListbySiteID(int siteID);

    @Insert
    void insertAll(SiteAttedance... siteAttedances);

    @Delete
    void delete(SiteAttedance siteAttedance);
}
