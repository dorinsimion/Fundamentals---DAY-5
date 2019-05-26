import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long epochTime = System.currentTimeMillis(); //timpul in milisecunde din 1970
        System.out.println(epochTime);
        Date date = new Date(epochTime);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        Date date1 = calendar.getTime();
        System.out.println(date1);
        calendar.setTime(new Date(epochTime));
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
