
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Application {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		Map<Integer,Integer> map = new HashMap<>();
		StringTokenizer st;
		int array[] = new int[1001];
		int small = 1000;
		int big = 0;
		for(int x=0;x<size;x++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			array[first] = second;

			if(small > first) small = first;
			if(big < first) big = first;
		}

		int left[] = new int[big+1];
		int right[] = new int[big+1];
		int checkSize = 0;
		for(int x=small;x<=big;x++) {
			int compareSize = array[x];
			if(checkSize<compareSize) checkSize = compareSize;
			left[x] = checkSize;
		}
		checkSize = 0;
		for(int x=big;x>=small;x--) {
			int compareSize = array[x];
			if(checkSize<compareSize) checkSize = compareSize;
			right[x] = checkSize;
		}
		int answer = 0;
		for(int x=small;x<=big;x++) {
			if(left[x] < right[x]) answer+= left[x];
			else answer+= right[x];
		}

		System.out.println(answer);
	}

}