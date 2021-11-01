package com.example.cernat_robert_fitbit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Lista_Produse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produse);
       // Toast.makeText(Lista_Produse.this,"salut",Toast.LENGTH_LONG).show();
        ListView lista = findViewById(R.id.list_view);
        Produs_adapter prd_adapter = new Produs_adapter(get_produse());
        lista.setAdapter(prd_adapter);
        lista.setVisibility(View.VISIBLE);

//        if (lista.getVisibility()!=View.VISIBLE)
//            Toast.makeText(Lista_Produse.this,"Este vizibila",Toast.LENGTH_LONG).show();
//        else
//            Toast.makeText(Lista_Produse.this,"Nu Este vizibila",Toast.LENGTH_LONG).show();
    }

    private List<Produs> get_produse()
    {
        List<Produs>lista=new ArrayList<>();
        lista.add(new Produs("Ace 3 Black ",R.drawable.ace3_black_device3qt));
        lista.add(new Produs("Ace 3 Minions Black ",R.drawable.ace3_minions_black_dramatic));
        lista.add(new Produs("Ace 3 Minions Yellow ",R.drawable.ace3_minions_yellow_device_3qt));
        lista.add(new Produs("Black Sport Dramatic ",R.drawable.black_sport_dramatic));
        lista.add(new Produs("Charge 4 SE Granit ",R.drawable.charge4_se_granite_device_3qt));
        lista.add(new Produs("Charge 5 Black ",R.drawable.charge5_black_device_3qtr));
        lista.add(new Produs("Charge 5 Blackcherry ",R.drawable.charge5_blackcherry_sport_device_dramatic));
        lista.add(new Produs("Charge 5 Classic ",R.drawable.charge5_classic_black_dramatic));
        lista.add(new Produs("Charge 5 Costalblue ",R.drawable.charge5_coastalblue_device_dramatic));
        lista.add(new Produs("Charge 5 Plum Leather ",R.drawable.charge5_plum_leather_device_dramatic));
        lista.add(new Produs("Classic Black Dramatic ",R.drawable.classic_black_dramatic));
        lista.add(new Produs("Inspire 2 Clip Black ",R.drawable.inspire2_clip_black_front));
        lista.add(new Produs("Inspire 2 Stainless Steel ",R.drawable.inspire2_stainless_steel_mesh_rose_gold_dramatic));
        lista.add(new Produs("Inspire Bloom Dramatic ",R.drawable.inspire_bloom_dramatic));
        lista.add(new Produs("Inspire Double Leather ",R.drawable.inspire_double_leather_black_3qtr));
        lista.add(new Produs("Ionic Midnight Blue ",R.drawable.ionic_midnight_blue_leather_dramatic));
        lista.add(new Produs("Luxe Gorjana Soft Gold ",R.drawable.luxe_gorjana_soft_gold_dramatic));
        lista.add(new Produs("Luxe Classic Lunar White ",R.drawable.luxe_classic_lunar_white_dramatic));
        lista.add(new Produs("Luxe Lunar White ",R.drawable.luxe_lunar_white_device_3qtr));
        lista.add(new Produs("Luxe Metal Mesh ",R.drawable.luxe_metal_mesh_platinum_dramatic));
        lista.add(new Produs("Luxe SE Gorjana ",R.drawable.luxe_se_gorjana_device_3qtr));
        lista.add(new Produs("Luxe Woven Slate ",R.drawable.luxe_woven_slate_dramatic));
        lista.add(new Produs("Versa 3 ",R.drawable.prod0));
        lista.add(new Produs("Proxima Black ",R.drawable.proxima_black_device_3qt));
        lista.add(new Produs("Sense Sage Gray ",R.drawable.sense_sage_gray_device_3qt));
        lista.add(new Produs("Versa 2 3QTR ",R.drawable.versa2_3qtr_black));
        lista.add(new Produs("Versa 3 Sense Black Scrunchie ",R.drawable.versa3_sense_bv_black_scrunchie_dramatic));
        lista.add(new Produs("Versa 3 Sense Leather ",R.drawable.versa3_sense_leather_perforated_slate_dramatic));
        lista.add(new Produs("Versa 3 Sense Sport Frost ",R.drawable.versa3_sense_sport_frost_white_dramatic));
        lista.add(new Produs("Versa 3 Sense Vegan ",R.drawable.versa3_sense_vegan_seaglass_dramatic));
        lista.add(new Produs("Versa 3 Sense Victor ",R.drawable.versa3_sense_victor_glemaud_metallic_ombre_dramatic));
        lista.add(new Produs("Versa 3 Black Grey Woven ",R.drawable.versa_black_grey_woven_dramatic));
        lista.add(new Produs("Woven Rosewood Dramatic ",R.drawable.woven_rosewood_dramatic));
        return lista;

    }
}