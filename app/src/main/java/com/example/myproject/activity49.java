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
import android.widget.ProgressBar;

public class activity49 extends AppCompatActivity {
    private int score =0;
    private int faux =0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;

    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity49);

        btn1=(Button)findViewById(R.id.rectangle_4);
        btn2=(Button)findViewById(R.id.rectangle_5);
        btn3=(Button)findViewById(R.id.bttm1);
        btn4=(Button)findViewById(R.id.bttm4);
        btn5=(Button)findViewById(R.id.bttm2);
        btn6=(Button)findViewById(R.id.bttm3);
        btn7=(Button)findViewById(R.id.rectangle_6);

        btn7.setClickable(false);

        Intent intent =getIntent();
        score = intent.getIntExtra("score",0);
        faux = intent.getIntExtra("faux",0);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setProgress(score*10);


    }

    public void buClick(View view) {
        final MediaPlayer mpFail = MediaPlayer.create(this,R.raw.fail);
        final MediaPlayer mpCorrect = MediaPlayer.create(this,R.raw.correct);
        Button buSeclect = (Button) view;

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fadein);
        buSeclect.startAnimation(animation);


        switch (buSeclect.getId()){

            case R.id.rectangle_4 : mpFail.start(); if(score >0){score--;}faux++;
                progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                btn5.setBackgroundColor(Color.GREEN);
                btn1.setBackgroundColor(Color.RED);
                btn1.setClickable(false);
                btn2.setClickable(false);
                btn3.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(true);

                break;
            case R.id.rectangle_5 : mpFail.start(); if(score >0){score--;}faux++;
                progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                btn5.setBackgroundColor(Color.GREEN);
                btn2.setBackgroundColor(Color.RED);
                btn1.setClickable(false);
                btn2.setClickable(false);
                btn3.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(true);

                break;

            case R.id.bttm2 : btn5.setBackgroundColor(Color.GREEN); mpCorrect.start(); score++;
                btn1.setClickable(false);
                btn3.setClickable(false);
                btn2.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(true);
                if(progressBar.getProgress()<100){progressBar.setProgress(progressBar.getProgress()+10);}
                break;

            case R.id.bttm1 : mpFail.start(); if(score >0){score--;}faux++;
                progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                btn5.setBackgroundColor(Color.GREEN);
                btn3.setBackgroundColor(Color.RED);
                btn1.setClickable(false);
                btn2.setClickable(false);
                btn3.setClickable(false) ;
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(true);

                break;

            case R.id.bttm4 : mpFail.start(); if(score >0){score--;}faux++;
                progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                btn5.setBackgroundColor(Color.GREEN);
                btn4.setBackgroundColor(Color.RED);
                btn1.setClickable(false);
                btn2.setClickable(false);
                btn3.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(true);

                break;

            case R.id.bttm3 : mpFail.start(); if(score >0){score--;}faux++;
                progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                btn5.setBackgroundColor(Color.GREEN);
                btn6.setBackgroundColor(Color.RED);
                btn1.setClickable(false);
                btn2.setClickable(false);
                btn3.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(true);

                break;


            case R.id.rectangle_6 :Intent intent = new Intent(this,activity410.class );
                intent.putExtra("score",score);
                intent.putExtra("faux",faux);
                startActivity(intent);
                break;




        }
    }
    @Override
    public void onBackPressed(){}
}
