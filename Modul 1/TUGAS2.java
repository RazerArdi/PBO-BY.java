/*
    +----------------------------------+
    |           TUGAS2                 |
    +----------------------------------+
    | - merk : String                  |
    | - harga : int                    |
    | - namaPelanggan                  |
    | - alamatPelanggan                |
    | - NomorTelepon                   |
    +----------------------------------+
    | + TUGAS2(merk: String, harga: int)|
    +----------------------------------+
    | + getMerk() : String             |
    | + setMerk(merk: String) : void   |
    | + getHarga() : int               |
    | + setHarga(harga: int) : void    |
    | + displayData() : void           |
    | + hitungTotalHarga(jumlahLaptop: int) : int|
    +----------------------------------+
    | + main(args: String[]) : void    |
    +----------------------------------+
 */


 import java.util.Scanner;

 public class TUGAS2 {
     // Atribut
     private String merk;
     private int harga;
 
     // Constructor
     public TUGAS2(String merk, int harga) {
         this.merk = merk;
         this.harga = harga;
     }
 
     // Getter and Setter methods
     public String getMerk() {
         return merk;
     }
 
     public void setMerk(String merk) {
         this.merk = merk;
     }
 
     public int getHarga() {
         return harga;
     }
 
     public void setHarga(int harga) {
         this.harga = harga;
     }
 
     // Method untuk menampilkan data laptop
     public void displayData() {
         System.out.println("Merk Laptop: " + merk);
         System.out.println("Harga Laptop: " + harga);
     }
 
     // Method untuk menghitung total harga laptop yang dibeli
     public int hitungTotalHarga(int jumlahLaptop) {
         return harga * jumlahLaptop;
     }
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Inisialisasi objek laptop
         TUGAS2 msi = new TUGAS2("MSI", 4500000);
         TUGAS2 asus = new TUGAS2("ASUS", 5000000);
         TUGAS2 lenovo = new TUGAS2("LENOVO", 5200000);
 
         System.out.println("== Program Penjualan Laptop ==");
 
         // Input data pelanggan
         System.out.print("Masukkan nama pelanggan: ");
         String namaPelanggan = scanner.nextLine();
 
         System.out.print("Masukkan alamat pelanggan: ");
         String alamatPelanggan = scanner.nextLine();
 
         System.out.print("Masukkan nomor telepon pelanggan: ");
         String nomorTelepon = scanner.nextLine();
 
         // Input data laptop
         System.out.println("\n== Data Laptop ==");
 
         System.out.println("Pilih merk laptop:");
         System.out.println("1. MSI");
         System.out.println("2. ASUS");
         System.out.println("3. LENOVO");
 
         System.out.print("Masukkan nomor merk laptop yang dipilih: ");
         int nomorMerk = scanner.nextInt();
 
         TUGAS2 laptopPilihan;
         switch (nomorMerk) {
             case 1:
                 laptopPilihan = msi;
                 break;
             case 2:
                 laptopPilihan = asus;
                 break;
             case 3:
                 laptopPilihan = lenovo;
                 break;
             default:
                 System.out.println("Nomor merk laptop tidak valid!");
                 return;
         }
 
         // Input jumlah laptop
         System.out.print("Masukkan jumlah laptop yang dibeli: ");
         int jumlahLaptop = scanner.nextInt();
 
         // Hitung total harga
         int totalHarga = laptopPilihan.hitungTotalHarga(jumlahLaptop);
 
         // Output data penjualan
         System.out.println("\n== Data Penjualan ==");
 
         System.out.println("Nama pelanggan: " + namaPelanggan);
         System.out.println("Alamat pelanggan: " + alamatPelanggan);
         System.out.println("Nomor telepon pelanggan: " + nomorTelepon);
 
         laptopPilihan.displayData();
         System.out.println("Jumlah laptop: " + jumlahLaptop);
         System.out.println("Total harga: " + totalHarga);
     }
 }