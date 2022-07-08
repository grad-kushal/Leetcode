import java.util.Scanner;

public class UniquePaths {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int [][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        System.out.println(arr[m-1][n-1]);
    }
}
