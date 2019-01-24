package com.android.room.database.service.serviceImpl;

import android.content.Context;

import com.android.room.database.db.AppDatabase;
import com.android.room.database.db.dao.SiteDao;
import com.android.room.database.db.entity.Site;
import com.android.room.database.service.SiteServiceService;

import java.util.List;

public class SiteServiceImpl implements SiteServiceService {

    private SiteDao siteDao;

    public SiteServiceImpl(Context context) {
        siteDao = AppDatabase.getInstance(context).siteDao();
    }
    @Override
    public List<Site> getAll() {
        return siteDao.getAll();
    }

    @Override
    public void insertAll(Site... sites) {
        siteDao.insertAll(sites);
    }
}
