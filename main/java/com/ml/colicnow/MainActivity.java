package com.ml.colicnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements Runnable{

    private ProgressBar progressBar;
    private Thread thread;
    private Handler handler;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBarAbertura);

        i = 1;

        handler = new Handler();
        thread = new Thread((Runnable) this);
        thread.start();

    }

    @Override
    public void run() {

        i = 1;

        try {

            while (i <= 100) {

                Thread.sleep(15);
                handler.post(new Runnable() {
                    @Override
                    public void run() {

                        i++;
                        progressBar.setProgress(i);

                    }
                });
            }

            finish();
            startActivity(new Intent(getBaseContext(), menuPrincipal.class));

        } catch (InterruptedException e) {

        }
    }

}