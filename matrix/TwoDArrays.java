import java.util.*;

public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] twodarrays = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                twodarrays[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twodarrays[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the target number");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (twodarrays[i][j] == x) {
                    System.out.printf("X found at location %d and %d", i, j);
                }
            }
            System.out.println();
        }
    }
}