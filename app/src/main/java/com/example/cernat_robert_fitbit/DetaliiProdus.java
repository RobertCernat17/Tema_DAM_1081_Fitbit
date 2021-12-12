package com.example.cernat_robert_fitbit;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "detaliiprodus")
public class DetaliiProdus {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "denumire")
    String denumire;
    @ColumnInfo(name = "tip")
    String tip;
    @ColumnInfo(name = "pret")
    Double pret;
    @ColumnInfo(name = "dimensiuni")
    String dimensiuni;
    @ColumnInfo(name = "culoare")
    String culoare;
    @ColumnInfo(name = "baterie")
    double baterie;

    public DetaliiProdus(String denumire, String tip, Double pret, String dimensiuni, String culoare, double  baterie) {

        this.denumire = denumire;
        this.tip = tip;
        this.pret = pret;
        this.dimensiuni = dimensiuni;
        this.culoare = culoare;
        this.baterie = baterie;
    }

    public DetaliiProdus() {

        this.denumire ="";
        this.tip = "";
        this.pret = 0.0;
        this.dimensiuni = "";
        this.culoare = "";
        this.baterie = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public String getDimensiuni() {
        return dimensiuni;
    }

    public void setDimensiuni(String dimensiuni) {
        this.dimensiuni = dimensiuni;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getBaterie() {
        return baterie;
    }

    public void setBaterie(double baterie) {
        this.baterie = baterie;
    }

    @NonNull
    @Override
    public String toString() {
        return "DetaliiProdus{" +
                "denumire='" + denumire + '\'' +
                ", tip='" + tip + '\'' +
                ", pret='" + pret + '\'' +
                ", dimensiuni='" + dimensiuni + '\'' +
                ", culoare='" + culoare + '\'' +
                ", baterie=" + baterie +
                '}';
    }
}

