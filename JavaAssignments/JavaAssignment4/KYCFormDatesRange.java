package JavaAssignment4;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.lang.*;
import java.time.*;
public class KYCFormDatesRange {
    public void datesRange(String signupdate, String currDate) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signupDate=LocalDate.parse(signupdate,df);
        LocalDate currentDate=LocalDate.parse(currDate,df);
        if(currentDate.getYear()<=signupDate.getYear())
            System.out.println("No Range");
        else{
            //calculate year difference
            int diff=signupDate.getYear()-currentDate.getYear();
            signupDate=signupDate.minusYears(diff);
            //adding or subtracting 30days
            LocalDate start=signupDate.minusDays(30);
            LocalDate stop=signupDate.plusDays(30);
            //stop window should not exceed current date
            if(currentDate.compareTo(stop)<0) stop=currentDate;
            System.out.println(start.format(df)+" "+stop.format(df));
        }

    }
    public static void main(String args[]) {
        KYCFormDatesRange kyc=new KYCFormDatesRange();
        //enter number of queries
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String signup=sc.next();
            String current=sc.next();
            kyc.datesRange(signup,current);
        }
    }
}
