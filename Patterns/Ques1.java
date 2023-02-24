import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int a = 1 ;
        int b = 1 ;

        for (int i=1 ;i<=n ; i++){

            int sum = a + b ;
            System.out.print(a+" ");
            a = b;
            b = sum ;
        }
    }
    }

