package com.android.room.database.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;

import com.android.room.database.db.converterss.LookupListConverter;
import com.android.room.database.db.models.LookupList;

@Entity
public class Buildings {

    public int siteId;

    @TypeConverters({LookupListConverter.class})
    @PrimaryKey
    @NonNull
    public LookupList lookupList;

    public Buildings(int siteId, LookupList lookupList) {
        this.siteId = siteId;
        this.lookupList = lookupList;
    }
}