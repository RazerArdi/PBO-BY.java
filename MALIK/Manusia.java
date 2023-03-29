package MALIK;

public class Manusia {
    public String nama;
    public String nim;
    public String jurusan;
    public String KELAS;

    public Manusia(String nama, String nim, String jurusan, String KELAS) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.KELAS = KELAS;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getKELAS() {
        return KELAS;
    }
}
