package com.londonappbrewery.magiceightball;

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

        Button button;
        button = findViewById(R.id.ask_button);
        final ImageView ballImage;
        ballImage = findViewById(R.id.ball_image);

        final int[] array = {R.mipmap.ball1 ,
                              R.mipmap.ball2 ,
                              R.mipmap.ball3 ,
                                R.mipmap.ball4 ,
                               R.mipmap.ball5};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random generateRandomNum = new Random();
                int imageNumber = generateRandomNum.nextInt(5);

                ballImage.setImageResource(array[imageNumber]);
            }
        });

    }
}
