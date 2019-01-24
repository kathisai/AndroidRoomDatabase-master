package com.android.room.database.service.serviceImpl;

import android.content.Context;

import com.android.room.database.db.AppDatabase;
import com.android.room.database.db.dao.BuildingsDao;
import com.android.room.database.db.entity.Buildings;
import com.android.room.database.db.models.LookupList;
import com.android.room.database.service.BuildingService;

import java.util.ArrayList;
import java.util.List;

public class BuildingsServiceImpl implements BuildingService {

    private BuildingsDao buildingsDao;

    public BuildingsServiceImpl(Context context) {
        buildingsDao = AppDatabase.getInstance(context).buildingsDao();
    }

    @Override
    public List<Buildings> getAll() {
        return buildingsDao.getAll();
    }

    @Override
    public void insertAll(Buildings... employees) {
        buildingsDao.insertAll(employees);
    }

    @Override
    public List<LookupList> getAllLooUpListbySiteID(int siteID) {
        List<LookupList> lookupLists = new ArrayList<>();
        for (Buildings eachone : buildingsDao.getAllLooUpListbySiteID(siteID)) {
            lookupLists.add(eachone.lookupList);
        }
        return lookupLists;
    }
}
