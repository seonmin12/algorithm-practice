import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        List<String> list = new ArrayList<String>(set);

        list.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });

        for (String word : list) {
            System.out.println(word);
        }
    }
}