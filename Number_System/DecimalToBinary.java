import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int dec = sc.nextInt();
        int par = 0 ;
        int pw =1 ;
        int bin = 0;
        while(dec!=0){
            par = dec % 2 ;
            bin += par* pw ;
            pw*=10 ;
            dec/=2 ;
        }
        System.out.println(bin);

    }
}
