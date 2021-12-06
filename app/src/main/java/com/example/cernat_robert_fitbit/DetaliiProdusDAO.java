package com.example.cernat_robert_fitbit;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DetaliiProdusDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(DetaliiProdus...detaliiProdus);

    @Delete
    void delete(DetaliiProdus detaliiProdus);

    @Query("Select * from detaliiprodus")
    public List<DetaliiProdus>getAll();

}
