public class BinaryTODecimal {
    public static void main(String[] args) {
        int num = 1101 ;
        int dec = 0 ;
        int pw = 1;
        while(num!= 0){
            int rem = num%10 ;
            rem*=pw ;
            num/=10 ;
            pw*=2 ;
            dec+=rem ;
        }

        System.out.println(dec);


    }
        }
