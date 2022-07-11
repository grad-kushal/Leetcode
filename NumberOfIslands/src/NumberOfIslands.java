import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String args []) {
        int a [][] = {{1,1,0,1,1},{1,0,0,0,0},{0,0,0,0,1},{1,1,0,1,1}};
        ArrayList<Double> doublesv = new ArrayList<>(8);

        doublesv.
        System.out.println(numDistinctIslands(a));
    }
    public static int numDistinctIslands(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    String island = buildIsland(grid, r, c, i, j, "S");
                    hashSet.add(island);
                }
            }
        }
        System.out.println(hashSet);
        return hashSet.size();
    }
    public static String buildIsland(int[][] grid, int m, int n, int i, int j, String direction) {
        String island = "";
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0)
            return "O";
        else {
            grid[i][j] = 0;
            island += direction;
            island += buildIsland(grid, m, n, i - 1, j, "L");
            island += buildIsland(grid, m, n, i + 1, j, "R");
            island += buildIsland(grid, m, n, i, j - 1, "U");
            island += buildIsland(grid, m, n, i, j + 1, "D");
            return island;
        }
    }
}