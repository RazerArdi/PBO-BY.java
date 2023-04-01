package Modul3KEGIATAN1;

public class yi1813mod2579 {
    public static void main(String[] args) {
        int yi = 232;
        int modulus = 2579;

        for (int i = 1; i <= 1813; i++) {
            int T = modPow(yi, i, modulus);
            System.out.println(yi + "^" + i + " mod " + modulus + " = " + T);
        }
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