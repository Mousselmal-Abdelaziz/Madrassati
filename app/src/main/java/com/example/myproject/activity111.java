package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity111 extends AppCompatActivity {

    TextView txt2;
    TextView txt3;
    TextView txt4;
    private int faux ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity111);


        txt2= (TextView)findViewById(R.id.textView2);
        txt3= (TextView)findViewById(R.id.textView3);
        txt4= (TextView)findViewById(R.id.textView4);

        Intent intent =getIntent();
        faux = intent.getIntExtra("faux",0);


        if((10-faux) < 5){
            txt4.setText("دون المتوسط");
        }else
        if((10-faux) == 5){
            txt4.setText("متوسط");
        }else
        if((10-faux) > 5 && (10-faux) <=7){
            txt4.setText("جيد");
        }else
        if((10-faux) == 8 || (10-faux) == 9){
            txt4.setText("جيد جدا");
        }else
        if((10-faux) == 10){
            txt4.setText("ممتاز أحسنت");
        }

        txt2.setText(txt2.getText()+" "+(10-faux));
        txt3.setText(txt3.getText()+" "+faux);
    }
    public void buClick(View view) {
        Intent intent = new Intent(this,MainActivity.class );
        startActivity(intent);


    }
}
