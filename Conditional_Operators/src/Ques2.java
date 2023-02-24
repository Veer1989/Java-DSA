import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        if (a < 0) {
            a *= -1;
        }
        System.out.println("absolute value of number is  " + a);
    }
}