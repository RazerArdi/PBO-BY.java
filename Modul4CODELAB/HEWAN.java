package Modul4CODELAB;

public abstract class HEWAN {
    public String suara;

    public abstract <T> T getters();
    public abstract <T> void setters(T param);

    public void bersuara() {
        System.out.println(suara);
    }

    public void getInfo() {
        System.out.println("Hewan: " + this.getClass().getSimpleName());
        System.out.println("Jenis: " + getJenisHewan());
        System.out.println("Makanan: " + getMakanan());
        System.out.println("Suara: " + suara);
    }

    public String getJenisHewan() {
        return "";
    }

    public String getMakanan() {
        return "";
    }
}

