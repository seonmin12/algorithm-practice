import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
       Map<Character, Integer> map = new HashMap<>();
       StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<survey.length;i++){
            char ch;
            if(choices[i] == 4){
                continue;
            }
            
            if(choices[i]>4){
                ch = survey[i].charAt(1);
            }else{
                ch = survey[i].charAt(0);
            }
            
            map.put(ch, map.getOrDefault(ch,0)+ Math.abs(4 - choices[i]));
            
        }
        int rScore = map.getOrDefault('R',0);
        int tScore = map.getOrDefault('T',0);
        sb.append(rScore>=tScore? 'R':'T' );
        
        int cScore = map.getOrDefault('C',0);
        int fScore = map.getOrDefault('F',0);
        sb.append(cScore>=fScore? 'C':'F');
        
        int jScore = map.getOrDefault('J',0);
        int mScore = map.getOrDefault('M',0);
        sb.append(jScore>=mScore? 'J':'M');
        
        int aScore = map.getOrDefault('A',0);
        int nScore = map.getOrDefault('N',0);
        sb.append(aScore>=nScore? 'A':'N');
        
        return sb.toString();
        
    }
}