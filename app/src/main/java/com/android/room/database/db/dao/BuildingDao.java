package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.Building;

import java.util.List;

@Dao
public interface BuildingDao {
    @Query("SELECT * FROM building")
    List<Building> getAll();

    @Query("SELECT * FROM building WHERE building_id IN (:buildingId)")
    List<Building> getBuilingByBuldingId(int buildingId);

    @Insert
    void insertAll(Building... buildings);

    @Delete
    void delete(Building building);

    @Query("SELECT * FROM building INNER JOIN UserBuildings ON userbuildings.building_id = building.building_id  WHERE UserBuildings.user_id=:userID"
    )
    List<Building> getBuildingByUserID(int userID);
}
