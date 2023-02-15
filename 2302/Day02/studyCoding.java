import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static int homeNum, shareNum;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        homeNum = Integer.parseInt(st.nextToken());
        shareNum = Integer.parseInt(st.nextToken());
        arr = new int[homeNum];
        for(int x=0;x<homeNum;x++) {
            arr[x] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int minD = 1;
        int maxD = arr[homeNum-1] - arr[0] + 1;


        while(minD < maxD) {
            int midD = (minD+maxD)/2;

            if(canInstall(midD) < shareNum) {
                maxD = midD;
            } else {
                minD = midD +1;
            }
        }

        System.out.println(minD-1);
    }

    public static int canInstall(int distance) {
        int count = 1;
        int lastLocate = arr[0];

        for(int x=1;x<arr.length;x++) {
            int current = arr[x];

            if(current - lastLocate >= distance) {
                count++;
                lastLocate = current;
            }
        }

        return count;
    }


}
