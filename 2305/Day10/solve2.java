
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    static int MAX = 0;
    public static void main(String[] args) throws IOException {
        int[][] grid = {{1,1},{1,0}};
        System.out.println(largestIsland(grid));
    }


    public static int largestIsland(int[][] grid) {

        int maxSize = 0;
        for(int y=0;y<grid.length;y++) {
            int cnt = 0;
            for(int x=0;x<grid[y].length;x++) {
                if(grid[y][x] == 1) continue;
                cnt++;
                if(y-1>=0 && grid[y-1][x] == 1) cnt++;
                if(y+1<grid.length && grid[y+1][x] ==1) cnt++;
                if(x-1>=0 && grid[y][x-1]==1) cnt++;
                if(x+1<grid[y].length && grid[y][x+1]==1) cnt++;


                maxSize = Math.max(maxSize, cnt);
            }
        }

        return maxSize;
    }


}
