import java.util.Scanner;
public class CountSundays {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String startDay = myobj.next().toLowerCase();
        int n = myobj.nextInt();
        int daysUntilSunday;
        switch (startDay) {
            case "mon": daysUntilSunday = 7;  break; 
            case "tue": daysUntilSunday = 6;  break;  
            case "wed": daysUntilSunday = 5;  break; 
            case "thu": daysUntilSunday = 4;  break;   
            case "fri": daysUntilSunday = 3;  break; 
            case "sat": daysUntilSunday = 2;  break; 
            case "sun": daysUntilSunday = 1;  break;
            default:
                System.out.println("Invalid day");
                return;
        }
        int count = 1;
        int day = daysUntilSunday;
        while (day <= n) {
            count++;
            day += 7;
        }
        System.out.println(count);
    }
}