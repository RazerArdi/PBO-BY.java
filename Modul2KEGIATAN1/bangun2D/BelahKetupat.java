package Modul2KEGIATAN1.bangun2D;

import Modul2KEGIATAN1.LKBangun2D;

public class BelahKetupat extends LKBangun2D {
    private double sisi;
    private double d1;
    private double d2;

    public BelahKetupat() {
        super();
        this.sisi = sisi;
        this.d1 = d1;
        this.d2 = d2;
    }

    public void hitungKeliling() {
        setKeliling(4 * sisi);
    }

    public void hitungLuas() {
        setLuas((d1 * d2) / 2);
    }

    public void infoBangun() {
        System.out.println("Belah Ketupat");
        System.out.println("Sisi: " + sisi);
        System.out.println("Diagonal 1: " + d1);
        System.out.println("Diagonal 2: " + d2);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas: " + getLuas());
    }

    public void setSisi(double sisi) {

        this.sisi = sisi;
    }

    public double getSisi() {

        return sisi;
    }

    public void setD1(double d1) {

        this.d1 = d1;
    }

    public double getD1() {

        return d1;
    }

    public void setD2(double d2) {

        this.d2 = d2;
    }

    public double getD2() {

        return d2;
    }
}
