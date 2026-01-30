import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long A = sc.nextLong();

        String S = String.valueOf(A);
        if(S.length() != N){
            System.out.println("Uzunlik mos emas!");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == '0' || c == '5' || c == '9') {
                sb.append(c);
            } else {
                sb.append('8');
            }
        }
        System.out.println(sb.toString());


    }
}

