package com.example.kamonwan.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UserTABLE {
    private static final String TABLE_USER = "userTABLE";
    private static final String COLUMN_ID_USER = "_id";
    private static final String COLUMN_USER = "User";
    private static final String COLUMN_PASSWORD = "Password";
    private static final String COLUMN_OFFICER = "Officer";

    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSQLite, readSQLite;
    // Constructor
    public UserTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSQLite = objMyOpenHelper.getWritableDatabase();
        readSQLite = objMyOpenHelper.getReadableDatabase();
    }

    public long addValueToUser(String strUser, String strPassword, String strOfficer) {

        // ตัวกลางในการเชื่อมตัว DB
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_USER,strUser);
        objContentValues.put(COLUMN_PASSWORD, strPassword);
        objContentValues.put(COLUMN_OFFICER, strOfficer);
        return writeSQLite.insert(TABLE_USER,null,objContentValues);
    }
}
