package Modul2KEGIATAN1.bangun3D;
import Modul2KEGIATAN1.LKBangun3D;

public class Bola extends LKBangun3D {
    private double jariJari;

    public Bola() {
        super();
        jariJari = 0;
    }

    public void setJariJari(double r) {

        jariJari = r;
    }

    public double getJariJari() {

        return jariJari;
    }

    public double hitungVolume() {
        setVolume((4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3));
        return 0;
    }

    public void infoBangun() {
        System.out.println("Bola");
        System.out.println("Jari-jari : " + jariJari);
        System.out.println("Volume    : " + getVolume());
    }
}
