package JavaAssignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatching {

    public void checkMatch(String input) {
        //stores the regex
        Pattern pattern=Pattern.compile("^[A-Z]+.*\\.$");
        //checking whether given string matches with pattern
        if(pattern.matcher(input).matches())
            System.out.println("Follows the given Pattern");
        else
            System.out.println("Doesn't follow Pattern");
    }
    public static void main(String args[]){
        PatternMatching match=new PatternMatching();
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        match.checkMatch(input);
    }

}
