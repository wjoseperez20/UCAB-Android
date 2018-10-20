package com.example.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.droidcafe.App.Logica.DroidCafe;
import com.example.droidcafe.App.MainApp;

public class OrderActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = OrderActivity.class.getSimpleName();

    private StringBuilder stringBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.sameday:
                if(checked)
                    setSameDay();
                break;
            case R.id.nextday:
                if(checked)
                    setNextDay();
                break;
            case R.id.pickup:
                if(checked)
                    setPickUp();
                break;
            default:
                Log.i(TAG_ACTIVITY, getResources().getString(R.string.nothing_clicked));
                break;
        }
    }

    private void setSameDay(){

        defaultPrefixString();

        stringBuilder.append(getResources().getString(R.string.radio_same_day));

        displayToast(stringBuilder.toString());
    }

    private void setNextDay(){

        defaultPrefixString();

        stringBuilder.append(getResources().getString(R.string.radio_next_day));

        displayToast(stringBuilder.toString());
    }

    private void setPickUp(){

        defaultPrefixString();

        stringBuilder.append(getResources().getString(R.string.radio_pick_up));

        displayToast(stringBuilder.toString());
    }

    private void defaultPrefixString(){
        stringBuilder = new StringBuilder();
        stringBuilder.append(getResources().getString(R.string.chosen));
        stringBuilder.append(" ");
    }
}
