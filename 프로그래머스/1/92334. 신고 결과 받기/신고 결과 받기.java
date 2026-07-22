import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        // id -> answer 배열 위치
        Map<String, Integer> idIndex = new HashMap<>();

        // 신고당한 사람 -> 신고당한 횟수
        Map<String, Integer> reportedCount = new HashMap<>();

        // 같은 신고 중복 제거
        Set<String> uniqueReports = new HashSet<>();

        int[] answer = new int[id_list.length];

        // 1. id별 인덱스 저장
        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
        }

        // 2. report 중복 제거
        for (String oneReport : report) {
            uniqueReports.add(oneReport);
        }

        // 아래처럼 한 줄로도 가능
        // uniqueReports.addAll(Arrays.asList(report));

        // 3. 신고당한 횟수 계산
        for (String oneReport : uniqueReports) {

            // "muzi frodo"를 공백 기준으로 나누기
            String[] parts = oneReport.split(" ");

            String reporter = parts[0]; // 신고한 사람
            String reported = parts[1]; // 신고당한 사람

            // 신고당한 사람의 횟수 1 증가
            reportedCount.put(
                reported,
                reportedCount.getOrDefault(reported, 0) + 1
            );
        }

        // 4. 정지된 유저를 신고한 사람에게 메일 수 추가
        for (String oneReport : uniqueReports) {

            String[] parts = oneReport.split(" ");

            String reporter = parts[0];
            String reported = parts[1];

            // 신고당한 사람이 k번 이상 신고당했다면 정지
            if (reportedCount.getOrDefault(reported, 0) >= k) {

                // 신고한 사람의 answer 위치를 찾아 메일 수 증가
                int reporterIndex = idIndex.get(reporter);
                answer[reporterIndex]++;
            }
        }

        return answer;
    }
}