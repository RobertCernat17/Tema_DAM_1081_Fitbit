package com.example.cernat_robert_fitbit;

public class Produs {
    private String nume;
    private String img_id;

    public Produs(String nume, String img_id) {
        this.nume = nume;
        this.img_id = img_id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getImg_id() {
        return img_id;
    }

    public void setImg_id(String img_id) {
        this.img_id = img_id;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", img_id='" + img_id + '\'' +
                '}';
    }
}
