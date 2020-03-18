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

public class activity410 extends AppCompatActivity {
    private int score=0 ;
    private int faux=0;

    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    private ProgressBar progressBar;
    int check=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity410);

        btn1=(Button)findViewById(R.id.rectangle_3);
        btn2=(Button)findViewById(R.id.rectangle_4);
        btn3=(Button)findViewById(R.id.rectangle_5);
        btn4=(Button)findViewById(R.id.bttm1);
        btn5=(Button)findViewById(R.id.rectangle_6);

        btn5.setClickable(false);


        txt1=(TextView) findViewById(R.id.text2);
        txt2=(TextView) findViewById(R.id.text4);
        txt3=(TextView) findViewById(R.id.text6);
        txt4=(TextView) findViewById(R.id.text8);

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

            case R.id.rectangle_3 :
                btn1.setClickable(false);
                check++;
                if(txt1.getText().toString().equals("..")){
                    txt1.setText("يليك");
                }else
                if(txt2.getText().toString().equals("..")){
                    txt2.setText("يليك");
                }else
                if(txt3.getText().toString().equals("..")){
                    txt3.setText("يليك");
                }else
                { txt4.setText("يليك");}

                if(check==4){
                if(txt1.getText().toString().equals("غلام") && txt2.getText().toString().equals("الله") && txt3.getText().toString().equals("بيمينك")
                        && txt4.getText().toString().equals("يليك")){
                    mpCorrect.start();
                    score++;
                    progressBar.setProgress(progressBar.getProgress()+10);
                    btn5.setClickable(true);
                    btn1.setBackgroundColor(Color.GREEN);
                    btn2.setBackgroundColor(Color.GREEN);
                    btn3.setBackgroundColor(Color.GREEN);
                    btn4.setBackgroundColor(Color.GREEN);

                }else
               {
                mpFail.start();
                faux++;
                progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                progressBar.setProgress(progressBar.getProgress()-10);
                btn1.setBackgroundColor(Color.RED);
                btn2.setBackgroundColor(Color.RED);
                btn3.setBackgroundColor(Color.RED);
                btn4.setBackgroundColor(Color.RED);
                btn5.setClickable(true);


            }}break;

            case R.id.rectangle_4 :
                btn2.setClickable(false);
                check++;
                if(txt1.getText().toString().equals("..")){
                    txt1.setText("غلام");
                }else
                if(txt2.getText().toString().equals("..")){
                    txt2.setText("غلام");
                }else
                if(txt3.getText().toString().equals("..")){
                    txt3.setText("غلام");
                }else
                { txt4.setText("غلام");}

                if(check==4){
                    if(txt1.getText().toString().equals("غلام") && txt2.getText().toString().equals("الله") && txt3.getText().toString().equals("بيمينك")
                            && txt4.getText().toString().equals("يليك")){
                        mpCorrect.start();
                        score++;
                        progressBar.setProgress(progressBar.getProgress()+10);
                        btn5.setClickable(true);
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);

                    }else
                    {
                        mpFail.start();
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        btn5.setClickable(true);


                    }}break;


            case R.id.rectangle_5 :
                btn3.setClickable(false);
                check++;
                if(txt1.getText().toString().equals("..")){
                    txt1.setText("بيمينك");
                }else
                if(txt2.getText().toString().equals("..")){
                    txt2.setText("بيمينك");
                }else
                if(txt3.getText().toString().equals("..")){
                    txt3.setText("بيمينك");
                }else
                { txt4.setText("بيمينك");}

                if(check==4){
                    if(txt1.getText().toString().equals("غلام") && txt2.getText().toString().equals("الله") && txt3.getText().toString().equals("بيمينك")
                            && txt4.getText().toString().equals("يليك")){
                        mpCorrect.start();
                        score++;
                        progressBar.setProgress(progressBar.getProgress()+10);
                        btn5.setClickable(true);
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);

                    }else
                    {
                        mpFail.start();
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        btn5.setClickable(true);


                    }}break;


            case R.id.bttm1 :
                btn4.setClickable(false);
                check++;
                if(txt1.getText().toString().equals("..")){
                    txt1.setText("الله");
                }else
                if(txt2.getText().toString().equals("..")){
                    txt2.setText("الله");
                }else
                if(txt3.getText().toString().equals("..")){
                    txt3.setText("الله");
                }else
                { txt4.setText("الله");}

                if(check==4){
                    if(txt1.getText().toString().equals("غلام") && txt2.getText().toString().equals("الله") && txt3.getText().toString().equals("بيمينك")
                            && txt4.getText().toString().equals("يليك")){
                        mpCorrect.start();
                        score++;
                        progressBar.setProgress(progressBar.getProgress()+10);
                        btn5.setClickable(true);
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);
                        btn4.setBackgroundColor(Color.GREEN);

                    }else
                    {
                        mpFail.start();
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setBackgroundColor(Color.RED);
                        btn5.setClickable(true);


                    }}break;



            case R.id.rectangle_6 :Intent intent = new Intent(this,activity411.class );
                intent.putExtra("score",score);
                intent.putExtra("faux",faux);
                startActivity(intent);
                break;





        }
    }
    @Override
    public void onBackPressed(){}
}
