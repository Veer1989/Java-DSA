import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        String first_name,last_name;
        int roll_no;
        String interest;
        Scanner sc= new Scanner(System.in) ;
       first_name = sc.next() ;
       last_name = sc.next();
      roll_no=sc.nextInt() ;
      interest =  sc.nextLine() ;
        System.out.println("name :"+first_name+" "+last_name);
        System.out.println("roll no :"+roll_no);
        System.out.println("interest :"+interest);

    }
}
