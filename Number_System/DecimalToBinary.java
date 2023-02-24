public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 332 ;
        int bin = 0 ;
       int pw = 1 ;
        while(num!=0){
            int par  = num% 2 ;
            par*= pw ;
            num/=2 ;
             pw*=10 ;
            bin+=par ;
        }
        System.out.println(bin);
    }
}
