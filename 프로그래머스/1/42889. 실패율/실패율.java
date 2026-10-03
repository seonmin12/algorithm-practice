import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {

        // 각 스테이지에서 멈춘 사람 수
        int[] count = new int[N + 2];

        // ① 사람들을 한 번 돌면서 카운트
        for (int i = 0; i < stages.length; i++) {
            count[stages[i]]++;
        }

        // 스테이지 번호 → 실패율
        Map<Integer, Double> map = new HashMap<>();

        // 처음에는 모든 사람이 1단계에 도달
        int total = stages.length;

        // ② 각 스테이지의 실패율 계산
        for (int i = 1; i <= N; i++) {

            int fail = count[i];

            double failureRate;

            if (total == 0) {
                failureRate = 0;
            } else {
                failureRate = (double) fail / total;
            }

            map.put(i, failureRate);

            // i에서 실패한 사람은 i+1에 도달하지 못함
            total -= fail;
        }

        // ③ 스테이지 번호를 리스트로
        List<Integer> list = new ArrayList<>(map.keySet());

        // ④ 실패율 내림차순
        // 실패율이 같으면 스테이지 번호 오름차순
        list.sort((a, b) -> {

            int compare = Double.compare(map.get(b), map.get(a));

            if (compare == 0) {
                return Integer.compare(a, b);
            }

            return compare;
        });

        // ⑤ List<Integer> → int[]
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}