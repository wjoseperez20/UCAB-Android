package com.example.droidcafe.App.Modelo;

public abstract class Food {

    protected String _mensaje;
    protected String _ordenMensaje;

    public String getMensaje() {
        return this._mensaje;
    }
    public String getOrdenMensaje() { return this._ordenMensaje; }
}
