//Write a program to print the factorial
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number which you want the factorial");
        int num=input.nextInt();
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }

        System.out.println(fact);
    }
}
