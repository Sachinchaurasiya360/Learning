import java.util.Scanner;

public class NumSwap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1= input.nextInt();

        System.out.println("Enter the second number");
        int num2=input.nextInt();

        int swap=0;
        swap=num1;
        num1=num2;
        num2=swap;

        System.out.println("The swap value is"+ num1 +"and " +num2);
    }
}
