import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int lines = sc.nextInt() ;
        for(int i = 0 ; i<lines ; i++){
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            System.out.println(a+b);
        }
    }
}
