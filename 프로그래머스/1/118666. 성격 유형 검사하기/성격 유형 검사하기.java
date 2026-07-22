import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 성격 유형별 점수 저장
        Map<Character, Integer> score = new HashMap<>();

        // 질문별 점수 누적
        for (int i = 0; i < survey.length; i++) {
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);

            int choice = choices[i];
            int point = Math.abs(choice - 4);

            if (choice < 4) {
                score.put(
                    disagree,
                    score.getOrDefault(disagree, 0) + point
                );
            } else if (choice > 4) {
                score.put(
                    agree,
                    score.getOrDefault(agree, 0) + point
                );
            }
        }

        StringBuilder answer = new StringBuilder();

        int rScore = score.getOrDefault('R', 0);
        int tScore = score.getOrDefault('T', 0);
        answer.append(rScore >= tScore ? 'R' : 'T');

        int cScore = score.getOrDefault('C', 0);
        int fScore = score.getOrDefault('F', 0);
        answer.append(cScore >= fScore ? 'C' : 'F');

        int jScore = score.getOrDefault('J', 0);
        int mScore = score.getOrDefault('M', 0);
        answer.append(jScore >= mScore ? 'J' : 'M');

        int aScore = score.getOrDefault('A', 0);
        int nScore = score.getOrDefault('N', 0);
        answer.append(aScore >= nScore ? 'A' : 'N');

        return answer.toString();
    }
}