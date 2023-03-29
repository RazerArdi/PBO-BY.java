package Modul2KEGIATAN1.bangun2D;

import Modul2KEGIATAN1.LKBangun2D;

public class JajarGenjang extends LKBangun2D {
    private double alas;
    private double tinggi;
    private double miring;

    public JajarGenjang() {
        super();
        alas = 0;
        tinggi = 0;
        miring = 0;
    }

    public void setAlas(double a) {
        alas = a;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double t) {
        tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setMiring(double m) {
        miring = m;
    }

    public double getMiring() {
        return miring;
    }

    public void hitungLuas() {
        setLuas(alas * tinggi);
    }

    public void hitungKeliling() {
        setKeliling(2 * (alas + miring));
    }

    public void infoBangun() {
        System.out.println("Jajar Genjang");
        System.out.println("Alas      : " + alas);
        System.out.println("Tinggi    : " + tinggi);
        System.out.println("Miring    : " + miring);
        System.out.println("Luas      : " + getLuas());
        System.out.println("Keliling  : " + getKeliling());
    }
}
