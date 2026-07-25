import java.util.*;
class Solution {
    public String solution(String s) {
        
        // 문자열에서 공백 기준으로 자르기
        String[] numbers= s.split(" ");
        
        // 첫번째 값으로 max, min 초기화
        int first = Integer.parseInt(numbers[0]);
        int max = first;
        int min = first;
        
        
        for(int i=1;i<numbers.length;i++){
            // numbers[i]를 int로 변환
            int current = Integer.parseInt(numbers[i]);
            
            // min 갱신
            if(current<min){
                min = current;
            }
            
            // max 갱신 
            if(current>max){
                max =current;  
            }
                        
        }
        
        // 문자열로 변환
        String answer = min + " " + max;
        
        return answer;
        
       
    }
}