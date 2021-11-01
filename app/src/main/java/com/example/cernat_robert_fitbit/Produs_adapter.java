package com.example.cernat_robert_fitbit;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Produs_adapter extends BaseAdapter {
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Produs getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        @SuppressLint("ViewHolder") View item_view=inflater.inflate(R.layout.produse,parent,false);
        TextView t_nume=item_view.findViewById(R.id.id_prod);
        ImageView img=item_view.findViewById(R.id.img_prod);
        Produs prd=lista.get(position);
        t_nume.setText(prd.getNume());
        img.setImageResource(prd.getImg_id());

        return item_view;
    }
    private List<Produs> lista;

    public Produs_adapter(List<Produs> lista) {
        this.lista = lista;
    }

}
