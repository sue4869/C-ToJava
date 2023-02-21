import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num+1][num+1];
        for(int y=1;y<=num;y++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int x=1;x<=y;x++) {
                arr[y][x] = Integer.parseInt(st.nextToken());
            }

        }
        dp = new int[num+1][num+1];
        dp[0][1] = arr[0][1];
        for(int y=1;y<=num;y++) {
            for (int x = 1; x <= num; x++) {
                dp[y][x] = Math.max(dp[y-1][x-1],dp[y-1][x]) + arr[y][x];
            }
        }
        int max = 0;
        for(int x=1;x<=num;x++) {
            if(max < dp[num][x]) max = dp[num][x];
        }
        System.out.println(max);
    }
}