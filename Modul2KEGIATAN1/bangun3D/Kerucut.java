package Modul2KEGIATAN1.bangun3D;
import Modul2KEGIATAN1.LKBangun3D;

public class Kerucut extends LKBangun3D {
    private double jariJari;
    private double tinggi3;

    public double hitungVolume() {
        return (1.0 / 3) * Math.PI * Math.pow(jariJari, 2) * tinggi3;
    }

    public void infoBangun() {
        System.out.println("Bangun ruang Kerucut");
    }

    public void setJariJari(double jariJari) {

        this.jariJari = jariJari;
    }

    public double getJariJari() {

        return jariJari;
    }

    public void setTinggi(double tinggi3) {

        this.tinggi3 = tinggi3;
    }

    public double getTinggi() {

        return tinggi3;
    }
}
