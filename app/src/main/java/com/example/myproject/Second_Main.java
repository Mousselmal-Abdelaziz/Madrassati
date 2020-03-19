package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_Main extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__main);

        btn1= (Button) findViewById(R.id.buttm1);
        btn2= (Button) findViewById(R.id.buttm2);
        btn3= (Button) findViewById(R.id.buttm3);
        btn4= (Button) findViewById(R.id.buttm4);
        btn5= (Button) findViewById(R.id.buttm5);
        btn6= (Button) findViewById(R.id.buttm6);

    }

    public void buClick(View view) {

        Button buSeclected = (Button) view;

        switch (buSeclected.getId()){
            case R.id.buttm1 : Intent intentIsami = new Intent(this,activity41.class);
                startActivity(intentIsami);break;




            case R.id.buttm2 : Intent intentMadani = new Intent(this,activity51.class);
                               startActivity(intentMadani);break;


            case R.id.buttm3 :   Intent intent = new Intent(this,activity11.class);
                startActivity(intent);
                break;



            case R.id.buttm4 : Intent intentArab = new Intent(this,activity31.class);
                startActivity(intentArab);
                break;


            case R.id.buttm5 : Intent intent1 = new Intent(this,activity21.class);
                startActivity(intent1);
                break;


            case R.id.buttm6 : break;

        }
    }


    @Override
    public void onBackPressed(){}
}




























