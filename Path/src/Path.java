import java.util.ArrayList;
import java.util.Stack;

public class Path {
    String path;

    public Path(String path){
        this.path = path;
    }

    public void setPath(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }

    public Path cd(String newPath){
        System.out.println("Current directory :" + this.getPath());
        System.out.println("Requested directory : " + newPath);


        if(newPath.charAt(0) == '/'){
//            this.setPath("");
            this.path = "";
        }
        int i= 0;
        Stack<Character> stack = new Stack<>();

        while (i < this.getPath().length()){
            if(Character.isLetter(this.getPath().charAt(i))){
                stack.push(this.getPath().charAt(i));
            }
            i++;
        }
        int j = 1;
        while (j < newPath.length()){
            if(Character.isLetter(newPath.charAt(j))){
                stack.push(newPath.charAt(j));
            }

            if(!stack.isEmpty() && newPath.charAt(j)=='.' && newPath.charAt(j-1)=='.'){
                stack.pop();
            }
            j++;
        }
        ArrayList<Character> changedPath = new ArrayList<>();
        while (!stack.isEmpty()){
            char c = stack.pop();
            changedPath.add(c);
        }
        StringBuilder res = new StringBuilder();

        for(int k = 0; k < changedPath.size() ; k++){
           res.append(changedPath.get(k));
           res.append("/");
        }

        return new Path(res.reverse().toString());

    }

    public static void main(String[] args) throws Exception{
        Path path = new Path("/a/b/e/d");
        System.out.println(path.cd("../x").cd("/").cd("r/h/s").getPath());
    }
}
