import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); //ora curenta
        System.out.println(localTime.getHour()); //doar ora
        System.out.println(localTime.getMinute()); //doar minutul
        localTime = LocalTime.of(1,20,3);
        System.out.println(localTime); //o anumita ora
        localTime=localTime.plusHours(2);
        System.out.println(localTime); // dupa ce am adaugat 2 ore.
        localTime = localTime.minusHours(2).minusMinutes(20);
        System.out.println(localTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // data curenta
        System.out.println(localDate.getYear());//2019
        System.out.println(localDate.getEra());
        System.out.println(localDate.getDayOfWeek());//Sunday
        System.out.println(localDate.getDayOfMonth());//26
        System.out.println(localDate.getDayOfYear());//100+
        System.out.println(localDate.getMonthValue());//5
        localDate = LocalDate.of(2019,5,1);
        System.out.println(localDate);
        localDate = LocalDate.of(2019,Month.MAY,1);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getDayOfWeek());
        localDateTime=localDateTime.minusDays(2).minusMonths(2).plusHours(4);
        System.out.println(localDateTime);
        localDateTime = LocalDateTime.of(localDate,localTime);
        localDateTime = LocalDateTime.of(2019,12,12,12,12);

        ZonedDateTime zonedDateTime= ZonedDateTime.now();
        zonedDateTime= zonedDateTime.of(localDateTime,ZoneId.systemDefault());
        zonedDateTime= zonedDateTime.of(localDate,localTime,ZoneId.systemDefault());
        System.out.println(zonedDateTime);
    }
}
