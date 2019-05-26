import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse("2019-05-26",format);
        localDate=localDate.minusDays(25);
        System.out.println(localDate);
        LocalDate l2 = LocalDate.now();
        boolean b1 = l2.isBefore(localDate);

        System.out.println(DayOfWeek.SATURDAY.toString());
    }
}
