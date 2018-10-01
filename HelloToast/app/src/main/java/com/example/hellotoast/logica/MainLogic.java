package com.example.hellotoast.logica;

import com.example.hellotoast.modelo.Counter;

public class MainLogic {

    private Counter counter;

    public MainLogic(String mensaje){
        this.counter = new Counter(mensaje);
    }

    public String doCount(){
        this.counter.doCount();

        return  String.valueOf(this.counter.getCount());
    }

    public String doAlert(){

        return this.counter.getMensaje();
    }
}
