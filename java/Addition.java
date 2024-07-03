import java.util.Enumeration;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.println("Welcome in the addition calculator");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first number");
        int Num1= input.nextInt();

        System.out.println("Enter the second number");
        int Num2=input.nextInt();

        int Num3= Num1+Num2;

        System.out.println("The addition of "+Num1 + " and "+Num2+" is "+Num3);

    }
}
