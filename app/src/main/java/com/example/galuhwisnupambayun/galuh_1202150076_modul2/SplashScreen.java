package com.example.galuhwisnupambayun.galuh_1202150076_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        Toast.makeText(SplashScreen.this,"Galuh Wisnu Pambayun_1202150076",Toast.LENGTH_LONG).show();

        new Handler().postDelayed(new Runnable() {

                                    @Override
                                      public void run() {
                                          Intent i = new Intent(SplashScreen.this, MainActivity.class);
                                          startActivity(i);
                                          this.finish();
                                      }

                                      private void finish() {
                                      }
                                  },
                splashInterval);

    };
    }

