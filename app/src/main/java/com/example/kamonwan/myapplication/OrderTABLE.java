package com.example.kamonwan.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class OrderTABLE {

    public static final String TABLE_ORDER = "orderTABLE";
    public static final String COLUMN_ID_ORDER = "_id";
    public static final String COLUMN_Officer = "Officer";
    public static final String COLUMN_DATE = "Date";
    public static final String COLUMN_ORDERS = "Orders";
    public static final String COLUMN_ITEM = "Item";


    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSQLite, readSQLite;

    // Constructor
    public OrderTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSQLite = objMyOpenHelper.getWritableDatabase();
        readSQLite = objMyOpenHelper.getReadableDatabase();
    }

    public long addValueToOrder(String strOfficer, String strDate, String strOrders, int intItem) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_Officer, strOfficer);
        objContentValues.put(COLUMN_DATE, strDate);
        objContentValues.put(COLUMN_ORDERS, strOrders);
        objContentValues.put(COLUMN_ITEM,intItem);
        return writeSQLite.insert(TABLE_ORDER, null, objContentValues);
    }
}
