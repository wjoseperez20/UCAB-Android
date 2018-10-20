package com.example.droidcafe.App.Logica;


import android.content.Context;
import android.util.Log;

import com.example.droidcafe.App.Modelo.Donut;
import com.example.droidcafe.App.Modelo.Food;
import com.example.droidcafe.App.Modelo.FroYo;
import com.example.droidcafe.App.Modelo.IceCream;
import com.example.droidcafe.R;

public class DroidCafe {

    private Food _iceCream;
    private Food _froYo;
    private Food _donut;

    private Context _appContext;


    public void Init(Context appContext){
        this._appContext = appContext;

        this._iceCream = new IceCream(this._appContext.getResources().getString(R.string.ice_description),
                this._appContext.getResources().getString(R.string.ice_order_message));

        this._froYo = new FroYo(this._appContext.getResources().getString(R.string.froyo_description),
                this._appContext.getResources().getString(R.string.froyo_order_message));

        this._donut = new Donut(this._appContext.getResources().getString(R.string.donut_description),
                this._appContext.getResources().getString(R.string.donut_order_message));

    }

    public String getOrderIceCream(){
        return  this._iceCream.getOrdenMensaje();
    }

    public  String getOrderFroYo(){
        return this._froYo.getOrdenMensaje();
    }

    public  String getOrderDonut(){
        return this._donut.getOrdenMensaje();
    }
}
