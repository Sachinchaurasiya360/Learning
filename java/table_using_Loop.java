import java.util.Scanner;

public class table_using_Loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number which you table");
        int table=input.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(i+"*"+table+"="+i*table);
        }
    }
}
