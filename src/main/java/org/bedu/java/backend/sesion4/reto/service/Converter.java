package org.bedu.java.backend.sesion4.reto.service;

public class Converter {
    public double mxnToUsd (double amount){
        return amount/18.90;
    }
    public double mxnToEur (double amount){
        return amount/20.05;
    }

    public double usdToMxn (double amount){
        return amount*18.90;
    }
    public double usdToEur (double amount){
        return amount/20.05;
    }
    public double eurToMxn (double amount){
        return amount*20.05;
    }
    public double eurToUsd (double amount){
        return amount*1.18;
    }

}
