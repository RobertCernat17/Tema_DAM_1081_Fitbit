package com.example.cernat_robert_fitbit;

public class Produs {
    private String nume;
    private Integer img_id;

    public Produs(String nume, Integer img_id) {
        this.nume = nume;
        this.img_id = img_id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getImg_id() {
        return img_id;
    }

    public void setImg_id(Integer img_id) {
        this.img_id = img_id;
    }

}
