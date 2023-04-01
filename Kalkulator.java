
public class Kalkulator {
    public static void main(String [] args) {
        System.out.println("Hasil Penjumlahan :" + penjumlahan(2, 3));
        System.out.println("Hasil Pengurangan :" + pengurangan(10, 3));
        System.out.println("Hasil Pekalian :" + perkalian(2, 2));
        System.out.println("Hasil Pembagian :" + pembagian(10, 2));
    }
    static int penjumlahan(int var1,int var2){

        return (var1 + var2);
    }
    static int perkalian(int var1,int var2){

        return (var1 * var2);
    }
    static int pembagian(int var1,int var2){

        return (var1 / var2);
    }
    static int pengurangan(int var1,int var2){

        return (var1 - var2);
    }
}
