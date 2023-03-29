package Modul2KEGIATAN1;
import java.util.Scanner;
import Modul2KEGIATAN1.LKBangun2D;
import Modul2KEGIATAN1.LKBangun3D;
import Modul2KEGIATAN1.bangun2D.PersegiPanjang;
import Modul2KEGIATAN1.bangun2D.Segitiga;
import Modul2KEGIATAN1.bangun2D.Persegi;
import Modul2KEGIATAN1.bangun2D.Lingkaran;
import Modul2KEGIATAN1.bangun2D.JajarGenjang;
import Modul2KEGIATAN1.bangun2D.BelahKetupat;
import Modul2KEGIATAN1.bangun3D.Balok;
import Modul2KEGIATAN1.bangun3D.Bola;
import Modul2KEGIATAN1.bangun3D.Kerucut;
import Modul2KEGIATAN1.bangun3D.Kubus;
import Modul2KEGIATAN1.bangun3D.Tabung;

    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int pilihan;
            do {
                System.out.println("Aplikasi Penghitungan Bangun Ruang & Datar");
                System.out.println("== Main Menu ==");
                System.out.println("1. Hitung Bangun 2D");
                System.out.println("2. Hitung Bangun 3D");
                System.out.println("3. Keluar");
                System.out.println("Pilih Menu: ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        Hitung2D();
                        break;
                    case 2:
                        Hitung3D();
                        break;
                    case 3:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
            } while (pilihan != 3);
        }
        public static void Hitung2D() {
            Scanner input = new Scanner(System.in);
            int pilihan;
            do {
                System.out.println("== Hitung Bangun 2D ==");
                System.out.println("1. Persegi Panjang");
                System.out.println("2. JajarGenjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Persegi");
                System.out.println("5. Segitiga");
                System.out.println("6. Belah Ketupat");
                System.out.println("7. Kembali ke menu utama");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan panjang persegi panjang: ");
                        double panjang = input.nextDouble();
                        System.out.print("Masukkan lebar persegi panjang: ");
                        double lebar = input.nextDouble();
                        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                        pp.hitungKeliling();
                        pp.hitungLuas();
                        pp.infoBangun();
                        break;
                    case 2:
                        System.out.print("Masukkan alas jajar genjang: ");
                        double alas = input.nextDouble();
                        System.out.print("Masukkan tinggi jajar genjang: ");
                        double tinggi = input.nextDouble();
                        System.out.print("Masukkan sisi miring jajar genjang: ");
                        double miring = input.nextDouble();
                        JajarGenjang jg = new JajarGenjang();
                        jg.setAlas(alas);
                        jg.setTinggi(tinggi);
                        jg.setMiring(miring);
                        jg.hitungLuas();
                        jg.hitungKeliling();
                        jg.infoBangun();
                        break;
                    case 3:
                        Lingkaran lingkaran = new Lingkaran();
                        System.out.print("Masukkan jari-jari lingkaran: ");
                        double jarijari = input.nextDouble();
                        lingkaran.setJarijari(jarijari);
                        lingkaran.hitungLuas();
                        lingkaran.hitungKeliling();
                        lingkaran.infoBangun();
                        break;
                    case 4:
                        Persegi persegi = new Persegi();
                        System.out.print("Masukkan panjang sisi persegi: ");
                        double sisi = input.nextDouble();
                        persegi.setSisi(sisi);
                        persegi.hitungLuas();
                        persegi.hitungKeliling();
                        persegi.infoBangun();
                        break;
                    case 5:
                        Segitiga ss = new Segitiga();
                        System.out.print("Masukkan alas segitiga: ");
                        double alas5 = input.nextDouble();
                        System.out.print("Masukkan tinggi segitiga: ");
                        double tinggi5 = input.nextDouble();
                        ss.hitungLuas();
                        ss.hitungKeliling();
                        ss.infoBangun();
                        break;
                    case 6:
                        BelahKetupat belahketupat = new BelahKetupat();
                        System.out.print("Masukkan sisi: ");
                        sisi = input.nextDouble();
                        System.out.print("Masukkan diagonal 1: ");
                        double d1 = input.nextDouble();
                        System.out.print("Masukkan diagonal 2: ");
                        double d2 = input.nextDouble();
                        belahketupat.setSisi(sisi);
                        belahketupat.setD1(d1);
                        belahketupat.setD2(d2);
                        belahketupat.hitungLuas();
                        belahketupat.hitungKeliling();
                        belahketupat.infoBangun();
                        break;
                    case 7:
                        System.out.println("Oke");
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
            }while (pilihan != 7);
        }
        public static void Hitung3D() {
            Scanner input = new Scanner(System.in);
            int pilihan;
            do {
                System.out.println("== Hitung Bangun 3D ==");
                System.out.println("1. Balok");
                System.out.println("2. Bola");
                System.out.println("3. Kerucut");
                System.out.println("4. Kubus");
                System.out.println("5. Tabung");
                System.out.println("6. Kembali ke menu utama");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        Balok balok = new Balok();
                        System.out.print("Masukkan panjang balok: ");
                        double panjang = input.nextDouble();
                        balok.setPanjang(panjang);
                        System.out.print("Masukkan lebar balok: ");
                        double lebar = input.nextDouble();
                        balok.setLebar(lebar);
                        System.out.print("Masukkan tinggi balok: ");
                        double tinggi = input.nextDouble();
                        balok.setTinggi(tinggi);
                        balok.hitungVolume();
                        System.out.println("Volume balok: " + balok.getVolume());
                        break;
                    case 2:
                        System.out.print("Masukkan jari-jari bola: ");
                        double jariJari = input.nextDouble();

                        Bola bola = new Bola();
                        bola.setJariJari(jariJari);
                        bola.hitungVolume();
                        bola.infoBangun();
                        break;
                    case 3:
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Masukkan jari-jari kerucut: ");
                        jariJari = sc.nextDouble();
                        System.out.print("Masukkan tinggi kerucut: ");
                        double tinggi3 = sc.nextDouble();

                        Kerucut kerucut = new Kerucut();
                        kerucut.setJariJari(jariJari);
                        kerucut.setTinggi(tinggi3);
                        kerucut.hitungVolume();
                        kerucut.infoBangun();

                        System.out.println("Jari-jari: " + kerucut.getJariJari());
                        System.out.println("Tinggi: " + kerucut.getTinggi());
                        System.out.println("Volume: " + kerucut.getVolume());
                        break;
                    case 4:
                        Kubus kubus = new Kubus();
                        System.out.print("Masukkan panjang rusuk kubus: ");
                        double rusuk = input.nextDouble();
                        kubus.setRusuk(rusuk);
                        kubus.hitungVolume();
                        kubus.infoBangun();

                        break;
                    case 5:
                        Tabung tb = new Tabung();
                        System.out.print("Masukkan jari-jari tabung: ");
                        jariJari = input.nextDouble();
                        System.out.print("Masukkan tinggi tabung: ");
                        tinggi = input.nextDouble();
                        tb.hitungVolume();
                        tb.infoBangun();
                        break;
                    case 6:
                        System.out.println("Oke");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
            } while (pilihan != 6);
        }
    }