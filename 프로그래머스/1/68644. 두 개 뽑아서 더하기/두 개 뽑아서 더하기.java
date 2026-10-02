import java.util.*; 
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1 ;j<numbers.length;j++){
                int num = numbers[i] + numbers[j];
                set.add(num);
                
                
            }
                    
            
        }
        int[] answer = set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        Arrays.sort(answer);
        
        return answer;
            
        
    }
}