import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int length = 0;
        int maxWidth =0;
        int maxLength= 0;
        
        int result =0;
        
        for(int i=0;i<sizes.length;i++){
            width = sizes[i][0];
            length = sizes[i][1];
            
            if(width<length){
                width = sizes[i][1];
                length = sizes[i][0];                
           }
            
            if(maxWidth<width){
                maxWidth =width;
            }
            if(maxLength<length){
                maxLength = length;
            }
            
            result = maxWidth * maxLength;
                
            
        }
        
        return result;
        
        
        
        
    }
}