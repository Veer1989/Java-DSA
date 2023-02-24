import java.util.Scanner;

public class Ques7Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int k = 0;
        int i = 1;
        l1 : for(int l  =1 ; l<= n ; l++) {

            for (int j = 1; j <= n - l; j++) {
                System.out.print("  ");
            }



            ldx: for (; i <= 100; i++) {
                int count = 0;
                for (int j = 1; j <= 100; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(i + "   ");
                    k++;
                    i++;

                }
                    else {
                        continue ldx;
                    }
                    if (k == l) {
                        k=0 ;
                        System.out.println();
                        continue l1;
                    }
                }

            }


        }


        }


