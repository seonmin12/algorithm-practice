import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<Character, Integer> map = new HashMap<>();
        int[] answer= new int[targets.length];
        
        //keymap 순회
        for(int i = 0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                char c = keymap[i].charAt(j);
                if(!map.containsKey(c)){
                    map.put(c, j+1);               
                }else{
                    map.put(c, Math.min(map.get(c),j+1));
                }               
            }
        }
            
    
       for(int i=0;i<targets.length;i++){
           int num =0;
           for(int j=0;j<targets[i].length();j++){
               char ch = targets[i].charAt(j);
               if(!map.containsKey(ch)){
                   answer[i] = -1;
                   break;
                                   
               }
               int mNum = map.get(ch);
               num += mNum;
               answer[i] = num;
               
           }
           
       }
        return answer;
            
            
            
            
        
    
    }
}