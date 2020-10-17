package com.example.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class userinfo extends AppCompatActivity {
    private TextView name1;
    private TextView name2;
    private Button button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

        name1 = findViewById(R.id.player1name);
        name2 = findViewById(R.id.player2name);
        button = findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact();
            }
        });
    }
        public  void openact() {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }


    }

