import java.util.Scanner;

public class fibonachi_Series {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number till there where you");
        int fib=input.nextInt();

        int a=0;
        int b=1;
        System.out.println("0");
        System.out.println("1");

        for(int i=0;i<fib;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.println(b);
        }


    }
}