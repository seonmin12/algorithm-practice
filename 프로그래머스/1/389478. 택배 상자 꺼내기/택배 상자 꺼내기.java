import java.util.*;
class Solution {
    public int solution(int n, int w, int num) {
        // 1. 필요한 층수 구하고 배열 만들기
        int height = n/w;
        if(n%w !=0){
            height++;
        }
        
        int[][] boxes = new int[height][w];
        
        int number = 1; // 지금 놓을 상자 번호
        int targetRow = 0; // 찾는 상자 행
        int targetCol = 0; // 찾는 상자 열
        
        // 아래층부터 상자 채우기
        for(int row=0; row<height;row++){
            for(int step =0;step<w;step++){
                
                if(number>n){
                    break;
                }
                
                // 층에 따라 놓는 방향 결정
                int col;
                if(row % 2 ==0){
                    col = step;
                }else{
                    col = w -1 -step;
                }
                
                boxes[row][col] = number;
                
                // 찾는 상자라면 위치 기억하기
                if(number == num){
                    targetRow = row;
                    targetCol = col;
                }
                
                number ++;
                            
            }          
        }
        
        // 3. 목표 상자부터 위층으로 올라가서 세기
        
        int answer =0;
        
        for(int row = targetRow;row<height;row++){
            // 같은 열에 상자가 잇으면 answer 증가 
            if(boxes[row][targetCol] != 0){
                answer ++;
            }
            
            
        }
        
        return answer;
            
        
        
    }
}