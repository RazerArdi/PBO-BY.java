package Modul2KEGIATAN1.bangun3D;
import Modul2KEGIATAN1.LKBangun3D;

public class Balok extends LKBangun3D {
    private double panjang;
    private double lebar;
    private double tinggi;


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

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        setVolume(panjang * lebar * tinggi);
        return 0;
    }

    public void infoBangun() {
        System.out.println("Bangun 3D: Balok");
    }
}
