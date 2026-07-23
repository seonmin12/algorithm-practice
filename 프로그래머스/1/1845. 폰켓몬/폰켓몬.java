import java.util.*;
class Solution {
    public int solution(int[] nums) {
      
        // 폰켓몬 종류 중복 제거 set
        Set<Integer> types = new HashSet<>();
        
        // nums의 모든 값을 set에 추가
        for(int num: nums){
            types.add(num);
            
        }
        
        // 가져갈 수 있는 폰켓몬 수
        int canTake = nums.length/2;
        
        // 전체 폰켓몬 종류 수
        int typeCount = types.size();
        
        // 둘 중 작은 값 반환
        //int result = canTake>typeCount ? typeCount:canTake
        int result = Math.min(canTake,typeCount);
            
        return result;
    }
}