package Modul2KEGIATAN1.bangun3D;
import Modul2KEGIATAN1.LKBangun3D;

public class Kubus extends LKBangun3D {
    private double rusuk;

    public Kubus() {
        super();
        this.rusuk = rusuk;
    }

    public double hitungVolume() {
         return setVolume(rusuk * rusuk * rusuk);
    }

    public void infoBangun() {
        System.out.println("Kubus dengan rusuk " + getVolume());
    }

    public void setRusuk(double rusuk) {

        this.rusuk = rusuk;
    }

    public double getRusuk() {

        return rusuk;
    }
}
