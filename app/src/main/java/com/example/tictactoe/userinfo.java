      package com.example.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class userinfo extends AppCompatActivity {
public static final  String ply1=" com.example.tictactoe";
    public static final  String ply2=" com.example.tictactoe";
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

       Button  button;
        button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact();
            }
        });
    }
        public  void openact() {
            EditText player1=(EditText)findViewById(R.id.player1name);
            EditText player2=(EditText)findViewById(R.id.player2name);
            String text1=player1.getText().toString();
            String text2=player2.getText().toString();
            int size1=text1.length();
            int size2=text2.length();
            if(size1==0&&size2==0)
            {
                Toast.makeText(this, "Please Enter the Player Name(0-9 Characters)", Toast.LENGTH_SHORT).show();
            }
            Intent in =new Intent(userinfo.this,MainActivity.class);
            if (size1>9 && size2>9)
            {
                Toast.makeText(this, "Please Enter Valid Player Name(0-9 Characters)", Toast.LENGTH_SHORT).show();
            }
            else
            {
                in=in.putExtra(ply1,text1);
                in= in.putExtra(ply2,text2);
                startActivity(in);
            }

            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }




}

