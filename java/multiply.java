import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        System.out.println("Welcome in division and Multiplication");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first Num");
        int Num1=input.nextInt();

        System.out.println("Enter the second number");
        int Num2=input.nextInt();

        int Num3= Num1*Num2;
        int Num4= Num1/Num2;

        System.out.println("The multiplication and division of the given number is:");
        System.out.println("Multiplication:"+Num3);
        System.out.println("Division:"+Num4);
    }
}
