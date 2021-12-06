package com.example.cernat_robert_fitbit;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {DetaliiProdus.class},version = 1,exportSchema = false)
public abstract class DataBaseProdus extends RoomDatabase {
    public abstract DetaliiProdusDAO detaliiProdusDAO();

}
