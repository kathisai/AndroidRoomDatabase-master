package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.Buildings;

import java.util.List;

@Dao
public interface BuildingsDao {
    @Query("SELECT * FROM buildings")
    List<Buildings> getAll();

    @Query("SELECT * FROM buildings WHERE siteId IN (:siteID)")
    List<Buildings> getAllLooUpListbySiteID(int siteID);

    @Insert
    void insertAll(Buildings... employee);

    @Delete
    void delete(Buildings employee);
}
