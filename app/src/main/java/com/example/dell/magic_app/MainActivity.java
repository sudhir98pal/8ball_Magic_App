package com.example.dell.magic_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ask_button=(Button)findViewById(R.id.askbutton);
       final ImageView eightball = (ImageView)findViewById(R.id.ball_image);
       final int[] array=new int[]{R.drawable.ball1,
               R.drawable.ball2,
               R.drawable.ball3,
               R.drawable.ball4,
               R.drawable.ball5

       };
       ask_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Random number= new Random();
               int number2=number.nextInt(5);
               eightball.setImageResource(array[number2]);
           }
       });
    }
}
