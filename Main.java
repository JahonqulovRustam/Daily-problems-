import java.util.Scanner;

public class Main {
    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElements = sc.nextInt();

        for (int i = 0; i < numElements; i++) {
            long number = sc.nextLong();
            long subResult = number % MOD;
            long result = (subResult * subResult) % MOD;
            System.out.println(result);
        }
    }
}
