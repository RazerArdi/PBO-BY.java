public class Pelanggan {
    private String NamaDepan;
    private String namaBelakang;
    public void setNamaDepan(String namaDepan){
        this.setNamaDepan(namaDepan);
    }

    public Pelanggan(){
        this.NamaDepan = "NO";
        this.namaBelakang = "Kntol";
    }
    public Pelanggan(String namaDepan, String namaBelakang){
        this.NamaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }
    public void setNamaBelakang(String namaBelakang){
        this.namaBelakang = namaBelakang;
    }
    public String NamaLengkap(){
        this.namaBelakang=" "+namaBelakang;
        String NamaLengkap = NamaDepan.concat(namaBelakang);
        return NamaLengkap;
    }
}

