package com.android.room.database.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class SiteAttedance {
    
    @PrimaryKey
    int attendanceid;

    int siteId;

}