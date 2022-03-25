package Fridayevening;

public class main_6 {
    public static int uniquePaths_With_obstacle_Grid(int[][] obstacle_Grid) {
		int m = obstacle_Grid.length;
		if (m <= 0) {
			return 0;
		}
		int n = obstacle_Grid[0].length;
		if (n <= 0) {
			return 0;
		}
		int[][] dp = new int[m + 1][n + 1];
		dp[m][n - 1] = 1;
		for (int i = m - 1; i >= 0; --i) {
			for (int j = n - 1; j >= 0; --j) {
				dp[i][j] = (obstacle_Grid[i][j] == 0) ? dp[i + 1][j] + dp[i][j + 1] : 0;
			}
		}
		return dp[0][0];
	}
    
  public static void main(String[] args) {
		int[][] obstacle_Grid ={
                              {0, 0, 0}, 
                              {0, 1, 0}, 
                              {0, 0, 0}, 
                              };
		System.out.println("Unique paths from top-left corner to bottom-right corner of the said grid (considering some obstacles): "+uniquePaths_With_obstacle_Grid(obstacle_Grid));
	}		
}
