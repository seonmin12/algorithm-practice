import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // N개의 숫자를 입력받아 저장하기
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
            
        }
         
        int m = sc.nextInt();

        // M개의 숫자를 입력받아 존재 여부 확인하기
        for(int i=0;i<m;i++){
            if(!set.contains(sc.nextInt())){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
            
        }


    }
}