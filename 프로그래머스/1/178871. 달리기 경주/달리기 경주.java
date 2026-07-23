import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        // 선수 이름 -> 현재 위치
        Map<String, Integer> rankMap = new HashMap<>();

        // 초기 선수별 위치 저장
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        // 불린 선수 순서대로 처리
        for (String calledName : callings) {

            // 불린 선수의 현재 위치
            int currentIndex = rankMap.get(calledName);

            // 바로 앞 선수의 위치와 이름
            int frontIndex = currentIndex - 1;
            String frontName = players[frontIndex];

            // players 배열에서 두 선수 교환
            players[frontIndex] = calledName;
            players[currentIndex] = frontName;

            // rankMap에서도 두 선수 위치 갱신
            rankMap.put(calledName, frontIndex);
            rankMap.put(frontName, currentIndex);
        }

        return players;
    }
}