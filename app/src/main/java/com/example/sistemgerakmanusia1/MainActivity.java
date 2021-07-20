package com.example.sistemgerakmanusia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnkompetensi);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this, kompetensi.class);
                startActivity(k);

                Button btn = (Button) findViewById(R.id.btnmateri);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent m = new Intent(MainActivity.this, materi.class);
                        startActivity(m);

                        Button btn = (Button) findViewById(R.id.btnlatihansoal);

                        btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent l = new Intent(MainActivity.this, LatihanSoal.class);
                                startActivity(l);

                                Button btn = (Button) findViewById(R.id.btnvideo);

                                btn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent vi = new Intent(MainActivity.this, Video.class);
                                        startActivity(vi);

                                        Button btn = (Button) findViewById(R.id.btnprofil);

                                        btn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent pr = new Intent(MainActivity.this, Profil.class);
                                                startActivity(pr);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }}