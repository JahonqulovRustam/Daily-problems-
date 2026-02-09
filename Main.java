import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElements = sc.nextInt(); // chunki index faqat int tipini oladi
        final BigInteger value = BigInteger.valueOf(((long) pow(10, 9) + 7)); // value bu o'zgarmas qiymatda

        long [] arr = new long[numElements];  // bu yerda o'sha n lar uchun array yarataman va qiymatlarni qabul qilaman
        for(int i = 0; i < numElements; i++) {
            arr[i] = sc.nextLong();
        }

        for(int i = 0; i < numElements; i++) {
            BigInteger n = BigInteger.valueOf(arr[i]);  // bu yerda n, nechta hadni qo'shishimiz kerakligini ifodalayopti
            BigInteger sum = n.multiply(n).mod(value);
            System.out.println(sum);
        }

    }
}