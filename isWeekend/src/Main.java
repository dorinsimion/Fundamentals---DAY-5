import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.DayOfWeek.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date= scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DayOfWeek dayOfWeek = LocalDate.parse(date,formatter).getDayOfWeek();
//        localDate=localDate.plusMonths(3);
//        System.out.println(localDate);//2019-05-19
//        System.out.println(localDate.format(formatter));//19-05-2019
//        System.out.println(formatter.format(localDate));
        if(dayOfWeek.equals(SATURDAY)
                || dayOfWeek.equals(SUNDAY)){
            System.out.println("Week-end!");
        }else{
            System.out.println("Go to work!");
        }
    }
}
