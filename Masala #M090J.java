import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberLen = sc.nextInt();
        String numberStr = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberLen; i++) {
            char c = numberStr.charAt(i);
            if (c == '0' || c == '5' || c == '9') {
                sb.append(c);
            } else {
                sb.append('8');
            }
        }
        System.out.println(sb);
    }
}


