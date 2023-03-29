package Modul3KEGIATAN1;
import java.util.Scanner;

public class User {
    private boolean admin;
    private int userIndex;
    private Object[][] userDB;
    private static String DBT = "\t\t\t\t\t\tDibuat Oleh: Bayu Ardiyansyah\n";
    private static String UNIV = "\t\t\t\t\t\tUniversitas Muhammadiyah Malang\n";
    private static String NIM = "\t\t\t\t\t\t\t\t202210370311025\n";

    public static void main(String[] args) {
        System.out.println(DBT+ NIM + UNIV);
        System.out.println();
        User user = new User();
        user.login();
    }
    public User() {
        userDB = new Object[][]{
                {"admin", "admin", 0, true},
                {"202210370311025", "UMM_a2022", 1, true},
                {"202110370311025", "UMM_a2021", 2, true}
        };
    }
    public void login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String username = sc.nextLine();

        System.out.print("Masukkan Password: ");
        String password = sc.nextLine();

        // Mencari username dan password yang sesuai
        boolean foundUser = false;
        for (int i = 0; i < userDB.length; i++) {
            if (userDB[i][0].equals(username) && userDB[i][1].equals(password)) {
                foundUser = true;
                userIndex = i;
                break;
            }
        }
        if (foundUser) {
            dashboard();
        } else {
            System.out.println("Username atau password salah");
        }
    }
    public void dashboard() {
        System.out.println("Sistem Akademik UMM | Mahasiswa");
        System.out.println("Username: " + userDB[userIndex][0]);
        System.out.println("Status Mahasiswa: " + userDB[userIndex][3]);
        System.out.println("1. Update Password");
        System.out.println("0. Log Out");
        System.out.print("Pilih Menu: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Terima kasih, Anda telah berhasil log out");
                break;
            case 1:
                updatePassword();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
    public void updatePassword() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Password Baru: ");
        String newPassword = sc.nextLine();

        // Validasi password baru
        if (isPassSymbols(newPassword) && isPassDigit(newPassword) && isPassUpperCase(newPassword) && isPassLowerCase(newPassword)) {
            // Update password di userDB
            userDB[userIndex][1] = newPassword;
            System.out.println("Password berhasil terupdate");
        } else {
            System.out.println("Password tidak memenuhi syarat");
        }
    }
    public boolean isPassSymbols(String password) {
        String symbols = "~`!@#$%^&*()-_+={}[]|\\:;\"'<>,.?/";

        for (int i = 0; i < symbols.length(); i++) {
            if (password.contains(Character.toString(symbols.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
    public boolean isPassDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public boolean isPassUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }

        return false;
    }
    public boolean isPassLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAdmin() {

        return admin;
    }
    public String toString() {

        return super.toString();
    }
    public void setAdmin(boolean admin) {

        this.admin = admin;
    }
    public int getUserIndex() {

        return userIndex;
    }
    public void setUserIndex(int userIndex) {

        this.userIndex = userIndex;
    }
    public Object[][] getUserDB() {

        return userDB;
    }
    public void setUserDB(Object[][] userDB) {

        this.userDB = userDB;
    }
}