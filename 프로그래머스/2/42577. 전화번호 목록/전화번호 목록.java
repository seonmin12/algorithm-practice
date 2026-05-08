import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        // 정렬
        Arrays.sort(phone_book);
        
        // 접두어 있는지 확인
        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;    
            }
            
        }
        return true;
        
        
    }
}