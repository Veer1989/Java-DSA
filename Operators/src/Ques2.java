import java.util.*;
public class Ques2 {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in) ;
     System.out.println("Enter the  numbers to be swapped");
        int a = sc.nextInt();
        int b = sc.nextInt() ;
        a= a+ b ;
        b = a-b ;
        a = a-b ;
        System.out.println(a + " "+ b);

    }


}
