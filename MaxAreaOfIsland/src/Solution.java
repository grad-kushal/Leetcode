public class Solution {
    public static void main(String [] args) {
        int [][] grid = {{0,1}, {1, 1}};
        System.out.println(maxAreaOfIsland(grid));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        int currentArea = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    currentArea = exploreIsland(i, j, rows, cols, grid);
                }
                maxArea = (currentArea > maxArea ? currentArea : maxArea);
            }
        }
        return maxArea;
    }

    private static int exploreIsland(int i, int j, int rows, int cols, int[][] grid) {
        int area = 0;
        if (i < 0 || j < 0 || i > rows-1 || j > cols-1 || grid[i][j] == 0) {
            return 0;
        } else {
            grid[i][j] = 0;
            area += exploreIsland(i-1, j, rows, cols, grid);
            area += exploreIsland(i+1, j, rows, cols, grid);
            area += exploreIsland(i, j-1, rows, cols, grid);
            area += exploreIsland(i, j+1, rows, cols, grid);
            return ++area;
        }
    }
}