package com.android.room.database.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity

        (foreignKeys = @ForeignKey(entity = Building.class,

                parentColumns = "building_id",

                childColumns = "building_id",

                onDelete = CASCADE,

                onUpdate = CASCADE))

public class UserBuildings {


    @PrimaryKey

    @ColumnInfo(name = "building_id")

    @Nullable

    private int buildId;


    @ColumnInfo(name = "user_id")

    private int userId;


    public UserBuildings(int buildId, int userId) {

        this.buildId = buildId;

        this.userId = userId;

    }

    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}


