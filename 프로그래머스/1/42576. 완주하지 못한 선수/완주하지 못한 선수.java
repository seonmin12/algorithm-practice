import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 참가자 이름 카운팅
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 완주자 이름 카운트 빼기
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // 카운트가 남아 있는 사람이 미완주자
        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                return name;
            }
        }

        return "";
    }
}