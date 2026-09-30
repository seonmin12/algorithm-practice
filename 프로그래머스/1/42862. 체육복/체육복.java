import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n; 
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 중복 애들 제거 
        for(int i=0;i<lost.length;i++){
            for(int j =0;j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    lost[i] = 0;
                    reserve[j] = 0;                                       
                }             
            }           
        }
        
        // 빌린 애들 처리
        for(int i=0;i<lost.length;i++){
            if(lost[i] ==0){
                continue;
                }
            answer --;
            for(int j=0;j<reserve.length;j++){
                
                if(reserve[j] ==0){
                    continue;
                }
                
                
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    answer ++;
                    reserve[j] = 0;
                    break;                  
                }
                                
            }
                        
        }
        return answer;
    }
}