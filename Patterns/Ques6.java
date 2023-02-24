import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      int n =  sc.nextInt();
        for ( int i = 1 ;i<=(n+1)/2 ;i++){
            for (int j = 1 ; j<=((n+1)/2)-i ;j++)
            {
                System.out.print(" ");
            }

                char ch = 'A' ;
                for (int j = 1; j<=2*i-1 ; j++){
                    System.out.print(ch);
                    ch++ ;
                }
                System.out.println();
            }

        for (int i = n/2 ;i>=1 ;i-- ){


            for(int j=1 ; j<=5-i ; j++){
                System.out.print(" ");
            }
            char ch ='A' ;
            for (int k = 1 ; k<=(2*i-1) ; k++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
