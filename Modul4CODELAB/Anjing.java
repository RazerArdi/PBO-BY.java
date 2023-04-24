package Modul4CODELAB;

public class Anjing extends HEWAN implements IKarnivora{
    public <T> T getters() { return null; }
    public <T> void setters(T param) {}

    // Define the constructor
    public Anjing() {
        this.suara = "Gug-Gug";
    }
    public void tampilMakanan() {
        System.out.println("Makanan: Daging");
    }
    // Override the getJenisHewan method
    @Override
    public String getJenisHewan() {
        return "Karnivora";
    }

    // Override the getMakanan method
    @Override
    public String getMakanan() {
        return "Daging";
    }
}
