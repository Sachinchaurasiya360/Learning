//WAP to add the contact number

import java.util.Scanner;

public class ContactNumaddition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your contact number");
        int contact=input.nextInt();

        while (contact>0){
            int add=contact%10;
           int total=add*10+add;

            contact/=10;
        }
    }
}
