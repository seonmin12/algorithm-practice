import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 남은날 계산
        int[] days = new int[progresses.length];
        for(int i=0;i<progresses.length;i++){
            int left = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0){
                left++;  
            }
               days[i] = left;
            
        }
        
        // 배포 결과
        List<Integer> result = new ArrayList<>();
         int count = 1;
         int current = days[0];
        for(int i=1;i<days.length;i++){
            if(current>=days[i]){
                // 같이 배포
                count++;
                
            }else{
                //새배포
                result.add(count);
                current = days[i];
                count =1;
                
                
            }
             
        }
        result.add(count);
        
        // 리스트를 정수 배열로 변환
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
            
        }
        return answer;
        

    }
}
