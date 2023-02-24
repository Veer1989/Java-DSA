import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {

Scanner sc= new Scanner(System.in) ;
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
int total = marks1+ marks2+marks3 ;
int percentage = (total/3);
        System.out.println(total);
        System.out.println(percentage+"%");
    }
}
