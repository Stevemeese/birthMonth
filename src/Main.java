import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int birthmonth = 0;
        String trash = "";

        System.out.print("Enter your birth month [1-12]: ");
        if (console.hasNextInt()) {
            birthmonth = console.nextInt();
            console.nextLine(); // clear your buffer

            if (birthmonth >= 1 && birthmonth <= 12) {
                System.out.println("You said your birth month is " + birthmonth);
            } else {
                System.out.println("Not sure what month " + birthmonth + " is! Run the program again!");
            }
        } else {
            trash = console.nextLine();
            System.out.println("You said your birth month was: " + trash);
            System.out.println("Run the program again and enter a valid number!");
        }
    }
}