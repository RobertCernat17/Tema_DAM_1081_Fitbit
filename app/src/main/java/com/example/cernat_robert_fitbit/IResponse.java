package com.example.cernat_robert_fitbit;

import java.util.List;

public interface IResponse {
    void on_succes(List<Produs>produse);
    void on_error(String mesaj);
}
