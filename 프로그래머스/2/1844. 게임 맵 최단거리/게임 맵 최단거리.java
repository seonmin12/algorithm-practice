import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length; // 행 개수
        int m = maps[0].length;// 열 개수
        
        Queue<int[]> q = new LinkedList<>();
        
        // 상, 하, 좌, 우
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        //시작점 넣기
        q.offer(new int[]{0,0});
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            // 상하좌우 움직이기 
           for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
               
            // 1. 범위 밖이면 건너뛰기
            if(nx<0||ny<0||nx>=n||ny>=m){
                continue;
            }
            // 2. 벽이거나 이미 방문한 곳이면 건너뛰기
            if(maps[nx][ny] !=1){
                continue;
            } 
            // 3. 거리 기록 
            maps[nx][ny] = maps[x][y] + 1;
            
            // 4. 큐에 다음 좌표 넣기
            q.offer(new int[]{nx,ny});
               
           }
           
        }
        
        // 도착점에 도달 못했으면 여전히 1
        if(maps[n-1][m-1] == 1){
            return -1;
        }
        
        return maps[n-1][m-1];
        
    }
}