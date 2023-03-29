package Modul3KEGIATAN1;

public class CB1 {
    public static void main(String[] args) {
        int base = 2;
        int modulus = 2579;
        int k = 2;
        int max_k = 110;
        int result;

        // Menghitung 2^ki mod 2579 untuk k = 2, 4, 8, 16, 32, 64, 110
        while (k <= max_k) {
            result = moduloPower(base, k, modulus);
            System.out.printf("2^%d mod %d = %d%n", k, modulus, result);
            k *= 2;
        }

        // Menghitung 2^118 mod 2579
        int dk1 = 64;
        int dk2 = 46;
        int aa = moduloPower(base, dk1, modulus);
        int dd = moduloPower(aa, dk2, modulus);
        System.out.printf("%n2^118 mod %d = (%d mod %d)(%d mod %d) mod %d = %d%n",
                modulus, aa, modulus, moduloPower(base, dk2, modulus), modulus, modulus, dd);
    }

    // Menghitung base^exponent mod modulus menggunakan metode pangkat biner
    public static int moduloPower(int base, int exponent, int modulus) {
        int result = 1;
        base = base % modulus;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % modulus;
            }
            exponent = exponent >> 1;
            base = (base * base) % modulus;
        }
        return result;
    }
}



