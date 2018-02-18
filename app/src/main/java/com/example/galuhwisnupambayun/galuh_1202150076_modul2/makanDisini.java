package com.example.galuhwisnupambayun.galuh_1202150076_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class makanDisini extends AppCompatActivity {

    private TextInputLayout a,b;
    private Spinner c;
    String mSpinnerlabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makandisini);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_dinein);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Dine In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        c = (Spinner) findViewById(R.id.nomeja);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (c != null){
            c.setAdapter(adapter);
        }

    }

    public void pilihpesanan(View view) {

        a = (TextInputLayout) findViewById(R.id.nama);

        String test = c.getSelectedItem().toString();

        if (a ==null){
            Toast.makeText(this,"Isi dulu bro",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 1",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 2",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 3",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 4",Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 5",Toast.LENGTH_LONG).show();
        }


        Intent a = new Intent(makanDisini.this,listMenuMakanan.class);
        startActivity(a);

    }
}
