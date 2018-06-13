package com.example.kamonwan.myapplication;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Main Class
public class MyOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Restaurant.db";
    private static final int DATABASE_VERSION = 1;
    private static final String USER_TABLE = "create table userTABLE (_id integer primary key, " + " User text, Password text, Officer text);";
    private static final String ORDER_TABLE = "create table orderTABLE (_id integer primary key, " + " Officer text, Date text, Orders text, Item integer);";

    // constructor
    public MyOpenHelper(Context context) {
        // Connect database and check database name
        // if not create database
        // if check database version equal database version start ?
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // create database
        db.execSQL(USER_TABLE);
        db.execSQL(ORDER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
