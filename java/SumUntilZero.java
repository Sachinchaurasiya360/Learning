
/* Write a program to enter the numbers till the user wants, the number can be positive,negative or zero.
Calculate the sum of numbers until a negative number is encountered.If the input is a negative number,
current sum is discarded and print -1.*/
import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr;
        int sum = 0;
        while (true) {
            System.out.println("Enter the number");
            arr = input.nextInt();
            if (arr < 0) {
                // Discard the current sum and print -1
                System.out.println("-1");

                break;
            } else {
                sum += arr;
            }

        }
        System.out.println("The total sum is " + sum);
        input.close();
    }
}
