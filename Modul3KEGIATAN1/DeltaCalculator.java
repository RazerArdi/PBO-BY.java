package Modul3KEGIATAN1;
public class DeltaCalculator {
    public static void main(String[] args) {
        int ki = 256;
        int m1 = 72;
        int modulus = 2579;

        // Hitung nilai 949^ki
        int power = 1;
        for (int i = 0; i < ki; i++) {
            power = (power * 949) % modulus;
            System.out.println("949^" + (i + 1) + " mod " + modulus + " = " + power);
        }

        // Hitung nilai δ = 949^ki.m1 mod 2579
        int delta = (power * m1) % modulus;

        // Tampilkan output
        System.out.println("δ = 949^" + ki + " . " + m1 + " mod " + modulus + " = " + delta);
        /*
        δ = (949^113 * 89) mod 2579
          = (2257 * 89) mod 2579
          = 200933 mod 2579
          = 2290
          Jadi, nilai δ adalah 2290.
         */
    }
}
