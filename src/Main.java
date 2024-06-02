import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer to check if even or odd number: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0: System.out.println("Even");
            break;
            default: System.out.println("Odd");
        }

        /*  switch (number % 2) {                               אפשר לכתוב גם ככה:
                 case 0 -> System.out.println("Even");
                 break;
                 case 1 -> System.out.println("Odd");
        }

              השארית יכולה להיות או 0 או 1
         */

    }
}