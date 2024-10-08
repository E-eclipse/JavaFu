package com.example.krestikinoliki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SettingKrestikiActivity extends AppCompatActivity {

    ImageView backBtn;
    Button btnReset;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_krestiki);

        sharedPreferences = this.getSharedPreferences("krestikNolik", Context.MODE_PRIVATE );
        editor = sharedPreferences.edit();

        btnReset = findViewById(R.id.btnReset);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putInt("pointsOfHuman", 0);
                editor.putInt("pointsOfPC", 0);
                editor.apply();
                Toast.makeText(SettingKrestikiActivity.this, getString(R.string.Reset_message), Toast.LENGTH_SHORT).show();

            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(SettingKrestikiActivity.this, KrestikiNoliki.class));
        finish();
    }
}