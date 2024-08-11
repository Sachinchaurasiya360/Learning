import java.util.Scanner;

public class arrayAddition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={4,5,3,5,2};
        int[] result= new int[arr.length];


        result[0]=arr[0];
        for (int i=1;i<arr.length;i++){
             result[i]=result[i-1]+ arr[i];
        }
        System.out.println(result);
    }


}
