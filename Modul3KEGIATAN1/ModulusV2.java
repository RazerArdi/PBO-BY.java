package Modul3KEGIATAN1;

public class ModulusV2 {
    public static void main(String[] args) {
        int[] kValues = {36, 292};
        int[] resultValues = new int[kValues.length];
        int[] aaValues = new int[kValues.length];
        int[] dkValues = new int[kValues.length];

        // Hitung 2^ki mod 2579 untuk setiap k
        for (int i = 0; i < kValues.length; i++) {
            int ki = kValues[i];
            int result = 1;
            int base = 2 % 2579;
            while (ki > 0) {
                if (ki % 2 == 1) {
                    result = (result * base) % 2579;
                }
                base = (base * base) % 2579;
                ki /= 2;
            }
            resultValues[i] = result;
        }

        // Hitung nilai aa dan dk untuk setiap k
        aaValues[0] = resultValues[0];
        dkValues[0] = resultValues[0];
        for (int i = 1; i < kValues.length; i++) {
            int aa = (resultValues[i - 1] * resultValues[i - 1]) % 2579;
            int dk = aa;
            aaValues[i] = aa;
            dkValues[i] = dk;
        }

        // Cetak output
        for (int i = 0; i < kValues.length; i++) {
            int ki = kValues[i];
            int result = resultValues[i];
            int aa = aaValues[i];
            int dk = dkValues[i];
            int hooh = dk * dk;
            System.out.println("2^" + ki + " mod 2579 = " + result);
            if (i < kValues.length - 1) {
                System.out.println("\n" + "2^" + (ki * 2) + " mod 2579 = [" + aa + "][" + aa + "] mod 2579 = " + hooh);
            }
        }
    }
}
