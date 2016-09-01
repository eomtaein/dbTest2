package com.example.hoyeon.dbtest2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hoyeon on 2016-09-01.
 */
public class DBManger extends SQLiteOpenHelper {

    private DBManger dbManger;


    public DBManger(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE PHONE(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,  age INTEGER, phone INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insert(String id){
        SQLiteDatabase db = getWritableDatabase();
        dbManger.insert("insert into PHONE values(null, name, age, phone);");


    }




}
