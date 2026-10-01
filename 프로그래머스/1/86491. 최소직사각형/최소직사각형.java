import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        int temp = 0; 
        
        for(int i=0;i<sizes.length;i++){
            int width = sizes[i][0];
            int height= sizes[i][1];
            
            if(sizes[i][0] <sizes[i][1]){
                temp = width;
                width = height;
                height = temp;                
            }
            
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
                        
        }
        answer = maxWidth * maxHeight;
        return answer;
        
    }
}