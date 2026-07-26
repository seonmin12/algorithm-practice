import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int height = 3; height <= total; height++) {

            // height로 나누어떨어져야 가로 길이가 정수가 됨
            if (total % height != 0) {
                continue;
            }

            int width = total / height;

            // 가로는 세로보다 길거나 같아야 함
            if (width < height) {
                continue;
            }

            // 테두리를 제외한 안쪽 넓이가 yellow인지 확인
            if ((width - 2) * (height - 2) == yellow) {
                return new int[]{width, height};
            }
        }

        return new int[]{};
    }
}