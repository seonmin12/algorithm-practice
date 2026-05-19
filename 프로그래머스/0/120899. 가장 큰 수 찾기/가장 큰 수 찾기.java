import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        // 최대값을 첫번째 값이라 가정
        int max = array[0];
        int maxIndex = 0;
        
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                // 더 큰 값 만나면 max, maxIndex 갱신
                max = array[i];
                maxIndex = i;
            }  
            
        }
        // 반복 후 
        answer[0] = max;
        answer[1] = maxIndex;
        
        return answer;
              
    }
}