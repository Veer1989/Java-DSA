public class Nump {

    public static void main(String[] args) {
        for (int i =1 ; i<=4 ;i++){
            for (int j= 1;j<=6 ; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 6)
                    System.out.print(j);
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }







}

