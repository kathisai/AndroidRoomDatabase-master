package com.android.room.database.service;

import com.android.room.database.db.entity.Site;

import java.util.List;

public interface SiteServiceService {

    List<Site> getAll();

    void insertAll(Site... sites);
}
