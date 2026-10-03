import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            int move = 0; 
            // 실제 문자 한칸씩 이동 
            while(move<index){
               if(current == 'z'){
                   current = 'a';
               }else{
                   current ++;
               }
                // current가 skip 문자열에 존재하는지 , skip이면 move는 고정 이동만함
               if(skip.indexOf(current) != -1){
                 continue;  
               }else{
                   move ++;
               }
                
                
            }
            sb.append(current);
                       
        }
        return sb.toString();
    }
}