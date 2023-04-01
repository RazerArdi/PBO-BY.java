package Modul3KEGIATAN1;

import java.util.Scanner;

public class DekripsiElgama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai y1: ");
        int y1 = input.nextInt();

        System.out.print("Masukkan nilai delta i: ");
        int delta = input.nextInt();

        int T = modPow(y1, 1813, 2579);
        int mi = (delta * T) % 2579;
        char ascii = (char) mi;

        System.out.println("Nilai T: " + T);
        System.out.println("       : " + T);
        System.out.println("Nilai mi: " + mi);
        System.out.println("Konversi ASCII: " + ascii);
    }

    public static int modPow(int base, int exponent, int modulus) {
        if (modulus == 1) return 0;
        int result = 1;
        base %= modulus;
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                result = (result * base) % modulus;
            exponent >>= 1;
            base = (base * base) % modulus;
        }
        return result;
    }
}



