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

        System.out.println("What is the tip percentage? (0-100)");
        int tipPercent = scan.nextInt();
        scan.nextLine();
        double cost = 0;
        double newCost = 0.0;

        // adds all the price together
            while (newCost >= 0) {
                System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end):");
                cost +=newCost;
                newCost= scan.nextDouble();
            }
        System.out.println("Total Before Tip: "+ cost);
        System.out.println("Tip percentage: " + tipPercent);
        // variables
        double totalTip = ((double)tipPercent/100) * cost;
        String formattedNum = formatter.format(totalTip);
        System.out.println("Total Tip: " + formattedNum);
        //total bill
        double totalWithTip = cost + totalTip;
        String formattedNum1 = formatter.format(totalWithTip);
        System.out.println("Total Bill With Tip: " + formattedNum1);

        double perPersonBeforeTip = cost/numPpl;
        String formattedNum2 = formatter.format(perPersonBeforeTip);
        System.out.println("Per Person Cost Before Tip: " + formattedNum2);

        double tipPerPerson = totalTip/numPpl;
        String formattedNum3 = formatter.format(tipPerPerson);
        System.out.println("Tip Per Person: "+formattedNum3);

        double totalPerPerson = cost/numPpl;
        String formattedNum4 = formatter.format(totalPerPerson);
        System.out.println("Total Cost Per Person: " + formattedNum4);

            }
        }




