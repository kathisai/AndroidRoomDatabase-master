package com.android.room.database.db.converterss;

import android.arch.persistence.room.TypeConverter;

import com.android.room.database.db.models.Reasons;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class ReasonsListConverter {

    @TypeConverter

    public static List<Reasons> fromString(String value) {

        Type listType = new TypeToken<List<Reasons>>() {
        }.getType();

        return new Gson().fromJson(value, listType);

    }

    @TypeConverter

    public static String fromArrayLisr(List<Reasons> list) {

        Gson gson = new Gson();

        String json = gson.toJson(list);

        return json;

    }
}
