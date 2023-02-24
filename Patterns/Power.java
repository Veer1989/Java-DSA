import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
         int N = sc.nextInt() ;
        int l = 2 ;
        for (int i = 1 ;i <= N ;i++){
            int k =1 ;
            for(int j = 1 ; j<=N-i;j++) {
                System.out.print(" ");
            }
                while (k<= i) {
                    if (isPrime(l)) {
                        System.out.print(l + " ");
                        k++;
                        l++;
                    } else {
                        l++ ;
                    }
                }
            System.out.println();
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