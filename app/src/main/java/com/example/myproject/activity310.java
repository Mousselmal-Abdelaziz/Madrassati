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
import android.widget.TextView;

public class activity310 extends AppCompatActivity {
    private int score=0 ;
    private int faux=0;
    private TextView txt;
    private  Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private ProgressBar progressBar;
    int check=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity310);

        btn1=(Button)findViewById(R.id.rectangle_2);
        btn2=(Button)findViewById(R.id.rectangle_3);
        btn3=(Button)findViewById(R.id.rectangle_4);
        btn4=(Button)findViewById(R.id.rectangle_5);
        btn5=(Button)findViewById(R.id.rectangle_6);
        btn5.setClickable(false);


        txt=(TextView) findViewById(R.id.textView5);

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

            case R.id.rectangle_2 : txt.setText(txt.getText()+"غرس "); btn1.setClickable(false);check++; if (check==4){
                if (txt.getText().toString().equals("غرس احمد شجيرة التفاح ")){
                    btn1.setBackgroundColor(Color.GREEN);
                    btn2.setBackgroundColor(Color.GREEN);
                    btn3.setBackgroundColor(Color.GREEN);
                    btn4.setBackgroundColor(Color.GREEN);
                    mpCorrect.start();
                    btn5.setClickable(true);
                    progressBar.setProgress(progressBar.getProgress()+10);
                    score++;
                }
                else{
                    btn1.setBackgroundColor(Color.RED);
                    btn2.setBackgroundColor(Color.RED);
                    btn3.setBackgroundColor(Color.RED);
                    btn4.setBackgroundColor(Color.RED);
                    mpFail.start();
                    btn5.setClickable(true);
                    progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                    progressBar.setProgress(progressBar.getProgress()-10);
                    faux++;
                    if(score >0){score--;}
                }
            } break;

            case R.id.rectangle_3 : txt.setText(txt.getText()+"التفاح "); btn2.setClickable(false);check++;
                if (check==4){
                    if (txt.getText().toString().equals("غرس احمد شجيرة التفاح ")){
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);
                        mpCorrect.start();
                        btn5.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()+10);
                        score++;
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        mpFail.start();
                        btn5.setClickable(true);
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        faux++;
                        if(score >0){score--;}
                    }
                }
                break;

            case R.id.rectangle_4 :txt.setText(txt.getText()+"احمد "); btn3.setClickable(false); check++;
                if (check==4){
                    if (txt.getText().toString().equals("غرس احمد شجيرة التفاح ")){
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);
                        mpCorrect.start();
                        btn5.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()+10);
                        score++;
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        mpFail.start();
                        btn5.setClickable(true);
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        faux++;
                        if(score >0){score--;}
                    }
                }
                break;

            case R.id.rectangle_5 : txt.setText(txt.getText()+"شجيرة ");btn4.setClickable(false); check++;
                if (check==4){
                    if (txt.getText().toString().equals("غرس احمد شجيرة التفاح ")){
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);
                        mpCorrect.start();
                        btn5.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()+10);
                        score++;
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        mpFail.start();
                        btn5.setClickable(true);
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        faux++;
                        if(score >0){score--;}
                    }
                }
                break;


            case R.id.rectangle_6 :Intent intent = new Intent(this,activity39.class );
                intent.putExtra("score",score);
                intent.putExtra("faux",faux);
                startActivity(intent);
                break;





        }
    }

}
