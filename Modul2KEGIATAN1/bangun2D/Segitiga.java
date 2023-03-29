package Modul2KEGIATAN1.bangun2D;

import Modul2KEGIATAN1.LKBangun2D;

public class Segitiga extends LKBangun2D {
    public double alas5;
    public double tinggi5;
    public Segitiga() {
        super();
        this.alas5 = alas5;
        this.tinggi5 = tinggi5;
    }

    public void hitungLuas() {
        double luas = 0.5 * alas5 * tinggi5;
        setLuas(luas);
        System.out.println("Luas segitiga dengan alas " + alas5 + " dan tinggi " + tinggi5 + " adalah " + luas);
    }

    public void hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas5 / 2, 2) + Math.pow(tinggi5, 2));
        double keliling = alas5 + (2 * sisiMiring);
        setKeliling(keliling);
        System.out.println("Keliling segitiga dengan alas " + alas5 + " dan tinggi " + tinggi5 + " adalah " + keliling);
    }

    public void infoBangun() {
        System.out.println("Segitiga dengan alas " + alas5 + " dan tinggi " + tinggi5);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    public double getAlas() {
        return alas5;
    }

    public void setAlas5(double alas5) {
        this.luas = alas5;
    }

    public double getTinggi5() {
        return tinggi5;
    }

    public void setTinggi(double tinggi5) {
        this.tinggi5 = tinggi5;
    }

}
