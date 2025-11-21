import java.util.Scanner;
public class DateConversion

{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
    
        int TotalDays = sc.nextInt();
        int year = TotalDays/365;
        int month = (TotalDays % 365) / 30;
        int day = TotalDays % 30;
        System.out.println(year + " Years " + month + " Months " + day + " Days ");
    }
    
}