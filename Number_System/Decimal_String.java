public class Decimal_String {
    public int cheese(float num){
         num = 332 ;
        int bin = 0 ;
        int pw = 1 ;
        while(num!=0){
            int par  = num% 2 ;
            par*= pw ;
            num/=2 ;
            pw*=10 ;
            bin+=par ;
        }
        return bin ;
    }

}
