public class Ques5 {
    public static void main(String[] args) {
int a = 65 ;
int b = 80 ;
int n = a ^ b;
int count = 0 ;
while(n!= 0){
    n = n & (n-1) ;
    count++ ;
        }

        System.out.println(count);






    }
}
