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

public class activity21 extends AppCompatActivity {
    private int score=0 ;
    private int faux=0;
    ImageView img ;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    private ProgressBar progressBar1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity21);

        btn1=(Button)findViewById(R.id.rectangle_2);
        btn2=(Button)findViewById(R.id.rectangle_3);
        btn3=(Button)findViewById(R.id.rectangle_4);
        btn4=(Button)findViewById(R.id.rectangle_5);
        btn5=(Button)findViewById(R.id.rectangle_6);

        img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(R.drawable.zarafa);


        progressBar1 = (ProgressBar) findViewById(R.id.progressBar1);

        Intent intent =getIntent();
        score = intent.getIntExtra("score",0);

        progressBar1.setProgress(0);

    }

    public void buClick(View view) {
        final MediaPlayer mpFail = MediaPlayer.create(this,R.raw.fail);
        final MediaPlayer mpCorrect = MediaPlayer.create(this,R.raw.correct);
        Button buSeclect = (Button) view;
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fadein);
        buSeclect.startAnimation(animation);

        switch (buSeclect.getId()){

            case R.id.rectangle_4 :      btn3.setBackgroundColor(Color.RED);mpFail.start(); if(score >0){score--;} faux++;
                if(progressBar1.getProgress()>0){progressBar1.setProgress(progressBar1.getProgress()-10);}
                progressBar1.setBackgroundColor(Color.RED);
                btn1.setBackgroundColor(Color.GREEN);btn1.setClickable(false);btn2.setClickable(false);
                btn3.setClickable(false);btn4.setClickable(false); break;

            case R.id.rectangle_2 : btn1.setBackgroundColor(Color.GREEN); mpCorrect.start(); score=score+1;
                btn1.setClickable(false);btn2.setClickable(false);btn3.setClickable(false);
                if(progressBar1.getProgress()<100){progressBar1.setProgress(progressBar1.getProgress()+10);}
                btn4.setClickable(false);  break;

            case R.id.rectangle_3 :  btn2.setBackgroundColor(Color.RED);mpFail.start();if(score >0){score--;} faux++;
                btn1.setBackgroundColor(Color.GREEN); btn1.setClickable(false);btn2.setClickable(false);
                if(progressBar1.getProgress()>0){progressBar1.setProgress(progressBar1.getProgress()-10);}
                progressBar1.setBackgroundColor(Color.RED);
                btn3.setClickable(false);btn4.setClickable(false); break;

            case R.id.rectangle_5 :  btn4.setBackgroundColor(Color.RED);mpFail.start();if(score >0){score--;}faux++;
                btn1.setBackgroundColor(Color.GREEN); btn1.setClickable(false);btn2.setClickable(false);
                if(progressBar1.getProgress()>0){progressBar1.setProgress(progressBar1.getProgress()-10);}
                progressBar1.setBackgroundColor(Color.RED);
                btn3.setClickable(false);btn4.setClickable(false);break;


            case R.id.rectangle_6 :Intent intent = new Intent(this,activity22.class );
                intent.putExtra("score",score);
                intent.putExtra("faux",faux);
                startActivity(intent);
                break;





        }
    }


}
