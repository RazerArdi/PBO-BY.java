import java.util.Scanner;

public class BookSystem {
    private String nama;
    private String noTelp;
    private String alamat;
    private String email;
    private int[][] room;

    // Setter dan Getter untuk atribut nama
    public void setNama(String nama) {
        // Memastikan input hanya berisi karakter/huruf
        if (nama.matches("[a-zA-Z]+")) {
            this.nama = nama;
        } else {
            System.out.println("Input nama tidak valid!");
        }
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk atribut noTelp
    public void setNoTelp(String noTelp) {
        // Memastikan input sesuai dengan format yang diinginkan
        if (noTelp.matches("^\\+62[0-9]{10,12}$")) {
            this.noTelp = noTelp;
        } else {
            System.out.println("Input nomor telepon tidak valid!");
        }
    }

    public String getNoTelp() {
        return noTelp;
    }

    // Setter dan Getter untuk atribut alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter dan Getter untuk atribut email
    public void setEmail(String email) {
        // Memastikan input memiliki domain yang valid
        if (email.matches(".+@.+\\..+")) {
            this.email = email;
        } else {
            System.out.println("Input email tidak valid!");
        }
    }

    public String getEmail() {
        return email;
    }

    public int[][] getRoom() {
        return room;
    }

    // Method untuk menginisialisasi room
    public void init() {
        room = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                room[i][j] = 0;
            }
        }
    }

    // Method untuk menampilkan informasi pemesan
    public void dispPerson() {
        System.out.println("Nama       : " + nama);
        System.out.println("No Telp    : " + noTelp);
        System.out.println("Alamat     : " + alamat);
        System.out.println("Email      : " + email);
    }

    // Method untuk memesan kamar
    public void bookRoom() {
        int row, col;
        Scanner input = new Scanner(System.in);
        System.out.println("Ketersediaan kamar:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(room[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Pilih baris (0-2)  : ");
        row = input.nextInt();
        System.out.print("Pilih kolom (0-4)  : ");
        col = input.nextInt();
        if (room[row][col] == 1) {
            System.out.println("Maaf, kamar sudah dipesan!");
        } else {
            room[row][col] = 1;
            System.out.println("Pemesanan berhasil!");
        }
    }

    // Method untuk melakukan pembayaran
    public void doPayment(int noRoom) {
        int price = 0;
        if (noRoom < 0 || noRoom > 14) {
            System.out.println("Nomor kamar tidak valid!");
            return;
        }
        int row = noRoom / 5;
        int col = noRoom % 5;
        if (room[row][col] == 0) {
            System.out.println("Kamar tidak dipesan!");
            return;
        }
        if (row == 0) {
            price += 1000000;
        } else if (row == 1) {
            price += 25000000;
        } else if (row == 2) {
            price += 1000000;
        }
        System.out.println("Harga yang harus dibayar: " + price);
    }


    // Method utama
    public static void main(String[] args) {
        BookSystem booking = new BookSystem();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        booking.setNama(input.nextLine());

        System.out.print("Masukkan nomor telepon: ");
        booking.setNoTelp(input.nextLine());

        System.out.print("Masukkan alamat: ");
        booking.setAlamat(input.nextLine());

        System.out.print("Masukkan email: ");
        booking.setEmail(input.nextLine());

        booking.init();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Pesan kamar");
            System.out.println("2. Bayar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    booking.bookRoom();
                    break;
                case 2:
                    System.out.print("Masukkan nomor kamar: ");
                    int noRoom = input.nextInt();
                    booking.doPayment(noRoom);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}