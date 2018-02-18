package com.example.galuhwisnupambayun.galuh_1202150076_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class dibawaPulang extends AppCompatActivity {

    private TextInputLayout a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dibawapulang);

        a = (TextInputLayout) findViewById(R.id.nama);
        b = (TextInputLayout) findViewById(R.id.phone);
        c = (TextInputLayout) findViewById(R.id.alamat);
        d = (TextInputLayout) findViewById(R.id.catatan);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_take);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Take Away");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public void pilihpesan(View view) {

       String nama = a.getEditText().getText().toString();
       String telepon = b.getEditText().getText().toString();
       String alamat = c.getEditText().getText().toString();
       String catatan = d.getEditText().getText().toString();

        if (nama.isEmpty()|| telepon.isEmpty() || alamat.isEmpty() || catatan.isEmpty()){
            Toast.makeText(this,"Isi dulu bro",Toast.LENGTH_LONG).show();
        }

        Intent c = new Intent(dibawaPulang.this,listMenuMakanan.class);
        startActivity(c);
    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {

        a = (TextInputLayout) findViewById(R.id.nama);
        b = (TextInputLayout) findViewById(R.id.phone);

        String nama = a.getEditText().getText().toString();
        String telepon = b.getEditText().getText().toString();

        if (nama.isEmpty() || telepon.isEmpty()) {
            Toast.makeText(this, "Isi dulu bro", Toast.LENGTH_LONG).show();
        } else {

            String month_string = Integer.toString(month + 1);
            String day_string = Integer.toString(day);
            String year_string = Integer.toString(year);
            String dateMessage = (month_string + "/" + day_string + "/" + year_string);
            Toast.makeText(this, "Atas Nama : " + nama + "\n No Telepon : " + telepon + "\n Akan Mengambil pada : " + getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
        }
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        String nama = a.getEditText().getText().toString();
        String telepon = b.getEditText().getText().toString();

        if (nama.isEmpty() || telepon.isEmpty()) {
            Toast.makeText(this, "Isi dulu bro", Toast.LENGTH_LONG).show();
        } else {


            String hour_string = Integer.toString(hourOfDay);
            String minute_string = Integer.toString(minute);
            String timeMessage = (hour_string + ":" + minute_string);
            Toast.makeText(this, "Atas Nama : " + nama + "\n No Telepon : " + telepon + "\n Akan Mengambil pada : " + getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show();
        }
    }

}
