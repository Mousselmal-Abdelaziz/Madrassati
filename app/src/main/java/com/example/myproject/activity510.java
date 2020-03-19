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

public class activity510 extends AppCompatActivity {
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

    private ProgressBar progressBar;
    int check=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity510);

        btn1=(Button)findViewById(R.id.buttm4);
        btn2=(Button)findViewById(R.id.buttm3);
        btn3=(Button)findViewById(R.id.buttm2);
        btn4=(Button)findViewById(R.id.buttm5);

        btn4.setClickable(false);


        txt1=(TextView) findViewById(R.id.text2);
        txt2=(TextView) findViewById(R.id.text4);
        txt3=(TextView) findViewById(R.id.text6);

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

            case R.id.buttm4 :
                btn1.setClickable(false);
                check++;
                if(txt1.getText().toString().equals("..")){
                    txt1.setText("منا");
                }else
                if(txt2.getText().toString().equals("..")){
                    txt2.setText("منا");
                }else
                if(txt3.getText().toString().equals("..")){
                    txt3.setText("منا");
                }else
                { txt4.setText("منا");}

                if(check==3){
                    if(txt1.getText().toString().equals("منا") && txt2.getText().toString().equals("يرحم") && txt3.getText().toString().equals("يُوقر")){
                        mpCorrect.start();
                        score++;
                        progressBar.setProgress(progressBar.getProgress()+10);
                        btn4.setClickable(true);
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);

                    }else
                    {
                        mpFail.start();
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setClickable(true);


                    }}break;

            case R.id.buttm3 :
                btn2.setClickable(false);
                check++;
                if(txt1.getText().toString().equals("..")){
                    txt1.setText("يرحم");
                }else
                if(txt2.getText().toString().equals("..")){
                    txt2.setText("يرحم");
                }else
                if(txt3.getText().toString().equals("..")){
                    txt3.setText("يرحم");
                }else
                { txt4.setText("يرحم");}

                if(check==3){
                    if(txt1.getText().toString().equals("منا") && txt2.getText().toString().equals("يرحم") && txt3.getText().toString().equals("يُوقر")){
                        mpCorrect.start();
                        score++;
                        progressBar.setProgress(progressBar.getProgress()+10);
                        btn4.setClickable(true);
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);

                    }else
                    {
                        mpFail.start();
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setClickable(true);


                    }}break;


            case R.id.buttm2 :
                btn3.setClickable(false);
                check++;
                if(txt1.getText().toString().equals("..")){
                    txt1.setText("يُوقر");
                }else
                if(txt2.getText().toString().equals("..")){
                    txt2.setText("يُوقر");
                }else
                if(txt3.getText().toString().equals("..")){
                    txt3.setText("يُوقر");
                }else
                { txt4.setText("يُوقر");}

                if(check==3){
                    if(txt1.getText().toString().equals("منا") && txt2.getText().toString().equals("يرحم") && txt3.getText().toString().equals("يُوقر")){
                        mpCorrect.start();
                        score++;
                        progressBar.setProgress(progressBar.getProgress()+10);
                        btn4.setClickable(true);
                        btn1.setBackgroundColor(Color.GREEN);
                        btn2.setBackgroundColor(Color.GREEN);
                        btn3.setBackgroundColor(Color.GREEN);

                    }else
                    {
                        mpFail.start();
                        faux++;
                        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.pb_drawable_wrong));
                        progressBar.setProgress(progressBar.getProgress()-10);
                        btn1.setBackgroundColor(Color.RED);
                        btn2.setBackgroundColor(Color.RED);
                        btn3.setBackgroundColor(Color.RED);
                        btn4.setClickable(true);


                    }}break;




            case R.id.buttm5 :Intent intent = new Intent(this,activity511.class );
                intent.putExtra("score",score);
                intent.putExtra("faux",faux);
                startActivity(intent);
                break;





        }
    }
    @Override
    public void onBackPressed(){}
}
