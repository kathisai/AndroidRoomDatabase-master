package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.Site;

import java.util.List;

@Dao
public interface SiteDao {


    @Insert
    void insertAll(Site... sites);

    @Query("SELECT * FROM site")
    List<Site> getAll();

    @Delete
    void delete(Site site);

    @Query("SELECT * FROM site WHERE siteID=:siteID")
    List<Site> findRepositoriesForUser(final int siteID);


}
