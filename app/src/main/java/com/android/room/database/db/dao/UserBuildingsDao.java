package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.UserBuildings;

import java.util.List;

@Dao
public interface UserBuildingsDao {
    @Query("SELECT * FROM userbuildings")
    List<UserBuildings> getAll();

    @Query("SELECT * FROM userbuildings WHERE user_id IN (:userID)")
    List<UserBuildings> getAllUserBuildingsByUserID(int userID);

    @Insert
    void insertAll(UserBuildings... userBuildings);

    @Delete
    void delete(UserBuildings userBuildings);
}
