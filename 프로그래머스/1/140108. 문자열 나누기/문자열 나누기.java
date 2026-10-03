import java.util.*;
class Solution {
    public int solution(String s) {
        
        int xNum = 0;
        int yNum = 0;
        int answer = 0; 
        
        char x = s.charAt(0);
        
        for(int i=0;i<s.length();i++){
            
            if(xNum ==0 && yNum ==0){
                x = s.charAt(i);              
            }
            
            if(x == s.charAt(i)){
                xNum ++;
            }else{
                yNum++;
            }
            
            
            if(xNum == yNum){
                answer ++;
                xNum =0;
                yNum =0;
            }
            
            if(i == s.length() -1 && xNum != yNum ){
                answer ++;
            }
    
                  
        }
        return answer;
      
    }
}