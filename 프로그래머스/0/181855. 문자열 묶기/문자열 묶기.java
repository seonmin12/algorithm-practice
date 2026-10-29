import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<strArr.length;i++){
            String str = strArr[i];
            int len = str.length();
            map.put(len, map.getOrDefault(len,0)+1);
                    
        }
        
        int answer = 0; 
        
        for(int count: map.values()){
            answer = Math.max(answer, count);
        }
        
        return answer;
        
        
        
        
    }
}