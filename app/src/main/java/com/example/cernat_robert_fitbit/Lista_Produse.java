package com.example.cernat_robert_fitbit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Lista_Produse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produse);

        ListView lista = findViewById(R.id.list_view);
        List<Produs>produse=get_produse();
        Produs_adapter prd_adapter = new Produs_adapter(produse);
        lista.setAdapter(prd_adapter);
        lista.setVisibility(View.VISIBLE);
        Button btn_add_JSON = findViewById(R.id.btn_add_JSON);
        btn_add_JSON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("salut","ceva");
                CitesteJSON citeste = new CitesteJSON();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        citeste.reader("https://jsonkeeper.com/b/4VHA", new IResponse() {

                            @Override
                            public void on_succes(List<Produs> produse_json) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        produse.addAll(produse_json);
                                        Produs_adapter produs_adapter=new Produs_adapter(produse);
                                        lista.setAdapter(produs_adapter);
                                        Toast.makeText(Lista_Produse.this,"Adaugat cu succes",Toast.LENGTH_LONG).show();
                                    }
                                });
                            }

                            @Override
                            public void on_error(String mesaj) {
                                //Toast.makeText(Lista_Produse.this,mesaj,Toast.LENGTH_LONG).show();
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(Lista_Produse.this, mesaj, Toast.LENGTH_LONG).show();
                                    }
                                });
                            }
                        });


                    }
                });
                thread.start();
            }
        });

    }

    private List<Produs> get_produse() {
        List<Produs> lista = new ArrayList<>();
        lista.add(new Produs("Ace 3 Black ", String.valueOf(R.drawable.ace3_black_device3qt)));
        Log.d("buna",String.valueOf(R.drawable.ace3_black_device3qt));
        lista.add(new Produs("Ace 3 Minions Black ", String.valueOf(R.drawable.ace3_minions_black_dramatic)));
        lista.add(new Produs("Ace 3 Minions Yellow ", String.valueOf(R.drawable.ace3_minions_yellow_device_3qt)));
        lista.add(new Produs("Black Sport Dramatic ", String.valueOf(R.drawable.black_sport_dramatic)));
        lista.add(new Produs("Charge 4 SE Granit ", String.valueOf(R.drawable.charge4_se_granite_device_3qt)));
        lista.add(new Produs("Charge 5 Black ", String.valueOf(R.drawable.charge5_black_device_3qtr)));
        lista.add(new Produs("Charge 5 Blackcherry ", String.valueOf(R.drawable.charge5_blackcherry_sport_device_dramatic)));
        lista.add(new Produs("Charge 5 Classic ", String.valueOf(R.drawable.charge5_classic_black_dramatic)));
        lista.add(new Produs("Charge 5 Costalblue ", String.valueOf(R.drawable.charge5_coastalblue_device_dramatic)));
        lista.add(new Produs("Charge 5 Plum Leather ", String.valueOf(R.drawable.charge5_plum_leather_device_dramatic)));
        lista.add(new Produs("Classic Black Dramatic ", String.valueOf(R.drawable.classic_black_dramatic)));
        lista.add(new Produs("Inspire 2 Clip Black ", String.valueOf(R.drawable.inspire2_clip_black_front)));
        lista.add(new Produs("Inspire 2 Stainless Steel ", String.valueOf(R.drawable.inspire2_stainless_steel_mesh_rose_gold_dramatic)));
        lista.add(new Produs("Inspire Bloom Dramatic ", String.valueOf(R.drawable.inspire_bloom_dramatic)));
        lista.add(new Produs("Inspire Double Leather ", String.valueOf(R.drawable.inspire_double_leather_black_3qtr)));
        lista.add(new Produs("Ionic Midnight Blue ", String.valueOf(R.drawable.ionic_midnight_blue_leather_dramatic)));
        lista.add(new Produs("Luxe Gorjana Soft Gold ", String.valueOf(R.drawable.luxe_gorjana_soft_gold_dramatic)));
        lista.add(new Produs("Luxe Classic Lunar White ", String.valueOf(R.drawable.luxe_classic_lunar_white_dramatic)));
        lista.add(new Produs("Luxe Lunar White ", String.valueOf(R.drawable.luxe_lunar_white_device_3qtr)));
        lista.add(new Produs("Luxe Metal Mesh ", String.valueOf(R.drawable.luxe_metal_mesh_platinum_dramatic)));
        lista.add(new Produs("Luxe SE Gorjana ", String.valueOf(R.drawable.luxe_se_gorjana_device_3qtr)));
        lista.add(new Produs("Luxe Woven Slate ", String.valueOf(R.drawable.luxe_woven_slate_dramatic)));
        lista.add(new Produs("Versa 3 ", String.valueOf(R.drawable.prod0)));
        lista.add(new Produs("Proxima Black ", String.valueOf(R.drawable.proxima_black_device_3qt)));
        lista.add(new Produs("Sense Sage Gray ", String.valueOf(R.drawable.sense_sage_gray_device_3qt)));
        lista.add(new Produs("Versa 2 3QTR ", String.valueOf(R.drawable.versa2_3qtr_black)));
        lista.add(new Produs("Versa 3 Sense Black Scrunchie ", String.valueOf(R.drawable.versa3_sense_bv_black_scrunchie_dramatic)));
        lista.add(new Produs("Versa 3 Sense Leather ", String.valueOf(R.drawable.versa3_sense_leather_perforated_slate_dramatic)));
        lista.add(new Produs("Versa 3 Sense Sport Frost ", String.valueOf(R.drawable.versa3_sense_sport_frost_white_dramatic)));
        lista.add(new Produs("Versa 3 Sense Vegan ", String.valueOf(R.drawable.versa3_sense_vegan_seaglass_dramatic)));
        lista.add(new Produs("Versa 3 Sense Victor ", String.valueOf(R.drawable.versa3_sense_victor_glemaud_metallic_ombre_dramatic)));
        lista.add(new Produs("Versa 3 Black Grey Woven ", String.valueOf(R.drawable.versa_black_grey_woven_dramatic)));
        lista.add(new Produs("Woven Rosewood Dramatic ", String.valueOf(R.drawable.woven_rosewood_dramatic)));
        return lista;

    }
}