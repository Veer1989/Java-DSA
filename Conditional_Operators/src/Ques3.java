import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
      int cp = sc.nextInt() ;
        System.out.println("enter the selling price:");
      int sp =sc.nextInt() ;
      if(sp>cp){
          System.out.println("profit is: "+ (sp-cp));
      }else{
          System.out.println("loss is: "+ (cp-sp));
      }






    }
}
