public class KasirKopiDriver {
    public static void main(String[] args){
        Pelanggan cust = new Pelanggan("Susan","Robert");
        System.out.println(cust.NamaLengkap());

        Pelanggan cust2 = new Pelanggan();
        System.out.println(cust2.NamaLengkap());

        Pelanggan [ ] lul = new Pelanggan[5];
        lul[0] = new Pelanggan("Febry","kintil");
        lul[1] = new Pelanggan("Febry","kintil");
        lul[2] = new Pelanggan("Febry","kintil");
        lul[3] = new Pelanggan();
        lul[4] = new Pelanggan();

        System.out.println(lul[2].NamaLengkap());
        for (int i=0;i<lul.length; i++){
            System.out.println(lul[i].NamaLengkap());
        }
    }
}
