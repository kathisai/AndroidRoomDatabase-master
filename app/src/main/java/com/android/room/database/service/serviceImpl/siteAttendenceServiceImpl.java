package com.android.room.database.service.serviceImpl;

import android.content.Context;

import com.android.room.database.db.AppDatabase;
import com.android.room.database.db.dao.SiteAttendenceDao;
import com.android.room.database.db.entity.SiteAttedance;
import com.android.room.database.service.SiteAttedanceService;

import java.util.List;

public class siteAttendenceServiceImpl implements SiteAttedanceService {
    private SiteAttendenceDao siteAttendenceDao;

    public siteAttendenceServiceImpl(Context context) {
        siteAttendenceDao = AppDatabase.getInstance(context).siteAttendenceDao();
    }

    @Override
    public List<SiteAttedance> getAll() {
        return siteAttendenceDao.getAll();
    }

    @Override
    public void insertAll(SiteAttedance... siteAttedances) {
        siteAttendenceDao.insertAll(siteAttedances);
    }
}
