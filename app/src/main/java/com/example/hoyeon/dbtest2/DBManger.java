package com.example.hoyeon.dbtest2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hoyeon on 2016-09-01.
 */
public class DBManger extends SQLiteOpenHelper {


    public DBManger(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE DBTEST1(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,  age INTEGER, )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }




}
