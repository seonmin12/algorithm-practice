import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        List<Integer> list = new ArrayList<>();
        int result = 0;
        
        for(int x : ingredient){
            list.add(x);
            int n = list.size();
            
            // 맨 뒤 4개 검사
            if(n>=4 
               &&list.get(n-4) ==1
               &&list.get(n-3)==2
               &&list.get(n-2)==3
               &&list.get(n-1)==1){
                result++;
                
                // 4개(햄버거 완성) 제거
                for(int i=0;i<4;i++){
                    list.remove(list.size()-1);                             
                }
                                
            }
                        
        }
         return result;
        
    }
}