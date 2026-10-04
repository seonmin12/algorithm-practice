import java.util.*;
class Solution {
    public String solution(String X, String Y) {
      Map<Integer, Integer> xMap = new HashMap<>();
      Map<Integer, Integer> yMap = new HashMap<>();
      StringBuilder sb = new StringBuilder();
      
     for(int i =0;i<X.length();i++){
         int num = X.charAt(i) - '0';
         xMap.put(num, xMap.getOrDefault(num,0) + 1);       
           }
        
    for(int i = 0;i<Y.length();i++){
        int num = Y.charAt(i) - '0';
        yMap.put(num, yMap.getOrDefault(num,0)+1);
    }
        
    for(int i=9;i>=0;i--){
        int xCount = xMap.getOrDefault(i,0);
        int yCount = yMap.getOrDefault(i,0);
        
        int count = Math.min(xCount, yCount);
        
       for (int j = 0; j < count; j++) {
        sb.append(i);
        }
        
                   
    }
        
        if(sb.length()==0){
            return "-1";
        }
        
        if(sb.charAt(0)== '0'){
            return "0";
            
        }
        
        return sb.toString();
        
        
      
        
        
       
    }
}