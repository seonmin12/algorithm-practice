import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> scoreMap = new HashMap<>();

        int[] result = new int[photo.length];

        // 이름별 그리움 점수 저장
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        // 사진 한 장씩 순회
        for (int i = 0; i < photo.length; i++) {

            int sum = 0;

            // 현재 사진 속 사람들을 순회
            for (String person : photo[i]) {

                // 해당 사람의 점수를 sum에 더하기
                sum += scoreMap.getOrDefault(person, 0);
            }

            // 현재 사진의 총점을 결과 배열에 저장
            result[i] = sum;
        }

        return result;
    }
}