package Modul2KEGIATAN1.bangun2D;

import Modul2KEGIATAN1.LKBangun2D;

public class Persegi extends LKBangun2D {
    private double sisi;

    public Persegi() {
        super();
        sisi = 0;
    }

    public void setSisi(double s) {
        sisi = s;
    }

    public double getSisi() {
        return sisi;
    }

    public void hitungLuas() {
        setLuas(sisi * sisi);
    }

    public void hitungKeliling() {
        setKeliling(4 * sisi);
    }

    public void infoBangun() {
        System.out.println("Persegi");
        System.out.println("Sisi     : " + getSisi());
        System.out.println("Luas     : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}






