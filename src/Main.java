import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");

        System.out.println("How many people are in your group:");
        int people = scan.nextInt();

        System.out.println("What percentage do you want to tip (as an integer):");
        int percent = scan.nextInt();


    }
}
