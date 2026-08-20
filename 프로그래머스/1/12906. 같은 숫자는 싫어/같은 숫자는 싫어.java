import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i =0;i<arr.length;i++){
            if(list.size() == 0){
                list.add(arr[i]);     
            }else if(arr[i]!= list.get(list.size()-1)){
                list.add(arr[i]);
                
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
                     
        }
        
        return answer;
        
        
        
    }
}