import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chekword = "shubhasiz".toLowerCase();
        System.out.println("Jumlani kiriting: ");
        String word = sc.nextLine().toLowerCase();

        int count = 0;
        int index = 0;

        while ((index = word.indexOf(chekword, index)) != -1) {
            count++;
            index += chekword.length();
        }

        System.out.println("So'z "+count+" marta takrorlangan");
    }
}
