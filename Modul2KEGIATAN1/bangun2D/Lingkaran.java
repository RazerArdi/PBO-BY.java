package Modul2KEGIATAN1.bangun2D;

import Modul2KEGIATAN1.LKBangun2D;
public class Lingkaran extends LKBangun2D {
    private double jarijari;

    public Lingkaran() {
        super();
        jarijari = 0;
    }

    public void setJarijari(double r) {
        jarijari = r;
    }

    public double getJarijari() {
        return jarijari;
    }

    public void hitungLuas() {
        setLuas(Math.PI * jarijari * jarijari);
    }

    public void hitungKeliling() {
        setKeliling(2 * Math.PI * jarijari);
    }

    public void infoBangun() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari : " + jarijari);
        System.out.println("Luas      : " + getLuas());
        System.out.println("Keliling  : " + getKeliling());
    }
}
