package com.example.gestorefile;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public String Leggi(String nf, Context c){
        StringBuilder lg= new StringBuilder();
        try {
            BufferedReader gl= new BufferedReader(new InputStreamReader(c.openFileInput(nf)));
            String billy="";
            while((billy= gl.readLine())!=null) {
                lg.append(billy+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lg.toString();
    }
}
