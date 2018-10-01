package com.example.hellotoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hellotoast.logica.MainLogic;

public class MainActivity extends AppCompatActivity {


    Button bToast;
    Button bCount;
    TextView tShowCount;
    MainLogic logica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        logica = new MainLogic(getResources().getString(R.string.toast_message));

        this.init();
        this.setListeners();

    }

    private void init() {
        setContentView(R.layout.activity_main);

        this.bCount = findViewById(R.id.bCount);
        this.bToast = findViewById(R.id.bToast);
        this.tShowCount = findViewById(R.id.tshowCount);
    }

    private void setListeners() {
        this.bCount.setOnClickListener(onCount);
        this.bToast.setOnClickListener(onToast);
    }


    View.OnClickListener onCount = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tShowCount.setText(logica.doCount());
        }
    };

    View.OnClickListener onToast = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast toast = Toast.makeText(getApplicationContext(), logica.doAlert(), Toast.LENGTH_LONG);
            toast.show();
        }
    };
}
