package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class activity65 extends AppCompatActivity {
    private int score ;
    private int faux ;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    ImageView img ;

    private ProgressBar progressBar1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity65);

        btn1=(Button)findViewById(R.id.buttm2);
        btn2=(Button)findViewById(R.id.buttm3);
        btn3=(Button)findViewById(R.id.buttm4);
        btn4=(Button)findViewById(R.id.buttm6);
        btn4.setClickable(false);

        img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(R.drawable.chedjayra);


        progressBar1 = (ProgressBar) findViewById(R.id.progressBar1);

        Intent intent =getIntent();
        score = intent.getIntExtra("score",0);
        faux = intent.getIntExtra("faux",0);

        progressBar1.setProgress(score*10);

    }

    public void buClick(View view) {
        final MediaPlayer mpFail = MediaPlayer.create(this,R.raw.fail);
        final MediaPlayer mpCorrect = MediaPlayer.create(this,R.raw.correct);
        Button buSeclect = (Button) view;
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fadein);
        buSeclect.startAnimation(animation);

        switch (buSeclect.getId()){

            case R.id.buttm2 : btn1.setBackgroundColor(Color.RED);mpFail.start(); if(score >0){score--;}faux++;
                progressBar1.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar1.getProgress()>0){progressBar1.setProgress(progressBar1.getProgress()-10);}
                btn2.setBackgroundColor(Color.GREEN);btn1.setClickable(false);btn2.setClickable(false);
                btn3.setClickable(false);btn4.setClickable(true); break;

            case R.id.buttm3 : btn2.setBackgroundColor(Color.GREEN); mpCorrect.start(); score=score+1;
                btn1.setClickable(false);btn2.setClickable(false);btn3.setClickable(false);
                if(progressBar1.getProgress()<100){progressBar1.setProgress(progressBar1.getProgress()+10);}
                btn4.setClickable(true);  break;

            case R.id.buttm4 :  btn3.setBackgroundColor(Color.RED);mpFail.start();if(score >0){score--;}faux++;
                btn2.setBackgroundColor(Color.GREEN); btn1.setClickable(false);btn2.setClickable(false);
                progressBar1.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar1.getProgress()>0){progressBar1.setProgress(progressBar1.getProgress()-10);}
                btn3.setClickable(false);btn4.setClickable(true); break;


            case R.id.buttm6 :Intent intent = new Intent(this,activity66.class );
                intent.putExtra("score",score);
                intent.putExtra("faux",faux);

                startActivity(intent);
                break;





        }
    }
    @Override
    public void onBackPressed(){}
}
