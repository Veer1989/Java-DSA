public class Pyramid {
    public static void main(String args[])
    {
int i,j,l ;
        for( i = 1; i <= 4; i++)
        {
            for( j = 1; j <= 4-i; j++){
                System.out.print("  ");

            }
           for(  l= 1; l<= (2*i-1 );l++){
               if(i == 1 || i == 4){
                   System.out.print(i + " ");
               } else if (l ==1 || l == (2*i-1)) {
                   System.out.print(i + " ");
               }else{
                   System.out.print("  ");
               }


           }


            System.out.println();
        }
    }
}
