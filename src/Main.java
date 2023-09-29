import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double total = 0;
        String nameItem;
        List<String> itemName = new ArrayList<>();
        List<Double> itemPrice = new ArrayList<>();

        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();

        System.out.print("What percentage do you want to tip (0-100): ");
        int percent = scan.nextInt();
        scan.nextLine();
        double end = 0;

        while (end != -1){

            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            end = scan.nextDouble();
            scan.nextLine();
            total += end;
            if (end != -1){
                itemPrice.add(Math.round(end * Math.pow(10, 2)) / Math.pow (10, 2));
            }

            if (end!= -1){
                System.out.print("Enter the item: ");
                nameItem = scan.nextLine();
                itemName.add(nameItem);}
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
        System.out.println("Total bill before tip: $" + String.format("%.2f", total));
        System.out.println("Total percentage: " +  percent + "%");
        System.out.println("Total tip: $" + String.format("%.2f", totalTip));
        System.out.println("Total bill with tip: $" + String.format("%.2f", totalWithTip));
        System.out.println("Per person cost before tip: $" + String.format("%.2f", perPersonBeforeTip));
        System.out.println("Tip per person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total cost per person: $" + String.format("%.2f", perPersonTotal));
        System.out.println("--------------------------------");

        System.out.println("Items ordered:");

        for (int i = 0; i < itemName.size(); i++){
            System.out.println((itemName.get(i)) + " - $" + String.format("%.2f", itemPrice.get(i)));
        }
    }
}
