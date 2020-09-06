package com.example.mediq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionScreen extends AppCompatActivity {
   Button qr;
   Button health;
   Button directory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_screen);

        qr=(Button)findViewById(R.id.qr_button);
        health=(Button)findViewById(R.id.health_button);
        directory=(Button)findViewById(R.id.directory_button);

       qr.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent= new Intent(OptionScreen.this, QR.class);
               startActivity(intent);
           }
       });

       health.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent1= new Intent(OptionScreen.this, health.class);
               startActivity(intent1);
           }
       });

       directory.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent2= new Intent(OptionScreen.this, directory.class);
               startActivity(intent2);
           }
       });
    }
}