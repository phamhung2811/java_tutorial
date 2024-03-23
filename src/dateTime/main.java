package dateTime;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        System.out.println(TimeUnit.DAYS.toSeconds(365*3000));
        System.out.println(TimeUnit.HOURS.toSeconds(25));
        System.out.println(TimeUnit.SECONDS.toDays(90000));

        Date d=new Date(System.currentTimeMillis());
        Time t=new Time(System.currentTimeMillis());
        System.out.println(d);
        System.out.println(t);

        Calendar cl=Calendar.getInstance();
        System.out.println(cl.get(Calendar.DATE)+"/"+cl.get(Calendar.MONTH)+"/"+cl.get(Calendar.YEAR));

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        cl.roll(Calendar.HOUR,10);
        System.out.println(cl.get(Calendar.DATE)+"/"+cl.get(Calendar.MONTH)+"/"+cl.get(Calendar.YEAR));


        cl.add(Calendar.DATE,14);
        System.out.println(cl.get(Calendar.DATE)+"/"+cl.get(Calendar.MONTH)+"/"+cl.get(Calendar.YEAR));
    }
}