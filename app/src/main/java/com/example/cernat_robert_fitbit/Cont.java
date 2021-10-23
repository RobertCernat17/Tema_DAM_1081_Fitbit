package com.example.cernat_robert_fitbit;

import java.io.Serializable;

public class Cont implements Serializable {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cont() {
        this.email="";
        this.password="";
    }
}
