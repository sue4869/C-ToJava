import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;   

class Solution {
        public int solution(int[] queue1, int[] queue2) {
            int answer = 0;
            long sum1 = 0;
            long sum2 = 0;
            
            Queue<Integer> q1 = new LinkedList<Integer>();
            Queue<Integer> q2 = new LinkedList<Integer>();
            
            for(int x=0;x<queue1.length;x++) {
                sum1 += queue1[x];
                q1.add(queue1[x]);    
                sum2 += queue2[x];
                q2.add(queue2[x]);
            }
            long totalSum = sum1 + sum2;
           
            if(totalSum % 2l != 0) return -1;
          
            while(sum1 != sum2) {
                
        
                if(sum1 > sum2) {
                    int num = q1.peek();
                    q1.poll();
                    q2.add(num);
                    sum2 += num;
                    sum1 -= num;
                } else {
                    int num = q2.peek();
                    q2.poll();
                    q1.add(num);
                    sum1 += num;
                    sum2 -= num;
                }
                answer++;
                
                if(answer > queue1.length * 3) {
                    return -1;
                }
                
            }
            
    
            return answer;
        }
    }