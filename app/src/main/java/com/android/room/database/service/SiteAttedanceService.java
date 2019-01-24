package com.android.room.database.service;

import com.android.room.database.db.entity.SiteAttedance;

import java.util.List;

public interface SiteAttedanceService {

    List<SiteAttedance> getAll();

    void insertAll(SiteAttedance... siteAttedances);
}
