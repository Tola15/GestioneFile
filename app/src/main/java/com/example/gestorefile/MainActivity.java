package com.example.gestorefile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    Button btnLeggi;
    TextView lblContenuto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci=findViewById(R.id.btnInserisci);
        btnLeggi=findViewById(R.id.btnLeggi);
        lblContenuto=findViewById(R.id.lblContenuto);
        Gestore g = new Gestore();
        btnLeggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ricevuta= g.Leggi("scri.txt", getApplicationContext());
                lblContenuto.setText(ricevuta);
            }
        });
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              g.Scrivi("scri.txt", getApplicationContext());
            }
        });
    }
}