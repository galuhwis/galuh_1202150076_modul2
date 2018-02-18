package com.example.galuhwisnupambayun.galuh_1202150076_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button a ;
    private RadioGroup b;
    private RadioButton c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbarmain);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Warunk Upnormal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        a = (Button) findViewById(R.id.pesan);

        b = (RadioGroup) findViewById(R.id.pilihmenu);

        c = (RadioButton) findViewById(R.id.dine);

        d = (RadioButton) findViewById(R.id.take);



    }

    public void pesan(View view) {

        b = (RadioGroup) findViewById(R.id.pilihmenu);

        c = (RadioButton) findViewById(R.id.dine);

        d = (RadioButton) findViewById(R.id.take);

    }

    public void pilih(View view) {

        int selecteditem = b.getCheckedRadioButtonId();

        if (selecteditem == c.getId()){
            Toast.makeText(this,"Anda Memilih Dine In",Toast.LENGTH_LONG).show();

            Intent a = new Intent(MainActivity.this,makanDisini.class);
            startActivity(a);
        }
        else if (selecteditem == d.getId()){
            Toast.makeText(this,"Anda Memilih Take Away",Toast.LENGTH_LONG).show();

            Intent a = new Intent(MainActivity.this,dibawaPulang.class);
            startActivity(a);
        }

    }

    public void pilihpemesanan(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.take:
                if (checked)
                    //method untuk menampikan pesan dan pindah layout ke TakeAway
                    take();
                    break;
            case R.id.dine:
                if (checked)
                    //method untuk menampikan pesan dan pindah layout ke Dine In
                    dine();
                    break;
        }
    }

    private void dine() {
        Toast.makeText(this,"Anda Memilih Dine In",Toast.LENGTH_LONG).show();
        Intent a = new Intent(MainActivity.this,makanDisini.class);
        startActivity(a);
    }

    private void take() {
        Toast.makeText(this,"Anda Memilih Take Away",Toast.LENGTH_LONG).show();
        Intent a = new Intent(MainActivity.this,dibawaPulang.class);
        startActivity(a);
    }
}
