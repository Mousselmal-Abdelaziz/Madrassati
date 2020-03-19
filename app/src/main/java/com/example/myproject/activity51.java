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

public class activity51 extends AppCompatActivity {
    private int score =0;
    private int faux=0 ;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    ImageView img ;
    int check=0;

    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity51);

        btn1=(Button)findViewById(R.id.buttm2);
        btn2=(Button)findViewById(R.id.buttm3);
        btn3=(Button)findViewById(R.id.buttm4);
        btn4=(Button)findViewById(R.id.buttm5);
        btn5=(Button)findViewById(R.id.buttm6);
        btn5.setClickable(false);
        img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(R.drawable.imgmadania);


        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        Intent intent =getIntent();
        score = intent.getIntExtra("score",0);
        faux = intent.getIntExtra("faux",0);

        progressBar.setProgress(0);

    }

    public void buClick(View view) {
        final MediaPlayer mpFail = MediaPlayer.create(this,R.raw.fail);
        final MediaPlayer mpCorrect = MediaPlayer.create(this,R.raw.correct);

        Button buSeclect = (Button) view;

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fadein);
        buSeclect.startAnimation(animation);

        switch (buSeclect.getId()){

            case R.id.buttm3 : btn2.setBackgroundColor(Color.GREEN);check++;
              if(check==2){
                  mpCorrect.start();
                  if(score <100){score++;}
                  btn5.setClickable(true);
                  if(progressBar.getProgress()<100){progressBar.setProgress(progressBar.getProgress()+10);}
                  btn3.setClickable(false);btn4.setClickable(false);
              }
              btn2.setClickable(false); break;

            case R.id.buttm2 : btn1.setBackgroundColor(Color.GREEN); check++;
                if(check==2){
                    mpCorrect.start();
                    score++;
                    btn5.setClickable(true);
                    if(progressBar.getProgress()<100){progressBar.setProgress(progressBar.getProgress()+10);}
                    btn3.setClickable(false);btn4.setClickable(false);
                }
                btn1.setClickable(false); break;

            case R.id.buttm4 :  btn3.setBackgroundColor(Color.RED);mpFail.start();if(score >0){score--;}faux++;
                btn1.setBackgroundColor(Color.GREEN);btn2.setBackgroundColor(Color.GREEN); btn1.setClickable(false);btn2.setClickable(false);
                progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                btn3.setClickable(false);btn4.setClickable(false);btn5.setClickable(true); break;

            case R.id.buttm5 :  btn4.setBackgroundColor(Color.RED);mpFail.start();if(score >0){score--;}faux++;
                btn1.setBackgroundColor(Color.GREEN);btn2.setBackgroundColor(Color.GREEN); btn1.setClickable(false);btn2.setClickable(false);
                progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                btn3.setClickable(false);btn4.setClickable(false);btn5.setClickable(true);break;


            case R.id.buttm6 :Intent intent = new Intent(this,activity52.class );
                intent.putExtra("score",score);
                intent.putExtra("faux",faux);

                startActivity(intent);
                break;
  }
    }
    @Override
    public void onBackPressed(){}
}
