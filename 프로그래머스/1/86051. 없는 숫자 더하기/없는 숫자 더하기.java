import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
        int result = 0;
        for(int i=0;i<=9;i++){
            boolean found = false;
            for(int j =0;j<numbers.length;j++){
                if(i == numbers[j]){
                  found = true;   
                  break;
                }                
            }
            
            if(found == false){
                result += i;
                 }
           
            
            
        }  
        return result;

        
    }
}