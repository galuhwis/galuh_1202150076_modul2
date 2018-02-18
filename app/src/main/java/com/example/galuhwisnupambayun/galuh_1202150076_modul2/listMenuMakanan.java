package com.example.galuhwisnupambayun.galuh_1202150076_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class listMenuMakanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    private String[] Judul = {"Nasi Gokil Upnormal", "Nasi Tanggal Tua","Nasi Lenggang Kikil","Nasi Tongkol Balado","Nasi Ayam Penyet Gak Nyante Pedesnya","Nasi Ayam Siram Saos Telur Asin",
            "Nasi Jengkol Balado Upnormal","Nasi Wagyu Masak Cabai Hijau","Nasi Wagyu Saus Mentega","Nasi Wagyu Saus Mushroom"};
    private String[] test = {"Rp. 30.000", "Rp. 20.000","Rp. 15.000","Rp. 20.000","Rp. 15.000","Rp. 20.000","Rp. 15.000","Rp. 15.000",
    "Rp. 15.000","Rp. 15.000"};
    private int[] Gambar = {R.drawable.nasigokil, R.drawable.nasitanggaltua,R.drawable.nasilenggang,R.drawable.nasitongkol,R.drawable.nasiayampenyet,
    R.drawable.nasiayamsaustelur,R.drawable.nasijengkol,R.drawable.nasiwagyuhijau,R.drawable.nasiwagyumentega,R.drawable.nasiwagyumushroom};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmenumakanan);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_list);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("List Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu,dataHarga,gambar);
        rvView.setAdapter(adapter);

    }

    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }
    }
}
