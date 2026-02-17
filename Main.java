import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int [][][] square = {{{8,1,6},{3,5,7},{4,9,2}},{{4,3,8},{9,5,1},{2,7,6}},{{2,9,4},{7,5,3,},{6,1,8}},{{6,7,2,},{1,5,9},{8,3,4}},{{4,9,2},{3,5,7},{8,1,6}},{{8,3,4},{1,5,9},{6,7,2}},{{6,1,8},{7,5,3},{2,9,4}},{{2,7,6},{9,5,1},{4,3,8}}};
        int minEnergy = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            int energy = 0;
            for (int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                 energy += Math.abs(matrix[j][k] - square[i][j][k]);
                }
            }
            if(energy < minEnergy) {
                minEnergy = energy;
            }
        }
        System.out.println(minEnergy);


    }
}
