import java.util.Scanner;

public class Num_repeat_count {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int repeat=0;
        System.out.println("Enter your contact number");
        int contact= input.nextInt();

        while (contact>0){
            if (contact %10==3){
            repeat++;
            }

            contact /= 10;  // Without this step, the while loop will become an infinite loop because the value of contact never changes

        }
    System.out.println(repeat);

    }
}
