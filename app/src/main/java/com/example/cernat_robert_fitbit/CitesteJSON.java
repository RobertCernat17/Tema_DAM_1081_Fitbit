package com.example.cernat_robert_fitbit;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CitesteJSON {
    public void reader(String CaleURL,IResponse raspuns)
    {
        try{
            URL url=new URL(CaleURL);
            HttpURLConnection conexiune= (HttpURLConnection) url.openConnection();
            InputStream input=conexiune.getInputStream();
            InputStreamReader inputreader=new InputStreamReader(input);
            BufferedReader b_reader=new BufferedReader(inputreader);
            StringBuilder rezultat=new StringBuilder();
            String linie="";
            while((linie=b_reader.readLine())!=null)
            {
                rezultat.append(linie);
            }
            Log.v("rez",rezultat.toString());
            b_reader.close();
            inputreader.close();
            input.close();
            List<Produs>lista=parsare(rezultat.toString());

            raspuns.on_succes(lista);
        } catch (IOException | JSONException e) {
            raspuns.on_error(e.getMessage());
            e.printStackTrace();
        }
    }
    private List<Produs> parsare(String JsonString) throws JSONException {
        List<Produs>lista=new ArrayList<>();
        JSONObject jsonObject=new JSONObject(JsonString);
        JSONArray jsonArray=jsonObject.getJSONArray("produse");
        for(int i=0;i<jsonArray.length();i++)
        {
            JSONObject obiect_curent=jsonArray.getJSONObject(i);
            String nume=obiect_curent.getString("nume");
            String img_id=obiect_curent.getString("img_id");
            Produs p1=new Produs(nume,img_id);
            Log.d("salut",p1.toString());
            lista.add(p1);
        }
        return lista;

    }
}
