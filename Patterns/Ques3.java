import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N ;
        if(n == 0){
            fact = 0 ;
        }
        while(n!=0){
            fact*=n ;
            n--;
        }
        System.out.println("Factorial of " +N + ": "+fact);
    }
}
