package com.TinyAndroidStudio.kajus.thecatgenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.TinyAndroidStudio.kajus.thecatgenerator.R.layout.activity_main);
    }

    public void generateCat(View view){

        Intent intent = new Intent(this, Generate.class);
        startActivity(intent);
    }
}

