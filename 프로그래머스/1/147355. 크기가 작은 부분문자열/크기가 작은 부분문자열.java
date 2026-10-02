import java.util.*;
class Solution {
    public int solution(String t, String p) {
        
        int answer = 0;  
        long pNum = Long.parseLong(p);
        
        for(int i =0; i<t.length() - p.length() +1;i++){
            
            String num = t.substring(i,p.length() + i);
            long tNum = Long.parseLong(num);
            
            if(tNum<=pNum){
                answer ++;                          
            }
                        
        }

        return answer;
        
    }
}