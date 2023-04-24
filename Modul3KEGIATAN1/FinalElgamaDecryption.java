package Modul3KEGIATAN1;

import java.util.Scanner;

public class FinalElgamaDecryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yi = 2575;
        int pangkat = 1813;
        int modulus = 2579;

        for (int i = 1; i <= pangkat; i++) {
            int T = modPow(yi, i, modulus);
            System.out.println(yi + "^" + i + " mod " + modulus + " = " + T);
        }

        System.out.print("Masukkan nilai delta i: ");
        int delta = input.nextInt();

        int T = modPow(yi, pangkat, modulus);
        int mi = (delta * T) % modulus;
        char ascii = (char) mi;
        int HASIL = delta * T;
        int MD = HASIL % modulus;

        System.out.println("Nilai T: " + T);
        System.out.println("Nilai mi: " + mi);
        System.out.println("        : ("+delta+"."+yi+ "^" + pangkat + " mod " + modulus+") mod "+modulus);
        System.out.println("        : ("+delta+"."+T+") mod "+modulus);
        System.out.println("        : "+HASIL+" Mod "+modulus);
        System.out.println("        : "+MD);
        System.out.println("Konversi American Standard Code for Information Interchange (ASCII): " + ascii);
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


