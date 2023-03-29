package Modul2KEGIATAN1.bangun2D;

import Modul2KEGIATAN1.LKBangun2D;

public class PersegiPanjang extends LKBangun2D {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super();
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungKeliling() {
        setKeliling(2 * (panjang + lebar));
    }

    public void hitungLuas() {
        setLuas(panjang * lebar);
    }

    public void infoBangun() {
        System.out.println("Persegi Panjang:");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }
}