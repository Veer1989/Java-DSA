import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int i = sc.nextInt() ;
        if (i>=0){
            System.out.println(i);
        }else{
            System.out.println("The number is negative and skipped");
        }




    }
}
