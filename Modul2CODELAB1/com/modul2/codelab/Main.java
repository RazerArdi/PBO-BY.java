package Modul2CODELAB1.com.modul2.codelab;

import Modul2CODELAB1.com.modul2.codelab.Aritmatics.Pembagian;
import Modul2CODELAB1.com.modul2.codelab.Aritmatics.Pengurangan;
import Modul2CODELAB1.com.modul2.codelab.Aritmatics.Penjumlahan;
import Modul2CODELAB1.com.modul2.codelab.Aritmatics.Perkalian;

public class Main {
    public static void main(String[] args){
        Pembagian bagi = new Pembagian();
        Pengurangan kurang = new Pengurangan();
        Penjumlahan jumlah = new Penjumlahan();
        Perkalian kali = new Perkalian();

        System.out.println(bagi.operation(10, 2));
        System.out.println(bagi.operation(1000,50,2));
        System.out.println(kurang.operation(50,5));
        System.out.println(kurang.operation(50,5,5));
        System.out.println(jumlah.operation(5,5));
        System.out.println(jumlah.operation(5,5,10));
        System.out.println(kali.operation(4,5));
        System.out.println(kali.operation(5,5,5));
    }
}
