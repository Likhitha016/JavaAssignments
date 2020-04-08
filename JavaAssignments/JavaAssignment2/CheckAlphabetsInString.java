package JavaAssignment2;

import java.util.HashSet;
import java.util.Scanner;
public class CheckAlphabetsInString {
    public boolean check(String input){
        boolean f=false;
        //convert string to lowercase or Uppercase as the input is case sensitive
        input=input.toLowerCase();
        HashSet<Character> hs=new HashSet<>();
        //store all characters to hashset as it doesn't allow duplicates
        for(int i=0;i<input.length();i++) {
            if(Character.isLetter(input.charAt(i)))
                hs.add(input.charAt(i));
        }
        //check size of hashset whether it contains all alphabets
        if(hs.size()==26) f=true;
        return f;
    }
    public static void main(String args[]){
        CheckAlphabetsInString c=new CheckAlphabetsInString();
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(c.check(input)?"Contains all alphabets":"Doesn't contain all alphabets");
    }
}
