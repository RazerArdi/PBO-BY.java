package MALIK.ANGGOTA;
import MALIK.Manusia;

public class Malikul extends Manusia {
    public String TTL;

    public Malikul(String nama, String nim, String jurusan, String KELAS, String TTL) {
        super(nama, nim, jurusan, KELAS);
        this.TTL = TTL;

    }

    public String getTTL() {
        return TTL;
    }

}