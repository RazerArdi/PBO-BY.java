package Modul4CODELAB;

public class Kucing extends HEWAN implements IKarnivora,IHerbivora{
    public Kucing() {
        this.suara = "Meow";
    }

    @Override
    public void tampilMakanan() {
        System.out.println("Makanan: Daging");
    }

    @Override
    public String getJenisHewan() {
        return "Karnivora + Herbivora";
    }

    @Override
    public String getMakanan() {
        return "Daging + Tumbuhan";
    }

    public <T> T getters() { return null; }
    public <T> void setters(T param){}
}
