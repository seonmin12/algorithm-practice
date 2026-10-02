import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
       // keymap 순회하며 map에 저장
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<keymap.length;i++){
            for(int j=0; j<keymap[i].length();j++){
                char c = keymap[i].charAt(j);
                if(!map.containsKey(c)){
                    map.put(c, j +1);                
                }else{
                    map.put(c, Math.min(map.get(c),j+1));
                }                  
                  }           
        }
        
        // target 순회
        for(int i=0;i<targets.length;i++){
            int num = 0;
            for(int j=0;j<targets[i].length();j++){
                char ch = targets[i].charAt(j);
                if(!map.containsKey(ch)){
                    answer[i] = -1;
                    break;
                }
                
                num += map.get(ch);
                answer[i] = num;
                
                
            }
                        
        }
        return answer;
    }
}