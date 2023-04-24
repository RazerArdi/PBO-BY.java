package Modul3CODELAB1;
import Modul3CODELAB1.Converter;
import java.util.Scanner;

public class Modul3Practice {
    private double value;

    public static void main(String[] args) {
        Converter yc = new Converter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yard Converter to m, cm, feet & miles");
        System.out.println("1. Yard to M");
        System.out.println("2. Yard to CM");
        System.out.println("3. Yard to Feet");
        System.out.println("4. Yard to Miles");
        System.out.print("Pilih Menu: ");
        int menu = scanner.nextInt();
        System.out.print("Masukkan Yard: ");
        double yard = scanner.nextDouble();
        switch (menu) {
            case 1:
                yc.setValue(yard, "m");
                System.out.println("Hasil konversi:" + yc.getValue() + " m");
                break;
            case 2:
                yc.setValue(yard, "cm");
                System.out.println("Hasil konversi:" + yc.getValue() + " cm");
                break;
            case 3:
                yc.setValue(yard, "feet");
                System.out.println("Hasil konversi:" + yc.getValue() + " feet");
                break;
            case 4:
                yc.setValue(yard, "miles");
                System.out.println("Hasil konversi:" + yc.getValue() + " miles");
                break;
            default:
                System.out.println("Pilih yang betul!!!Butakah?");
                break;
        }
    }
}
