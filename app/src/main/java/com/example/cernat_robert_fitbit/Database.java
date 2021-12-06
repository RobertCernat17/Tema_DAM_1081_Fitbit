package com.example.cernat_robert_fitbit;

import android.content.Context;
import androidx.room.*;
public class Database {
    private static Database database;
    private DataBaseProdus dataBaseProdus;
    Database(Context context)
    {


        dataBaseProdus= Room.databaseBuilder(context,DataBaseProdus.class,"produs-database").build();


    }
    public static Database getInstance(Context context){
        if(database==null)
        {
            database=new Database(context);
        }
        return database;
    }
    public DataBaseProdus getDataBase(){

        return dataBaseProdus;
    }
}
