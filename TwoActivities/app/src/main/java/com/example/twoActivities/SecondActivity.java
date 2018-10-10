package com.example.twoActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textMessage;
    EditText textBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.Init();
        this.LoadInformation();
    }

    private void Init() {
        this.textMessage = findViewById(R.id.text_message);
        this.textBack = findViewById(R.id.text_back);
    }

    private void LoadInformation() {
        this.textMessage.setText(getIntent().getStringExtra("message"));
    }

    public void launchBack(View view) {
        Intent intent = new Intent(this, Main.class);
        intent.putExtra("reply", this.textBack.getText().toString());
        this.textBack.setText(null);
        startActivity(intent);
    }
}
