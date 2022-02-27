package com.example.training;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.android.material.tabs.TabLayout;

public class DataHandler extends SQLiteOpenHelper {
    private static final String  database_name="DATA.db";
    private static final String id="ID";
    private static final String table_name="FIRST_TABLE ";
    private static final String  col_name="NAME";
    private static final String  col_age="AGE";
    private static final int  version=1;
    private Context con;

    public DataHandler(@Nullable Context context) {
        super(context, database_name, null, version);
        Log.d("constructor", "constructor tak chal gya");
        con= context;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d("on crete", "oncreate tak chal gya");

        String Query = "CREATE TABLE " + table_name + " ( "
                + id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + col_name + " TEXT, "
                + col_age + " INTEGER )";
        sqLiteDatabase.execSQL(Query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
     String query=" DROP TABLE IF EXISTS " + table_name;
     sqLiteDatabase.execSQL(query);
     onCreate(sqLiteDatabase);
    }

    public void persist(database.Data data) {
        Log.d("persist", "persister tak chal gya");

        SQLiteDatabase ndata = getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("NAME",data.getName());
        values.put("AGE",data.getAge());
        try{
            ndata.insert(table_name, null, values);
            Toast.makeText(con,"insert success",Toast.LENGTH_LONG).show();
        }
        catch (SQLException e){
            Toast.makeText(con,"insert fail",Toast.LENGTH_LONG).show();
            Log.e("insert",""+e.getMessage());
        }
    }
}
