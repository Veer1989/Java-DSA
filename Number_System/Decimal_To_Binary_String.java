import java.util.Scanner;

public class Decimal_To_Binary_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        double dec= sc.nextDouble() ;
        System.out.println("enter the precision digit");
        int prec = sc.nextInt() ;
        int frac = (int)dec ;
        double decimal = dec - frac ;
        int pw =1 ;
        int z;
        int binary = 0 ;
        while(frac!=0){
            int temp = frac % 2 ;
            binary += temp * pw ;
            pw *=10 ;
            frac/=2 ;
        }
        String str = Integer.toString(binary) ;
        System.out.print(str+".");
        while (prec !=0){
            decimal *=2 ;
             z = (int)decimal ;
            decimal= decimal -z ;
       String str2 = Integer.toString(z) ;
            System.out.print(str2);

                prec-- ;
        }

    }
}
