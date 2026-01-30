import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long A = sc.nextLong();

        String S = String.valueOf(A);
        if(S.length() != N){
            System.out.println("Uzunlik mos emas!");
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            if(S.charAt(i)=='0'){
                sb.append('0');
            }
            else if(S.charAt(i)=='5'){
                sb.append('5');
            }
            else{
                sb.append('8');
            }
        }
        System.out.println(sb.toString());


    }
}
