import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static int[] arr;
    public static int[] scoreArr;
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int num = Integer.parseInt(br.readLine());
     arr = new int[num];
     scoreArr = new int[num];
     StringTokenizer st = new StringTokenizer(br.readLine());
     for(int x=0;x<num;x++) {
         arr[x] = Integer.parseInt(st.nextToken());
     }

     for(int y=0;y<num;y++) {
         int cnt = 1;
         for(int x=0;x<num;x++) {
             if( x!= y && arr[y] < arr[x]) {
                 cnt++;
             }
             scoreArr[y] = cnt;
         }
     }

    for(int x=0;x<num;x++) {
        System.out.print(scoreArr[x] + " ");
    }
    }
}