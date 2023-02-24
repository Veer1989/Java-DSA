import java.util.Scanner;

public class Add {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the decimal and binary number");
        int d = sc.nextInt();
        int b = sc.nextInt();
        b= convertToBin(b) ;
        System.out.println("sum is " +(d+b));
    }




  static  int convertToBin(int num){
        int dec = 0 ;
        int pw = 1;
        while(num!= 0){
            int rem = num%10 ;
            rem*=pw ;
            num/=10 ;
            pw*=2 ;
            dec+=rem ;
        }
        return dec ;
    }

}
