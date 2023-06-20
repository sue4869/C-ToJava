import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2002
class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		Map<String, Integer> map = new HashMap<>();

		// 터널 전 랭킹
		for(int i=0; i<N; i++) {
			map.put(br.readLine(), i+1);
		}

		// 기준점 배열
		int[] criterionArr = new int[N];

		for(int i=0; i<N; i++) {
			criterionArr[i] = i+1;
		}

		// 터널 후 랭킹
		int[] afterRanking = new int[N];

		for(int i=0; i<N; i++) {
			afterRanking[i] = map.get(br.readLine());
		}

		int criterion = 0; // 기준 차량

		boolean check = true;  // 기준 차량 찾기 유무

		int count = 0; // 추월 차량 수

		for(int i=0; i<N; i++) {

			// 기준 점 찾기
			if(check) {
				for(int k=0; k<criterionArr.length; k++) {
					criterion= criterionArr[k];
					if(criterion!=0) break;  // 기준 배열에서 가장 작은 수 찾기
				}
			}

			check = false;  // 기준 차량 찾기 off

			int idx = afterRanking[i]-1;
			criterionArr[idx] = 0;

			if(afterRanking[i]!=criterion) {
				count++;
				continue;
			}

			check = true; // 기준 차량 찾기 on
		}

	}
}