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

public class activity39 extends AppCompatActivity {
    private int score=0 ;
    private int faux=0;
    private TextView txt;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;


    private ProgressBar progressBar;
    int check=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity39);

        btn1=(Button)findViewById(R.id.bttm1);
        btn2=(Button)findViewById(R.id.buttm2);
        btn3=(Button)findViewById(R.id.buttm3);
        btn4=(Button)findViewById(R.id.buttm4);
        btn5=(Button)findViewById(R.id.buttm5);
        btn6=(Button)findViewById(R.id.buttm6);
        btn7=(Button)findViewById(R.id.rectangle_6);

        btn7.setClickable(false);


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

            case R.id.bttm1 : txt.setText(txt.getText()+"نزهة "); btn1.setClickable(false);check++; if (check==6){
                if (txt.getText().toString().equals("خرجت العائلة في نزهة الى الغابة ")){
                    btn1.setBackgroundColor(Color.GREEN);
                    btn2.setBackgroundColor(Color.GREEN);
                    btn3.setBackgroundColor(Color.GREEN);
                    btn4.setBackgroundColor(Color.GREEN);
                    btn5.setBackgroundColor(Color.GREEN);
                    btn6.setBackgroundColor(Color.GREEN);
                    mpCorrect.start();
                    btn7.setClickable(true);
                    progressBar.setProgress(progressBar.getProgress()+10);
                    score++;
                }
                else{
                    btn1.setBackgroundColor(Color.RED);
                    btn2.setBackgroundColor(Color.RED);
                    btn3.setBackgroundColor(Color.RED);
                    btn4.setBackgroundColor(Color.RED);
                    btn5.setBackgroundColor(Color.RED);
                    btn6.setBackgroundColor(Color.RED);
                    mpFail.start();
                    btn7.setClickable(true);
                    progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                    progressBar.setProgress(progressBar.getProgress()-10);
                    faux++;
                    progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                    if(score >0){score--;}
                }
            } break;

            case R.id.buttm2 : txt.setText(txt.getText()+"الى "); btn2.setClickable(false);check++;
                if (check==6){
                    if (txt.getText().toString().equals(" خرجت العائلة في نزهة الى الغابة ")){
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);
                        btn5.setBackgroundColor(Color.GREEN);
                        btn6.setBackgroundColor(Color.GREEN);
                        mpCorrect.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()+10);
                        score++;
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        btn5.setBackgroundColor(Color.RED);
                        btn6.setBackgroundColor(Color.RED);
                        mpFail.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()-10);
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        if(score >0){score--;}
                    }
                }
                break;

            case R.id.buttm3 :txt.setText(txt.getText()+"الغابة "); btn3.setClickable(false); check++;
                if (check==6){
                    if (txt.getText().toString().equals("خرجت العائلة في نزهة الى الغابة ")){
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);
                        btn5.setBackgroundColor(Color.GREEN);
                        btn6.setBackgroundColor(Color.GREEN);
                        mpCorrect.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()+10);
                        score++;
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        btn5.setBackgroundColor(Color.RED);
                        btn6.setBackgroundColor(Color.RED);
                        mpFail.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()-10);
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        if(score >0){score--;}
                    }
                }
                break;

            case R.id.buttm4 : txt.setText(txt.getText()+"العائلة ");btn4.setClickable(false); check++;
                if (check==6){
                    if (txt.getText().toString().equals("خرجت العائلة في نزهة الى الغابة ")){
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);
                        btn5.setBackgroundColor(Color.GREEN);
                        btn6.setBackgroundColor(Color.GREEN);
                        mpCorrect.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()+10);
                        score++;
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        btn5.setBackgroundColor(Color.RED);
                        btn6.setBackgroundColor(Color.RED);
                        mpFail.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()-10);
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        if(score >0){score--;}
                    }
                }
                break;

            case R.id.buttm5 : txt.setText(txt.getText()+"في ");btn5.setClickable(false); check++;
                if (check==6){
                    if (txt.getText().toString().equals("خرجت العائلة في نزهة الى الغابة ")){
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);
                        btn5.setBackgroundColor(Color.GREEN);
                        btn6.setBackgroundColor(Color.GREEN);
                        mpCorrect.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()+10);
                        score++;
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        btn5.setBackgroundColor(Color.RED);
                        btn6.setBackgroundColor(Color.RED);
                        mpFail.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()-10);
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        if(score >0){score--;}
                    }
                }
                break;

            case R.id.buttm6 : txt.setText(txt.getText()+"خرجت ");btn6.setClickable(false); check++;
                if (check==6){
                    if (txt.getText().toString().equals("خرجت العائلة في نزهة الى الغابة ")){
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);
                        btn5.setBackgroundColor(Color.GREEN);
                        btn6.setBackgroundColor(Color.GREEN);
                        mpCorrect.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()+10);
                        score++;
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        btn5.setBackgroundColor(Color.RED);
                        btn6.setBackgroundColor(Color.RED);
                        mpFail.start();
                        btn7.setClickable(true);
                        progressBar.setProgress(progressBar.getProgress()-10);
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        if(score >0){score--;}
                    }
                }
                break;

            case R.id.rectangle_6 :Intent intent = new Intent(this,activity35.class );
                intent.putExtra("score",score);
                intent.putExtra("faux",faux);
                startActivity(intent);
                break;





        }
    }

}
