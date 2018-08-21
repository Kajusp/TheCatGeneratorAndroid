package com.TinyAndroidStudio.kajus.thecatgenerator;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Generate extends AppCompatActivity {

    private int[] cats = {
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat1,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat2,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat3,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat4,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat5,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat6,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat7,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat8,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat9,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat10,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat11,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat12,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat13,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat14,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat15,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat16,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat17,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat18,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat19,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat20,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat21,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat22,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat23,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat24,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat25,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat26,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat27,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat28,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat29,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat30,
            com.TinyAndroidStudio.kajus.thecatgenerator.R.drawable.cat31

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.TinyAndroidStudio.kajus.thecatgenerator.R.layout.activity_generate);

        generate();

    }

    int lastCatInd=-1;

    public void generate(){

        try {
            ImageView pic = findViewById(com.TinyAndroidStudio.kajus.thecatgenerator.R.id.kat);
            ObjectAnimator oA = ObjectAnimator.ofFloat(pic, "alpha", 0, 1);

            Random generator = new Random();
            int number = generator.nextInt(31);

            while (lastCatInd == number){
                number = generator.nextInt(31);
            }

            lastCatInd = number;

            pic.setImageResource(cats[number]);
            oA.setDuration(800);
            oA.start();
        }
        catch (OutOfMemoryError e){
            generate();
        }
        catch (Exception e){
            generate();
        }
    }

    public void newCat(View view)
    {

        generate();
    }

}
