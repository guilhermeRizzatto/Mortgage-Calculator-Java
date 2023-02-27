import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       final int months = 12;

       //Inputs and saving the values
       Scanner scanner = new Scanner(System.in);
       System.out.print("Principal: ");
       int principal = scanner.nextInt();
       System.out.print("Annual Interest Rate: ");
       float annualInterest = scanner.nextFloat();
       System.out.print("Period (Years): ");
       byte period = scanner.nextByte();

       //calculation for porcentage of annual interest rate divided by months
       float porcentage = (annualInterest /100)/months;

       //calculation for know how many payments do you have for years
       int paymentsPerYears = period*months;

       //calculation  mortgage
       double count = principal
              * (porcentage * (Math.pow(1+porcentage,paymentsPerYears)))
              / (Math.pow(1+porcentage,paymentsPerYears)-1);

       //formating the calculation values for your country
       String currency = NumberFormat.getCurrencyInstance().format(count);

       //result
       System.out.println("Mortgage: " + currency);
    }
}