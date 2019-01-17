package com.android.room.database.service;

import com.android.room.database.db.entity.Employee;
import com.android.room.database.db.entity.Site;

import java.util.List;

public interface SiteService {

    List<Site> getAll();

    void insertAll(Site... sites);
}
