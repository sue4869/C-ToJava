import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num][num];
        int max = 0;
        int sum = 0;
        for(int y=0;y<num;y++) {
            sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int x=0;x<num;x++) {
                arr[y][x] = Integer.parseInt(st.nextToken());
                sum += arr[y][x];
            }

            if(max < sum) max = sum;
        }

        for(int x=0;x<num;x++) {
            sum = 0;
            for(int y=0;y<num;y++) {
                sum += arr[y][x];
            }

            if(max < sum) max = sum;
        }

        int sum1 = 0;
        int sum2 = 0;
        for(int x=0;x<num;x++) {
            sum1 += arr[x][x];
            sum2 += arr[x][num-x-1];
        }

        int result = Math.max(max , Math.max(sum1, sum2));

        System.out.println(result);

    }
}