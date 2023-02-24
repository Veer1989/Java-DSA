import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the first number");
        int a = sc.nextInt() ;
        System.out.println("enter the second number");
        int b = sc.nextInt() ;
        System.out.println("Enter an operator (+, -, *, /): -");
        char s = sc.next().charAt(0) ;

        switch(s){
            case '+':
                System.out.println("Result is" + (a+b));
                break ;
            case '-':
                System.out.println("Result is " + (a-b));
                break ;
            case '*':
                System.out.println("Result is " + (a*b));
                break ;
            case '/':
                System.out.println("Result is " + (a/b));
                break ;
            default:
                System.out.println("operator undefined");
        }
    }
}
