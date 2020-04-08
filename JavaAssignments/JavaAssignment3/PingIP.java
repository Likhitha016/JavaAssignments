package JavaAssignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PingIP {
    void ping(String hostname,int n) throws IOException {
        //creates a sub process to execute ping command on respective host
        ProcessBuilder pb=new ProcessBuilder("ping","-c",String.valueOf(n), hostname);
        Process p=pb.start();
        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
        BufferedReader error=new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String s=null;
        int j=0;
        float times[]=new float[n];
        float median = 0;
        //reading output of command
        while((s=br.readLine())!=null )
        {
                //getting index of first occurence of time
                int index= s.indexOf("time=");
                if(index!=-1){
                    //storing the value of time and parsing it to respective type
                    String temp=s.substring(index+5,s.length()-3);
                    times[j++]=Float.parseFloat(temp);
                   }

        }
        //find median
        if(n%2==0){
            median=(times[n/2]+times[n/2+1])/2;
        }
        else
            median=times[n/2];
        System.out.println("Median of times: "+median);
        //error handling while host is unreachable
        while((s=error.readLine())!=null)
            System.out.println("Unable to reach host "+s);
    }
    public static void main(String args[]) throws IOException {
        PingIP p=new PingIP();
        Scanner sc=new Scanner(System.in);
        //enter number of packets
        int num=sc.nextInt();
        //add hosts to arraylist
        ArrayList<String> a=new ArrayList<>();
        a.add("127.0.1.1");
        a.add("127.0.0.53");
        for(String temp:a){
            p.ping(temp,num);
        }

    }
}
