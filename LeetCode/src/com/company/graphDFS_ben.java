//import java.util.*;
//public class Solution {
//    public int getFood(char[][] grid) {
//        int i=0;
//        int j=0;
//        for(i=0; i<grid.length; i++) {
//            for (j=0; j<grid[0].length; j++) {
//                if(grid[i][j]=='*') break;
//            }
//        }
//        return bfs(grid, i, j);
//    }
//
//    public int bfs(char[][] grid, int i, int j) {
//        int c =0;
//        LinkedList<Point> q = new LinkedList();
//        q.offer(new Point(i,j));
//        while(!q.isEmpty()) {
//            Point cur = q.poll();
//            for(Point n: getNextAction(cur,grid)) {
//                if(grid[n.i][n.j]=='#') return c+1;
//                q.offer(n);
//            }
//            c++;
//        }
//        return -1;
//    }
//
//    public List<Point> getNextAction(Point p, char[][] grid) {
//        List<Point> ns = new ArrayList();
//        if(getValid(p.i+1,p.j)!=null)ns.add(getValid(p.i+1,p.j));
//        if (getValid(p.i-1,p.j)!=null) ns.add(getValid(p.i-1,p.j));
//        if(getValid(p.i,p.j-1)!=null) ns.add(getValid(p.i,p.j-1));
//        if(getValid(p.i,p.j+1)!=null) ns.add(getValid(p.i,p.j+1));
//        return ns;
//    }
//
//    public Point getValid(char[][] grid, int i, int j){
//        if(i<0|| i>=grid.length || j<0 ||j >= grid[0].length|| grid[i][j]=='X') return null;
//        return new Point(i,j);
//    }
//
//    class Point{
//        int i;
//        int j;
//        public Point(int i, int j) {
//            this.i =i;
//            this.j =j;
//        }
//    }
//}
//
//
