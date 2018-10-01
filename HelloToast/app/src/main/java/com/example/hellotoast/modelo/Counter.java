package com.example.hellotoast.modelo;

public class Counter {

    private int _count;
    private String _mensaje;

    public int getCount() {
        return this._count;
    }

    public void setCount(int value){
        this._count = value;
    }

    public String getMensaje() {
        return this._mensaje;
    }

    public void setMensaje(String value){
        this._mensaje = value;
    }

    public Counter(String mensaje){
        this._mensaje = mensaje;
    }

    public void doCount(){
        this._count++;
    }
}
