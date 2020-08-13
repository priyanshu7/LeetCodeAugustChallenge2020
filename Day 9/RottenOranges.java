package august2020;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	
	class Pair{
		int x, y, time;
		Pair(int x, int y, int time){
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}
	
	
	public int orangesRotting(int[][] grid) {
		if(grid.length == 0) return -1;
		
		int N = grid.length;
		int M = grid[0].length;
		
		Queue<Pair> queue = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(grid[i][j] == 2) {
					queue.offer(new Pair(i,j,0));
				}
			}
		}
		
		int[] rowNbr = {-1,0,1,0};
		int[] colNbr = {0,-1,0,1};
		
		int finaltime = 0;
		
		while(!queue.isEmpty()) {
			Pair temp = queue.poll();
			for(int i = 0; i < 4; i++) {
				int row = temp.x + rowNbr[i];
				int col = temp.y + colNbr[i];
				if(row >= 0 && row < N && col >= 0 && col < M && grid[row][col] == 1) {
					grid[row][col] = 2;
					queue.offer(new Pair(row,col,temp.time+1));
					finaltime = Math.max(finaltime, temp.time+1);
				}
			}
		}
		
		for(int i = 0; i < N; i ++) {
			for(int j = 0; j < M; j++) {
				if(grid[i][j] == 1)
					return -1;
			}
		}
		
		return finaltime;
        
    }

}
