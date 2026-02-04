import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        StringBuilder sb = new StringBuilder();

        if(S.charAt(0)=='-'||N==0){
          return;
        }
        else{
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                if (c == '0' || c == '5' || c == '9') {
                    sb.append(c);
                } else {
                    sb.append('8');
                }
            }
        }
        System.out.println(sb.toString());
    }
}

