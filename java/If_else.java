import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        System.out.println("Let's check using programming whether you are eligible for not for driving");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=input.nextInt();
        if (age>=18){
            System.out.println("You can drive");
        }
        else
            System.out.println("You are not eligible");

    }
}
