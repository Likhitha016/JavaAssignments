package JavaAssignment11;

import java.io.*;
import java.util.HashMap;

public class CharacterOccurence {
    //creates hashmap for storing characters along with their count of occurence
    HashMap<Character,Integer> TextFileMap=new HashMap<>();
    public void count(String input){
        //convert every character to lower case
        input=input.toLowerCase();
        char inputArray[]=input.toCharArray();
        for(Character ch:inputArray){
            //Increment count if the character is already present in Map
            if(TextFileMap.containsKey(ch))
                TextFileMap.put(ch,TextFileMap.get(ch)+1);
            //Initialize count of each character to 1 if it is not present in Map
            else
                TextFileMap.put(ch,1);
        }
    }
    public static void main(String args[]) throws IOException {
        //using commanline arguments take the inout file
        File fileinput=new File(args[0]);
        BufferedReader br=new BufferedReader(new FileReader(fileinput));
        CharacterOccurence characterOccurence=new CharacterOccurence();
        File fileoutput=new File("Output.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter(fileoutput));
        String s;
        //Untill the end of file reached count the characters
        while((s=br.readLine())!=null){
            characterOccurence.count(s);
            System.out.println(s);
        }
        //writing th character and its occurence to the output file
        for(Character c:characterOccurence.TextFileMap.keySet()){
            bw.write(c+" "+characterOccurence.TextFileMap.get(c));
            bw.newLine();
            System.out.println(c+" "+characterOccurence.TextFileMap.get(c));
        }
        bw.close();
    }
}
