import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        double total = 0;

        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group:");
        int people = scan.nextInt();

        System.out.print("What percentage do you want to tip (as an integer):");
        int percent = scan.nextInt();

        double end = 0;
        while (end != -1){
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end):");
            end = scan.nextDouble();
            total += end;
        }

        total++;
        double totalTip = total * (percent/100.0);
        totalTip = Math.round( totalTip * Math.pow(10,2)) / Math.pow(10,2);

        double tipPerPerson = totalTip/people;
        tipPerPerson = Math.round( tipPerPerson * Math.pow(10,2)) / Math.pow(10,2);

        double totalWithTip = total;
        totalWithTip += totalTip;
        totalWithTip = Math.round( totalWithTip * Math.pow(10,2)) / Math.pow(10,2);

        double perPersonTotal = totalWithTip/people;
        perPersonTotal = Math.round( perPersonTotal * Math.pow(10,2)) / Math.pow(10,2);

        double perPersonBeforeTip = total/people;
        perPersonBeforeTip = Math.round( perPersonBeforeTip * Math.pow(10,2)) / Math.pow(10,2);

        System.out.println("--------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage: " + percent + "%");
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + totalWithTip);
        System.out.println("Per person cost before tip: $" + perPersonBeforeTip);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + perPersonTotal);
        System.out.println("--------------------------------");
    }
}
