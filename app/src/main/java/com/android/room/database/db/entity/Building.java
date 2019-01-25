package com.android.room.database.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "building")

public class Building {

    @ColumnInfo(name = "building_id")
    @PrimaryKey
    @SerializedName("Key")

    private int buildingId;


    @ColumnInfo(name = "name")

    @SerializedName("Value")

    private String name;


    @ColumnInfo(name = "client_id")

    private int clientId;


    @ColumnInfo(name = "site_id")

    private int siteId;


    public Building(int buildingId, String name, int clientId, int siteId) {

        this.buildingId = buildingId;

        this.name = name;

        this.clientId = clientId;

        this.siteId = siteId;

    }


    public Building() {

        buildingId = 0;

        name = null;

        clientId = 0;

        siteId = 0;

    }


    public int getKey() {

        return buildingId;

    }


    public int getBuildingId() {

        return buildingId;

    }


    public void setBuildingId(int id) {

        buildingId = id;

    }


    public String getValue() {

        return name;

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public int getClientId() {

        return clientId;

    }


    public void setClientId(int clientId) {

        this.clientId = clientId;

    }


    public int getSiteId() {

        return siteId;

    }


    public void setSiteId(int siteId) {

        this.siteId = siteId;

    }

}


