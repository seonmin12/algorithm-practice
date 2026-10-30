import java.util.*;
class Solution {
    public int solution(int[] topping) {
        
        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();
        int result = 0;
        
        // 모든 토핑 오른쪽에 넣기
        for(int t: topping){
            rightMap.put(t, rightMap.getOrDefault(t,0) + 1);           
        }
        
        // 자르는 위치 옮기기
        for(int i =0;i<topping.length-1;i++){
            int t = topping[i]; 
            leftMap.put(t,leftMap.getOrDefault(t,0)+1);
            
            //오른쪽애서 개수 감소, 0개면 삭제
            rightMap.put(t, rightMap.getOrDefault(t,0)-1);
            if(rightMap.get(t) == 0){
                rightMap.remove(t);
            }
            
            // 양쪽 map 종류 비교 
            if(leftMap.size()==rightMap.size()){
                result++;
                
            }
                   
        }
        return result;
        
        

    }
}