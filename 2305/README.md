* [10일](Day10) [인프런 강의-연속된 자연수의 합] | [코드](/2305/Day10/solve1.java) 
* [10일](Day10) [인프런 강의-최대 길이 연속부분수열]| [코드](/2305/Day10/solve2.java) 


# 🍭새로알게된 지식
* 큐 선언: Queue<Integer> q1 = new LinkedList<Integer>(); 
  1) array보다는 linkedlist가 추가삭제에 더 용이하다.
  2) 시간복잡도 : 삽입, 삭제시 O(logN)
* set선언 _ 배열 넣어서 초기화 : Set<String> kind = new HashSet<>(Arrays.asList(gems));
* map.getOrDefault(key, defaultValue) : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환
* arraylist에서 값 꺼내기 : list.get(인덱스);
* list 정렬하기 : Arrays.sort(list);
* arraylist 람다 이용해서 출력하기 : list.forEach(s -> System.out.print(s + " "));

# 🐳오답노트
* 문제 잘 읽기! long 여부 체크
* map.peek() : 가장 먼저 들어온 값 참조


