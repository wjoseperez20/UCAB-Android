package com.example.droidcafe.App;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.example.droidcafe.App.Logica.DroidCafe;


public class MainApp extends Application {

    private static DroidCafe _droidCafe;

    public MainApp(){
        _droidCafe = new DroidCafe();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        _droidCafe.Init(this);
    }

    public static DroidCafe getDroidCafe(){
        return _droidCafe;
    }
}
