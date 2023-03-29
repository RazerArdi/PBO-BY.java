package MALIK;

import MALIK.ANGGOTA.Malikul;
import MALIK.ANGGOTA.Aziz;
import MALIK.ANGGOTA.Rian;

public class Main {
    public static void main(String[] args) {

        Malikul mhs1 = new Malikul("Malikul Arifin", "005", "Teknik Industri", "2B", "Jombang, 23/08/2003");
        Aziz mhs2 = new Aziz("Muhammad Azizul Wahid", "033", "Teknik Industri", "2B", "Kalianda, 13/08/2004");
        Rian mhs3 = new Rian("Gandung Rian Saputro", "021", "Teknik Industri", "2B", "Bojonegoro, 13/01/2004");

        System.out.println("Biodata Anggota 1");
        System.out.println("Nama      : " + mhs1.getNama());
        System.out.println("NIM       : " + mhs1.getNim());
        System.out.println("Jurusan   : " + mhs1.getJurusan());
        System.out.println("Kelas     : " + mhs1.getKELAS());
        System.out.println("TTL       : " + mhs1.getTTL());

        System.out.println("\nBiodata Anggota 2");
        System.out.println("Nama      : " + mhs2.getNama());
        System.out.println("NIM       : " + mhs2.getNim());
        System.out.println("Jurusan   : " + mhs2.getJurusan());
        System.out.println("Kelas     : " + mhs2.getKELAS());
        System.out.println("TTL       : " + mhs2.getTTL());

        System.out.println("\nBiodata Anggota 3");
        System.out.println("Nama      : " + mhs3.getNama());
        System.out.println("NIM       : " + mhs3.getNim());
        System.out.println("Jurusan   : " + mhs3.getJurusan());
        System.out.println("Kelas     : " + mhs3.getKELAS());
        System.out.println("TTL       : " + mhs3.getTTL());
    }
}