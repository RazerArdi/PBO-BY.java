package Modul4CODELAB;
import Modul4CODELAB.IKarnivora;
import Modul4CODELAB.IHerbivora;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.getInfo();
        System.out.println("=========================================");

        Beruang beruang = new Beruang();
        beruang.getInfo();
        System.out.println("=========================================");

        Kuda kuda = new Kuda();
        kuda.getInfo();
        System.out.println("=========================================");

        Anjing anjing = new Anjing();
        anjing.getInfo();
        System.out.println("=========================================");
    }
}
