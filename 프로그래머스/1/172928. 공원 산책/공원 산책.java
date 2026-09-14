import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        // park 돌면서 s 찾기
        int row = 0; //세로
        int col = 0; //가로
        
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[i].length();j++){
                if(park[i].charAt(j)=='S'){
                    row = i;
                    col = j;                    
                }
                
            }
            
        }
        
        for(String route: routes){
            String[] parts = route.split(" ");
            
            String direction = parts[0];
            int distance = Integer.parseInt(parts[1]);
            
            int tempRow =row;
            int tempCol = col;
                        
        
        
        boolean valid = true;
        
        for(int s =0; s<distance; s++){
            // direction 따라 한칸 이동
            switch(direction){
                case "E" : tempCol ++;
                    break;
                case "W" : tempCol --;
                    break;
                case "N" : tempRow --;
                    break;
                case "S" : tempRow ++;
                    break;
                                
            }
            
            // park 범위 벗어나는지 검사
            if(tempRow<0||tempRow>=park.length||tempCol<0
               ||tempCol>=park[0].length()){
                valid = false;
                break;               
            }
            
            if(park[tempRow].charAt(tempCol)=='X'){
                valid = false;
                break;
            }            
            
        }
        
        if(valid){
            row = tempRow;
            col = tempCol;         
        }
            
        }
        
        return new int[]{row, col};
            
            
            
        }
        
    }
