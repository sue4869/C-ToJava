import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;


    public static void main(String[] args) throws IOException {
        int[][] dir = {
            {-1,0},
            {0,-1},
            {0,1},
            {1,0}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num+2][num+2];
        for(int y=1;y<=num;y++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int x=1;x<=num;x++) {
                arr[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        int resultCnt = 0;
        for(int y=1;y<=num;y++) {
            for(int x=1;x<=num;x++) {
                int checkCnt = 0;
                for(int z=0;z<4;z++) {
                    int dy = dir[z][0] + y;
                    int dx = dir[z][1] + x;

                    if(arr[y][x] <= arr[dy][dx]) break;
                    checkCnt++;
                }

                if(checkCnt == 4) resultCnt++;
            }
        }
        System.out.println(resultCnt);
    }
}