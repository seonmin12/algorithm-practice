import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        // 큐 생성
        Queue<int[]> q = new LinkedList<>();
        // 초기 삽입
        for(int i =0;i<priorities.length;i++){
            q.offer(new int[]{i,priorities[i]});   
        }
        // 실행순서 카운트
        int count = 0;
        
        // 반복
        while(true){
            // 맨 앞 꺼냄
            int[]cur = q.poll();
            // 플래그
            boolean hasHigher = false;
            // 더 높은게 큐에 있는지 비교
            for(int[] doc: q){
                if(doc[1]>cur[1]){
                    hasHigher = true;
                    break;
                }
                
            }
            // 더 높은 priority 있는지 검사
            if(hasHigher){
                // 더 높은게 있다면 현재 값을 큐에 넣기
                q.offer(cur);
                
            }else{
                // 더 높은게 없다면 실행순서 카운트 증가 
                count ++;
                // location이랑 현재값 같으면 카운트 반환 
                if(cur[0]==location){
                return count;
            }
            }
            
            
            
        }
    }
}