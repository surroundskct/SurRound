package com.example.user.surround;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Button goToHome;
    RelativeLayout splashBg;
    TextView splashText;
    String[] values = {
            "VALUE 1",
            "Value 2",
            "Value 3"
    };
    int[] colorValues = {
            Color.parseColor("#0946ff"),
            Color.parseColor("#ff2c30"),
            Color.parseColor("#40f733"),
    };
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        goToHome = (Button) findViewById(R.id.goToHome);
        splashBg = (RelativeLayout) findViewById(R.id.splashBg);
        splashText = (TextView) findViewById(R.id.splashText);

        goToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < values.length) {
                    splashText.setText(values[index]);
                    splashBg.setBackgroundColor(colorValues[index++]);
                } else
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
        });
    }
}
