import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElements = sc.nextInt();
        final long value = 1000000007;
        
        for(int i = 0; i < numElements; i++) {
            long number = sc.nextLong();
            long result = (number % value) * (number % value) % value ;
            System.out.println(result);
        }
    }
}
