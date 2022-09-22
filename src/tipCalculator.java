import java.util.Scanner;
import java.text.DecimalFormat;
public class tipCalculator {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Welcome to the tip calculator!");

        System.out.println("How many people are in your group?");
        int numPpl = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the tip percentage?");
        int tipPercent = scan.nextInt();
        scan.nextLine();
        double cost = 0;
        double newCost = 0.0;
            while (newCost != -1) {
                System.out.println("Enter a cost in dollars and cents :");
                double cost = scan.nextDouble();
                scan.nextLine();
                cost += newCost;
                System.out.println("Total Before Tip: "+ newCost);
            }
            }
        }





