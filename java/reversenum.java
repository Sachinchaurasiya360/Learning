import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your contact number");
        int contact = input.nextInt();

        int rev=0;
        while (contact>0){
            rev = rev * 10 + contact % 10;

            contact/=10;

        }
        System.out.println(rev);
    }
}   
