public class Chicken02 {
    public static void main(String[] args) {
        int TSenin = 100;
        int TSelasa = 121;
        int TRabu = 117;
        int TotalTelur = TSenin + TSelasa + TRabu;

        // Calculate daily average
        double dailyAverage = (double) TotalTelur / 3;
        System.out.println("Daily Average: " + dailyAverage);

        // Calculate monthly average
        double monthlyAverage = dailyAverage * 30;
        System.out.println("Monthly Average: " + monthlyAverage);

        // Calculate total monthly profit
        double profit = monthlyAverage * 0.18;
        System.out.printf("Profit:\n$%.2f", profit);
    }
}
