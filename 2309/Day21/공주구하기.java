import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 공주구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int key = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		for(int x=1;x<=size;x++) {
			q.add(x);
		}

		while(q.size()!=1) {
			for(int x=0;x<key;x++) {
				int num = q.poll();
				if(x==key-1) break;
				q.add(num);
			}
		}

		System.out.println(q.peek());


	}
}