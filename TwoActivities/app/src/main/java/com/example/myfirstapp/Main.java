package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    private EditText editText;
    private TextView textReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Init();
        this.LoadInformation();

    }

    private  void Init(){
        this.textReply = findViewById(R.id.text_reply_main);
        this.editText = findViewById(R.id.text_main);
    }

    private void LoadInformation(){
        this.textReply.setText(getIntent().getStringExtra("reply"));
    }

    public void lunchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message",this.editText.getText().toString());
        this.editText.setText(null);
        startActivity(intent);
    }
}
