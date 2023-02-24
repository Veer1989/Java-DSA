import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
                int key = n ;
                int i = 2 ;
                if (isPrime(n)){
                    while(i<n){
                        if (isPrime(i)){
                            int sum = 2 + i ;
                            if (key == sum){
                                System.out.println("true") ;
                                break ;
                            }

                        }
                        i++ ;
                    }
                    if (i == n){
                        System.out.println("false") ;
                    }
                }
            }
            static boolean isPrime(int n) {

                if (n == 1 || n == 0) {
                    return false;

                }
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0 ) {
                        return false;
                    }



                }

                return true ;
            }



        }