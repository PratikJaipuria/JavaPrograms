package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class KnightLChessBoard {

    public class qElement{
        int i;
        int j;
        int level;

        public qElement(int i, int j, int level) {
            this.i = i;
            this.j = j;
            this.level = level;
        }


    }
    public int bfs(boolean[][] visited, int n, int incrI, int incrJ, Queue<qElement> queue){
        if(queue.isEmpty()) return -1;

        while(!queue.isEmpty()){
            qElement incr = queue.poll();

            int i = incr.i;
            int j = incr.j;

            if(i < 0 || i >= n || j < 0 || j >=n) continue;

            if(visited[i][j])
                continue;

            visited[i][j] = true;

            if(i==n-1 && j==n-1) return incr.level;

            int jumps = incr.level+1;
            queue.offer(new qElement(i + incrI, j + incrJ, jumps));
            queue.offer(new qElement(i + incrI, j - incrJ, jumps));
            queue.offer(new qElement(i - incrI, j + incrJ, jumps));
            queue.offer(new qElement(i - incrI, j - incrJ, jumps));
            queue.offer(new qElement(i + incrJ, j + incrI, jumps));
            queue.offer(new qElement(i + incrJ, j - incrI, jumps));
            queue.offer(new qElement(i - incrJ, j + incrI, jumps));
            queue.offer(new qElement(i - incrJ, j - incrI, jumps));


            int l = bfs(visited,n,incrI,incrJ,queue);
            visited[i][j] = false;

            return l;
        }
        return -1;
    }
    public int[][] knightlOnAChessboard(int n) {
        int[][] result = new int[n-1][n-1];
        boolean[][] visited = new boolean[n][n];
        Queue<qElement> queue = new LinkedList();
        for(int i=0 ; i < n-1 ; i++){
            for(int j=0 ; j < n-1 ; j++){
                result[i][j] = -1;
            }
        }

        for(int i=1; i < n; i++){
            for(int j=1; j < n; j++){
                int[] c = new int[1];

                queue = new LinkedList();
                queue.add(new qElement(i,j,1));
                int v = bfs(visited, n, i, j, queue);
                if(v>0)
                    result[i-1][j-1] = v;
                visited = new boolean[n][n];
            }
        }
        return result;
    }



}
