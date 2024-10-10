//Apply linear search on the given array
import java.util.Scanner;
public class lenear_search {
    public static void main(String[] args) {
         int[] arr = {10, 324, 45, 90, 9808};
        System.out.println("Enter the element you are searching");
        Scanner input=new Scanner(System.in);
        int element=input.nextInt();
        for (int i=0;i<3;i++){
            if(arr[0]==element){
                System.out.println("element found using liner search");

            }
            else
                break;
        }


    }
}
