package com.company;

public class graphDFS {

    public boolean rec(char[][] input, int i, int j, boolean[][] visited,StringBuffer sb, boolean goal)
    {
        System.out.println("####"+sb.toString());
        int[][] dirs = {{0,-1}, //L
                        {0,1},  //R
                        {1,0},  //D
                        {-1,0}};//U


        if(i<0 || j<0 || i>= visited.length || j>=visited[0].length || visited[i][j] || input[i][j] == '@')
        {
           return goal;
        }
        if(input[i][j]=='F') {
            return true;
        }
        else {
            visited[i][j] = true;
            for (int k = 0; k < dirs.length; k++) {
                sb.append(k);
                goal = rec(input, i+dirs[k][0], j+dirs[k][1], visited,sb, goal);
                if(goal) return true;
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return goal;
    }





    public boolean findPath(String[] input){
        char[][] in = new char[input.length][input[0].length()];
        char[][] parent = new char[input.length][input[0].length()];
        int[][] start = new int[1][2];
        int[][] end = new int[1][2];
        for(int i=0 ; i< in.length ; i++){
            in[i] = input[i].toCharArray();
            for(int j = 0 ; j < in[i].length;j++){
                if(input[i].charAt(j) == 'S'){

                    start[0][0] = i;
                    start[0][1] = j;
                }
                if(input[i].charAt(j) == 'F'){

                    end[0][0] = i;
                    end[0][1] = j;
                }
            }

        }
        boolean[][] visited = new boolean[in.length][in[0].length];
        StringBuffer sb = new StringBuffer();
        System.out.println(">>>>>>>>>>>>>>>>"+rec(in,0,0,visited,sb,false));
        System.out.println("******************"+sb.toString());

//        for(int i=0;i<parent.length;i++)
//        {
//            for(int j=0;j<parent[i].length;j++)
//                System.out.print(parent[i][j]);
//            System.out.println();

//        }
        path(in.length-1,in[0].length-1,parent,sb);
        System.out.println(sb.reverse().toString());



        boolean ans = visited[end[0][0]][end[0][1]];
        return ans;
    }

    public void path(int i, int j, char[][] parent, StringBuffer path)
    {
//        System.out.println(i+";"+j);
        if(i==0 && j==0) return;
        if(i >= parent.length || j >= parent[0].length|| i<0   || j<0) return;
        else
        {
            path.append(parent[i][j]);
            char d = parent[i][j];
            if(d=='D')
                path(i-1,j,parent,path);
            else if(d=='U')
                path(i+1,j,parent,path);
            else if(d=='R')
                path(i,j-1,parent,path);
            else if(d=='L')
                path(i,j+1,parent,path);
        }
    }
}
