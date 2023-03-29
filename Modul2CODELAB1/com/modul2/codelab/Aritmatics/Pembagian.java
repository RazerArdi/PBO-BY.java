package Modul2CODELAB1.com.modul2.codelab.Aritmatics;

import Modul2CODELAB1.com.modul2.codelab.Operator;

public class Pembagian extends Operator {
    @Override // mereturn
    public double operation(double a, double b, double c){
        //Tempat rumus
        return a / b / c;
    }
    @Override
    public double operation(double a, double b){
        //Tempat rumus
        return a / b;
    }
    
}
