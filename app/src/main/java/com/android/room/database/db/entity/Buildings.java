package com.android.room.database.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.android.room.database.db.models.LookupList;

@Entity
public class Buildings {

    int siteId;
    @PrimaryKey
    LookupList lookupList;

}