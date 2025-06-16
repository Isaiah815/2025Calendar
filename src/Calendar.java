import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Calendar {


    public static void printCalendar(int year , Month month){
        LocalDate firstDay = LocalDate.of(year,month,1);
        int lengthOfMonth = firstDay.lengthOfMonth();

        System.out.println("\n\n" + month + " " + year);
        System.out.println("SUN MON TUE WED THUR FRI SAT");

        int startDay = firstDay.getDayOfWeek().getValue() %7;

        for (int i =0; i<startDay; i++){
            System.out.print("    ");
        }
        for (int day =1; day<=lengthOfMonth;day++){
            System.out.printf("%3d ", day);

            if ((startDay + day)%7 ==0){
                System.out.println();
            }
        }
System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
for (Month month : Month.values()){
    printCalendar(year,month);
}
sc.close();
        }
    }
