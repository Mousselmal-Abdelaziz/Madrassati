package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mpstart;
    ImageView img;
    Button btn;
    Animation frombuttom,fromtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpstart= MediaPlayer.create(this,R.raw.start);
        mpstart.start();

        img = (ImageView) findViewById(R.id.start);
        img.setImageResource(R.drawable.main_photo);
        btn =(Button) findViewById(R.id.ellipse_1);

        frombuttom = AnimationUtils.loadAnimation(this,R.anim.frombuttom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        btn.setAnimation(frombuttom);

        img.setAnimation(fromtop);




    }

    public void buClick(View view) {
        mpstart.stop();


        Intent intent = new Intent(this, Second_Main.class);
        startActivity(intent);

 }
}




