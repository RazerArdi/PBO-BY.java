package Modul3KEGIATAN1;

public class hooh {
    public static void main(String[] args) {
        int mod = 2579;
        int result;

        // ki = 2
        result = (2 % mod) * (2 % mod) % mod;
        System.out.println("2^2 mod 2579 = " + result);
        System.out.println("\t= [" + (2 % mod) + "][" + (2 % mod) + "] mod " + mod);
        System.out.println("\t= [" + result  +"] mod " + mod);
        System.out.println("\t= " + result + " mod " + mod);

        // ki = 4
        result = ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod;
        System.out.println("2^4 mod 2579 = " + result);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) + "][" + ((2 % mod) * (2 % mod) % mod) % mod + "] mod " + mod);
        System.out.println("\t= [" + result  +"] mod " + mod);
        System.out.println("\t= " + result + " mod " + mod);

        // ki = 8
        result = ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod;
        result = (result % mod) * (result % mod) % mod;
        System.out.println("2^8 mod 2579 = " + result);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod + "][" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod + "] mod " + mod);
        System.out.println("\t= [" + result  +"] mod " + mod);
        System.out.println("\t= " + result + " mod " + mod);

        // ki = 16
        result = ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod;
        result = (result % mod) * (result % mod) % mod;
        result = (result % mod) * (result % mod) % mod;
        System.out.println("2^16 mod 2579 = " + result);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod * ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod + "][" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod * ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod + "] mod " + mod);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod * ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod * ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod * ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod  + "] mod " + mod);
        System.out.println("\t= " + result + " mod " + mod);

        // ki = 32
        result = ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod;
        result = (result % mod) * (result % mod) % mod;
        result = (result % mod) * (result % mod) % mod;
        result = (result % mod) * (result % mod) % mod;
        System.out.println("2^32 mod 2579 = " + result);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod + "][" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod + "] mod " + mod);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod * ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod  +"] mod " + mod);
        System.out.println("\t= " + result + " mod " + mod);

        // ki = 64
        result = ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod % mod;
        result = (result % mod) * (result % mod) % mod;
        result = (result % mod) * (result % mod) % mod;
        result = (result % mod) * (result % mod) % mod;
        result = (result % mod) * (result % mod) % mod;
        System.out.println("2^64 mod 2579 = " + result);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod * ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod % mod + "][" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod % mod*((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod % mod + "] mod " + mod);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod * ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod +"] mod " + mod);
        System.out.println("\t= " + result + " mod " + mod);


        // ki = 110
        int hh1 = ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod;
        int hh2 = ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod;
        int aa = (hh1 % mod) * (hh2 % mod) % mod;
        result = (aa % mod) * ((hh1 % mod) * ((2 % mod) * (2 % mod) % mod) % mod) % mod;
        System.out.println("2^110 mod 2579 = " + result);
        System.out.println("\t= [" + (2 % mod) + "][" + hh2 + "] mod " + mod);
        System.out.println("\t= " + result + " mod " + mod);

        // ki = 46
        hh1 = ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod);
        hh2 = (2 % mod) * (2 % mod) % mod;
        aa = (hh1 % mod) * (hh2 % mod) % mod;
        result = aa % mod;
        System.out.println("2^46 mod 2579 = " + result);
        System.out.println("\t= [" + ((2 % mod) * (2 % mod) % mod) * ((2 % mod) * (2 % mod) % mod) % mod % mod + "][" + hh2 + "] mod " + mod);
        System.out.println("\t= " + result + " mod " + mod);

        // ki = 14
        hh1 = (2 % mod) * (2 % mod) % mod;
        hh2 = (hh1 % mod) * (hh1 % mod) % mod;
        aa = (2 % mod) * (2 % mod) % mod;
        result = (aa % mod) * (hh2 % mod) % mod;
        System.out.println("2^14 mod 2579 = " + result);
        System.out.println("\t= [" + (2 % mod) * (2 % mod) % mod * (2 % mod) * (2 % mod) % mod + "][" + hh1 + "] mod " + mod);
        System.out.println("\t= [" + (aa) + "]*[" + hh2 + "] mod " + mod);
        int PJ14 = aa * hh2;
        System.out.println("\t= " + PJ14 + " Mod 2579");
        System.out.println("\t= " + result + " mod " + mod);

        // ki = 6
        hh1 = (2 % mod) * (2 % mod) % mod;
        hh2 = (hh1 % mod) * (hh1 % mod) % mod;
        aa = (2 % mod) * (2 % mod) % mod;
        result = (aa % mod) * (hh2 % mod) % mod;
        System.out.println("2^6 mod 2579 = " + result);
        System.out.println("\t= [" + (2 % mod) + "][" + hh1 + "] mod " + mod);
        System.out.println("\t= [" + (aa) + "]*[" + hh2 + "] mod " + mod);
        int PJ6 = aa * hh2;
        System.out.println("\t= " + PJ6);
        System.out.println("\t= " + result + " mod " + mod);
    }
}
