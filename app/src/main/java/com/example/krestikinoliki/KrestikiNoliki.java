package com.example.krestikinoliki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.krestikinoliki.MainActivity;

import java.util.Random;

public class KrestikiNoliki extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String krest, nol;
    TextView textView, humanPoints, pcPoints;
    int pointsOfHuman, pointsOfPC;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krestiki_noliki);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);

        humanPoints = findViewById(R.id.humanPoints);
        pcPoints = findViewById(R.id.pcPoints);



        sharedPreferences = this.getSharedPreferences("krestikNolik", Context.MODE_PRIVATE );
        editor = sharedPreferences.edit();

        pointsOfHuman = sharedPreferences.getInt("pointsOfHuman", 0);
        humanPoints.setText(""+pointsOfHuman);

        pointsOfPC = sharedPreferences.getInt("pointsOfPC", 0);
        pcPoints.setText(""+pointsOfPC);

        krest = "X";
        nol = "0";
        textView.setText("");
    }

    public void clcBtn1(View view) {
        if (button1.getText()=="" && textView.getText() == "") {
            button1.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn2(View view) {
        if (button2.getText()==""&& textView.getText() == "") {
            button2.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn3(View view) {
        if (button3.getText()==""&& textView.getText() == "") {
            button3.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn4(View view) {
        if (button4.getText()==""&& textView.getText() == "") {
            button4.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5(View view) {
        if (button5.getText()==""&& textView.getText() == "") {
            button5.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6(View view) {
        if (button6.getText()==""&& textView.getText() == "") {
            button6.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7(View view) {
        if (button7.getText()==""&& textView.getText() == "") {
            button7.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8(View view) {
        if (button8.getText()==""&& textView.getText() == "") {
            button8.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9(View view) {
        if (button9.getText()==""&& textView.getText() == "") {
            button9.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public  void isPlayerWinner () {
        if ( button1.getText() == krest && button2.getText() == krest && button3.getText() == krest) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        } else
        if ( button4.getText() == krest && button5.getText() == krest && button6.getText() == krest) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if ( button7.getText() == krest && button8.getText() == krest && button9.getText() == krest) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if ( button1.getText() == krest && button4.getText() == krest && button7.getText() == krest) {
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if ( button2.getText() == krest && button5.getText() == krest && button8.getText() == krest) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if ( button3.getText() == krest && button6.getText() == krest && button9.getText() == krest) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if ( button1.getText() == krest && button5.getText() == krest && button9.getText() == krest) {
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if ( button3.getText() == krest && button5.getText() == krest && button7.getText() == krest) {
            button3.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if ( button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            textView.setText(R.string.draw_message);
        }

    }

    public  void isPСWinner () {
        Log.i("hodPC","pointsOfPC - " + pointsOfPC);
        if ( button1.getText() == nol && button2.getText() == nol && button3.getText() == nol) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            pcPoints.setText(""+pointsOfPC);
            editor.putInt("pointsOfPC", pointsOfPC);
            editor.apply();
        }else
        if ( button4.getText() == nol && button5.getText() == nol && button6.getText() == nol) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            pcPoints.setText(""+pointsOfPC);
            editor.putInt("pointsOfPC", pointsOfPC);
            editor.apply();
        }else
        if ( button7.getText() == nol && button8.getText() == nol && button9.getText() == nol) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            pcPoints.setText(""+pointsOfPC);
            editor.putInt("pointsOfPC", pointsOfPC);
            editor.apply();
        }else
        if ( button1.getText() == nol && button4.getText() == nol && button7.getText() == nol) {
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            pcPoints.setText(""+pointsOfPC);
            editor.putInt("pointsOfPC", pointsOfPC);
            editor.apply();
        }else
        if ( button2.getText() == nol && button5.getText() == nol && button8.getText() == nol) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            pcPoints.setText(""+pointsOfPC);
            editor.putInt("pointsOfPC", pointsOfPC);
            editor.apply();
        }else
        if ( button3.getText() == nol && button6.getText() == nol && button9.getText() == nol) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            pcPoints.setText(""+pointsOfPC);
            editor.putInt("pointsOfPC", pointsOfPC);
            editor.apply();
        }else
        if ( button1.getText() == nol && button5.getText() == nol && button9.getText() == nol) {
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            pcPoints.setText(""+pointsOfPC);
            editor.putInt("pointsOfPC", pointsOfPC);
            editor.apply();
        }else
        if ( button3.getText() == nol && button5.getText() == nol && button7.getText() == nol) {
            button3.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            pcPoints.setText(""+pointsOfPC);
            editor.putInt("pointsOfPC", pointsOfPC);
            editor.apply();
        }

    }

    private void hodPC() {
        Random random = new Random();
        int buttonPcClick = 1 + random.nextInt(9);
        Log.i("hodPC","buttonPcClick - " + buttonPcClick);
        switch(buttonPcClick) {
            case (1):  if (button1.getText() == ""){
                button1.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
            case (2):  if (button2.getText() == ""){
                button2.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
            case (3):  if (button3.getText() == ""){
                button3.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
            case (4):  if (button4.getText() == ""){
                button4.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
            case (5):  if (button5.getText() == ""){
                button5.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
            case (6):  if (button6.getText() == ""){
                button6.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
            case (7): if (button7.getText() == ""){
                button7.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
            case (8): if (button8.getText() == ""){
                button8.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
            case (9): if (button9.getText() == ""){
                button9.setText(nol); isPСWinner();
            } else{hodPC();}
                break;
        }
    }

    public void clickRestar(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");

        button1.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button2.setBackgroundColor(button2.getContext().getResources().getColor(R.color.purple_500));
        button3.setBackgroundColor(button3.getContext().getResources().getColor(R.color.purple_500));
        button4.setBackgroundColor(button4.getContext().getResources().getColor(R.color.purple_500));
        button5.setBackgroundColor(button5.getContext().getResources().getColor(R.color.purple_500));
        button6.setBackgroundColor(button6.getContext().getResources().getColor(R.color.purple_500));
        button7.setBackgroundColor(button7.getContext().getResources().getColor(R.color.purple_500));
        button8.setBackgroundColor(button8.getContext().getResources().getColor(R.color.purple_500));
        button9.setBackgroundColor(button9.getContext().getResources().getColor(R.color.purple_500));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(KrestikiNoliki.this, MainActivity.class));
        finish();
    }

    public void onBackMenu(View view) {
        onBackPressed();
    }

    public void onSettingClick(View view) {
        startActivity(new Intent(KrestikiNoliki.this, SettingKrestikiActivity.class));
        finish();
    }
}