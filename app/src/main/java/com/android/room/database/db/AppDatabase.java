package com.android.room.database.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.android.room.database.db.dao.EmployeeDao;
import com.android.room.database.db.dao.SiteDao;
import com.android.room.database.db.entity.Employee;
import com.android.room.database.db.entity.Site;

@Database(entities = {Employee.class, Site.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase appDatabase = null;

    /**
     * from developers android, made my own singleton
     *
     * @param context
     * @return
     */
    public static AppDatabase getInstance(Context context) {
        if (appDatabase == null) {
            appDatabase = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "database-name")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return appDatabase;
    }

    public abstract EmployeeDao userDao();

    public abstract SiteDao siteDao();


}