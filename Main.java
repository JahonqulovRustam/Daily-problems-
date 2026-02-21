import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int numball = sc.nextInt();
        int [] arr = new int[numball];
        int numOfX = sc.nextInt();

        for (int i = 0; i < numball; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < numOfX; i++) {

            int x = sc.nextInt();

            for (int j = numball-1; j >= 0; j--) {

               x -= arr[j];

               if (x <= 0) {
                   if (j % 2 == 0) {
                       System.out.println("A");
                   } else {
                       System.out.println("B");
                   }
                  break;
               }
            }
        }
    }
}
