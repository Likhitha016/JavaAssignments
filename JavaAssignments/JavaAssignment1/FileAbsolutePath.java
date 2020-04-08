package JavaAssignment1;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

public class FileAbsolutePath {
    public void getPath(String input) {
        Stack<String> paths=new Stack<>();
        ArrayList<String> absolutepath=new ArrayList<>();
        paths.add("/home");
        //checks files util the regex matches
        while(!paths.isEmpty()){
            String path=paths.pop();
            File f=new File(path);
            //if the file is directory,pushes the files to  the stack
            if(f.isDirectory()){
                for(File temp:f.listFiles()){
                    System.out.println(temp.getName());
                    paths.push(path+"/"+temp.getName());}
            }
            //adds the file path that matches the regex to the array list
            if(Pattern.matches(input,f.getName()))
                absolutepath.add(path);
        }
        //prints the absolute path
        for(String res:absolutepath)
            System.out.println(res);
    }
    public static void main(String args[]) {
        FileAbsolutePath f=new FileAbsolutePath();
        Scanner sc=new Scanner(System.in);
        String regex=sc.next();
        f.getPath(regex);
    }

}
