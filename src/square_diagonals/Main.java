/**
 * Created by Taiwo Farinu on 18-Jun-20
 */

package square_diagonals;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] * arr[i][i] + " ");
            System.out.print(arr[i][arr.length - 1 - i] * arr[i][arr.length - 1 - i] + " ");
        }
    }
}
