import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        
        int left = 10; // *
        int right = 12; // #
        
        StringBuilder sb = new StringBuilder();
        
        for(int num: numbers){
            int target = (num == 0) ? 11 : num;
            if(num ==1 || num ==4 || num==7){
                // 무조건 왼손
                sb.append("L");
                left = target;
                
            }else if(num ==3||num ==6 || num ==9){
                // 무조건 오른손
                sb.append("R");
                right = target;                
            }else{  // 2, 5, 8, 0 거리 계산 
                
                // row, col 변환
                int leftRow = (left - 1) /3;
                int leftCol = (left - 1) %3;
                
                int rightRow = (right-1) /3;
                int rightCol = (right -1) %3;
                
                int numRow = (target -1) /3;
                int numCol = (target - 1)%3;
                
                int leftDifference = Math.abs(leftRow - numRow) 
                    + Math.abs(leftCol -numCol);
                
                int rightDifference = Math.abs(rightRow - numRow)
                    + Math.abs(rightCol - numCol);
                
                if(leftDifference<rightDifference){
                    sb.append("L"); 
                    left = target;
                }else if(leftDifference>rightDifference){
                    sb.append("R");
                    right = target;
                }else{
                    if(hand.equals("left")){
                        sb.append("L");
                        left = target;
                    }else{
                        sb.append("R");
                        right = target;
                    }
                    
                }
                
                
            }
            
            
                        
        }
        
        return sb.toString();
        
        
    
    }
}