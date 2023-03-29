package Modul3KEGIATAN1;

import java.math.BigInteger;
import java.util.Scanner;

import java.math.BigInteger;
import java.util.Scanner;

public class ElGamalEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai ki: ");
        int ki = scanner.nextInt();

        BigInteger two = new BigInteger("2");
        BigInteger mod = new BigInteger("2579");

        // menghitung nilai yi dengan rumus yi = 2^ki mod 2579
        BigInteger yi = two.pow(ki).mod(mod);

        // meminta input nilai m1
        System.out.print("Masukkan nilai m1: ");
        int m1 = scanner.nextInt();

        // menghitung nilai DD dengan rumus DD = 949^k1.m1 mod 2579
        BigInteger DD = new BigInteger("949").pow(ki).multiply(BigInteger.valueOf(m1)).mod(mod);

        // mencetak nilai ki, yi, dan DD
        System.out.println("ki: " + ki);
        System.out.println("Mi:" +  m1);
        System.out.println("yi: " + yi);
        System.out.println("DD: " + DD);
    }
}
