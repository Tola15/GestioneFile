package com.example.gestorefile;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Gestore {
    public Gestore() {
    }
    public void Scrivi(String nf, Context c){
        String scrivere="Tu sei solo tuuu";
        FileOutputStream file;
        try {
            file=c.openFileOutput(nf, Context.MODE_PRIVATE);
            file.write(scrivere.getBytes());
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
