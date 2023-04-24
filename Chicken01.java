public class Chicken01 {
    public static void main(String[] args) {
        int TelurPerAyam = 5;
        int JumlahAyam = 3;
        int totalTelur = 0;

        // Kalkulasi jumlah telur hari Senin
        totalTelur += TelurPerAyam * JumlahAyam;

        // Kalkulasi jumlah telur hari Selasa
        JumlahAyam++;
        totalTelur += TelurPerAyam * JumlahAyam;

        // Kalkulasi jumlah telur hari Rabu
        JumlahAyam /= 2;
        totalTelur += TelurPerAyam * JumlahAyam;

        System.out.println("Total Telur yang diambil antara hari Senin and Rabu: " + totalTelur);

        // Skenerio 2
        TelurPerAyam = 4;
        JumlahAyam = 8;
        totalTelur = 0;

        // Kalkulasi jumlah telur hari Senin
        totalTelur += TelurPerAyam * JumlahAyam;

        // Kalkulasi jumlah telur hari Selasa
        JumlahAyam++;
        totalTelur += TelurPerAyam * JumlahAyam;

        // Kalkulasi jumlah telur hari Rabu
        JumlahAyam /= 2;
        totalTelur += TelurPerAyam * JumlahAyam;

        System.out.println("Total Telur yang diambil antara hari Senin dan Rabu: " + totalTelur);
    }
}
