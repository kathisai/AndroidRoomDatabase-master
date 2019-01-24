package com.android.room.database.db.converterss;

import android.arch.persistence.room.TypeConverter;

import com.android.room.database.db.models.LookupList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class LookupListConverter {
    @TypeConverter

    public static LookupList fromString(String value) {

        Type listType = new TypeToken<LookupList>() {
        }.getType();

        return new Gson().fromJson(value, listType);

    }

    @TypeConverter

    public static String fromArrayLisr(LookupList list) {

        Gson gson = new Gson();

        String json = gson.toJson(list);

        return json;

    }
}
