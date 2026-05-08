import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];

        Queue<WordNode> queue = new LinkedList<>();
        queue.offer(new WordNode(begin, 0));

        while (!queue.isEmpty()) {
            WordNode current = queue.poll();

            if (current.word.equals(target)) {
                return current.count;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canConvert(current.word, words[i])) {
                    visited[i] = true;
                    queue.offer(new WordNode(words[i], current.count + 1));
                }
            }
        }

        return 0;
    }

    private boolean canConvert(String word1, String word2) {
        int diffCount = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }

            if (diffCount > 1) {
                return false;
            }
        }

        return diffCount == 1;
    }

    static class WordNode {
        String word;
        int count;

        WordNode(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}