package Modul2KEGIATAN1.bangun3D;
import Modul2KEGIATAN1.LKBangun3D;

public class Tabung extends LKBangun3D {
    private double jariJari;
    private double tinggi;

    public Tabung() {
        super();
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        setVolume(volume);
        return volume;
    }

    @Override
    public void infoBangun() {
        System.out.println("Tabung");
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Tinggi: " + getTinggi());
        System.out.println("Volume: " + getVolume());
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
