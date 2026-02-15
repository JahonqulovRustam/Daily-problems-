import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int original = number;
        while (number % 2 == 0) {
            number = number / 2;
            list.add(2);
        }

        for (int i=3; i <= Math.sqrt(number); i+=2) {
            while (number % i == 0) {
                number = number / i;
                list.add(i);
            }
        }
        if (number > 1) {
            list.add(number);
        }
        int sumofList = 0;
        for(int i : list) {
            int temp = i;
            while (temp > 0) {
                sumofList += temp % 10;
                temp /= 10;
            }
        }

        int sum = 0;
        int temp = original;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if(sum == sumofList) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}