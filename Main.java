
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberLen = sc.nextInt();

        List<Integer> numbers = new ArrayList<>(numberLen);

        for(int i = 1; i <= numberLen; i++){
            numbers.add(i);
        }

        List<Integer> tubs = new ArrayList<>();

        for(int num : numbers){
            if(isTub(num)){
                tubs.add(num);
            }
        }

        if(tubs.size()%2!=0){
            System.out.println("Ali");
        }
        else{
            System.out.println("Bobur");
        }
    }
    public static boolean isTub(int num){
        if(num == 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; i <= Math.sqrt(num); i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }
}