import java.util.*;

class Solution {

    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {

        boolean[] visited = new boolean[numbers.length()];

        // 숫자 조합 만들기
        dfs(numbers, "", visited);

        int answer = 0;

        // 만들어진 숫자들이 소수인지 확인
        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    // DFS: 숫자 조합 생성
    public void dfs(String numbers, String current, boolean[] visited) {

        for (int i = 0; i < numbers.length(); i++) {

            if (visited[i]) {
                continue;
            }

            visited[i] = true;

            String next = current + numbers.charAt(i);

            set.add(Integer.parseInt(next));

            dfs(numbers, next, visited);
            // 백트래킹(선택 취소)
            visited[i] = false;
        }
    }

    // 소수 판별
    public boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}