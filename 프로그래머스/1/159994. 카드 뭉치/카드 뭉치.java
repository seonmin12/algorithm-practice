import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        Queue<String>q1 = new ArrayDeque<>();
        Queue<String>q2 = new ArrayDeque<>();
        
        for(String card : cards1){
            q1.offer(card);  
        }
        
        for(String card : cards2){
            q2.offer(card);  
        }
        
        
        for(String word: goal){
            // q1 맨앞이 goal과 같으면 q1에서 꺼내기
            if(!q1.isEmpty() && word.equals(q1.peek())){
                q1.poll(); // 사용한 카드 제거    
            }else if(!q2.isEmpty()&&word.equals(q2.peek())){
                q2.poll();    
            }else{
                return "No";
            }
            
        }
        
        return "Yes";
        
    }
}