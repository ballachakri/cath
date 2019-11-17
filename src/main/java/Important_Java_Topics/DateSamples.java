package Important_Java_Topics;


import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <p>
 *     Java Date class and various Date formats
 *     Using Data class, SimpleDateFormat class, Calender class.
 *     Using LocalDateTime class, LocalDate class LocalTime class
 *     Using ZonedDateTime class and DateTimeFormatter.
 * </p>
 */
public class DateSamples {

    public static void main(String[] args)  {
    date();
//  simPCalAPI();
    }

    static void date()
    {
//  Using util.Date : getting current date and time
    Date dt=new Date();
    System.out.println("Using util.Date :"+dt);

//  Using SimpleDateFormat [NOTE use always MM for month]
    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy : hh:mm:ss");
    Date dt1=new Date();
    System.out.println("Using SimpleDateFormat and util.Date :"+sdf.format(dt1));

//  Using Calender class
    Calendar cal=Calendar.getInstance();
    Date dt2=cal.getTime();
    System.out.println("Using Calender : "+dt2);

// Using Instant instance.
    Instant inst=Instant.now();
    System.out.println("Using Instant : " + inst);

// Using LocalDateTime.
    LocalDateTime ldt=LocalDateTime.now();
    System.out.println("Using LocalDateTime  :"+ldt);

// Using LocalDate instance - getting date.
    LocalDate ld=LocalDate.now();
    System.out.println("Local Date  :"+ ld);

// using LocalTime instance - getting time.
    LocalTime lt=LocalTime.now();
    System.out.println("Local Time : "+lt);

// Using ZonedDateTime object
    ZonedDateTime zdt=ZonedDateTime.now();
    System.out.println("Zoned Date Time object  : "+zdt);

// Using DateTimeFormatter
    DateTimeFormatter f=DateTimeFormatter.BASIC_ISO_DATE;
    String dt3=f.format(LocalDateTime.now());
    System.out.println("Date Time Formatter   :"+ dt3);
    }

    static void compareData()
    {
        //Date dt1=Date.Format("");
    }

 static void simPCalAPI()
 {
     SimpleDateFormat sdf=new SimpleDateFormat("yyyy MMM dd : hh:mm:ss");
     Calendar cl=new GregorianCalendar(2019,0,20,14,35,59);
     System.out.println(sdf.format(cl.getTime()));

     System.out.println(cl.get(Calendar.DAY_OF_YEAR));
 }
}
