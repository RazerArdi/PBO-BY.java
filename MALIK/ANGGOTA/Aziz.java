package MALIK.ANGGOTA;
import MALIK.Manusia;

public class Aziz extends Manusia {
    public String TTL;

    public Aziz(String nama, String nim, String jurusan, String KELAS, String TTL) {
        super(nama, nim, jurusan, KELAS);
        this.TTL = TTL;
    }

    public String getTTL() {
        return TTL;
    }
}