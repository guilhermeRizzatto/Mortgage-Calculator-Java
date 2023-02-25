import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float porcentage = (annualInterest /100)/12;
        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int paymentsPerYears = period*12;
        double count = porcentage * (Math.pow((1+porcentage),paymentsPerYears));
        double count2 = Math.pow((1+porcentage),paymentsPerYears)-1;
        double division = count/count2;
        double multiplication = principal * division;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + currency.format(multiplication));
    }
}