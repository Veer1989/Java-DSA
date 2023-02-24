import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the length and breadth");
        int length = sc.nextInt() ;
        int breadth = sc.nextInt() ;
        if (length == breadth){
            System.out.println("it is a square");
        }else {
            System.out.println("it is a rectangle");
        }
    }



}
