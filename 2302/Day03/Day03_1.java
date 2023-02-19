import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[num];


        for(int x=0;x<num;x++) {
            arr[x] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int cnt = 1;
        for(int x=0; x<num;x++) {

            if(arr[x] == 0)  {
                cnt = 1;
                continue;
            }

            sum += cnt;
            cnt++;
        }

        System.out.println(sum);


    }
}