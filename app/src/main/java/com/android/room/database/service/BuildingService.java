package com.android.room.database.service;

import com.android.room.database.db.entity.Buildings;
import com.android.room.database.db.models.LookupList;

import java.util.List;

public interface BuildingService {

    List<Buildings> getAll();

    void insertAll(Buildings... employees);

    List<LookupList> getAllLooUpListbySiteID(int siteID);
}
