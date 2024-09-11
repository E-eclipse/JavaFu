package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button firstButton;
    private Button secondButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = findViewById(R.id.firstButton);
        secondButton = findViewById(R.id.SecondButton);
        frame = findViewById(R.id.frame);

        firstButton.setOnClickListener(v -> {
                    Intent intent = new Intent(this, MainActivity2.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_inright, R.anim.slide_out_left);
                }
        );

        secondButton.setOnClickListener(v -> {
                    Intent intent = new Intent(this, MainActivity3.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_inright, R.anim.slide_out_left);
                }
        );

        frame.setOnClickListener(v -> {
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_inright, R.anim.slide_out_left);
                }


        );
    };
}