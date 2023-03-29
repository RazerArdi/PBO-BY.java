import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CODELAB2 {
    private int yourBirthYear;

    public int kelahiran() {
        return yourBirthYear;
    }

    public void atur(int yourBirthYear) {
        this.yourBirthYear = yourBirthYear;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CODELAB2 KalUmur = new CODELAB2();
        
        System.out.print("Masukkan tahun kelahiran anda: ");
        int year = scanner.nextInt();
        KalUmur.atur(year);
        
        int age = KalUmur.calculateAge();
        System.out.println("Umur anda : " + age + " tahun.");
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return Period.between(LocalDate.of(yourBirthYear, 1, 1), LocalDate.of(currentYear, 1, 1)).getYears();
    }
}