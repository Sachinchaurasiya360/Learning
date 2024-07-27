import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num4=0;
        System.out.println("Enter a number");
        int num0=input.nextInt();
        int num1=num0;
        int num2=String.valueOf(num1).length();
        for (int i=0;i<num2;i++){
            int num3=num1%10;
            num1/=10;
            num4 += Math.pow(num3, num2);
        }
        System.out.println(num4);
        if (num0==num4){
            System.out.println("Entered number is armstong");
        }
        else
            System.out.println("Enter number is not armstong");

    }
}
