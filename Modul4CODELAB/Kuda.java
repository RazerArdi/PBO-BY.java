package Modul4CODELAB;

public class Kuda extends HEWAN implements IHerbivora{
    public Kuda() {
        this.suara = "hihihihi";
    }

    @Override
    public void tampilMakanan() {
        System.out.println("Makanan: Tumbuhan");
    }

    @Override
    public String getJenisHewan() {
        return "Herbivora";
    }

    @Override
    public String getMakanan() {
        return "Tumbuhan";
    }

    public <T> T getters() { return null; }
    public <T> void setters(T param){}

}
