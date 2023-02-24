import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int n = 1 ; n<=1000000 ; n++) {

            int num = n;
            int N = n;
            double count = 0;
            double sum = 0;

            while (num != 0) {
                num = num / 10;
                count++;
            }

            while (N != 0) {
                double temp = N % 10;
                sum += Math.pow(temp, count);
                N = N / 10;
            }
            if (sum == n) {
                System.out.print(n + " ");
            }
            }
        }
    }

