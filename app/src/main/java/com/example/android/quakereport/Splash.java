package com.example.android.quakereport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t = new Thread() {
            public void run() {
                try {
                    int time = 0;
                    while (time < 4000) {
                        sleep(100);
                        time += 100;
                    }
                }
                catch (InterruptedException e) {
                    // do nothing
                }
                finally {
                    finish();
                    Intent i = new Intent(Splash.this, EarthquakeActivity.class);
                    startActivity(i);
                }
            }
        };
        t.start();

    }
}
