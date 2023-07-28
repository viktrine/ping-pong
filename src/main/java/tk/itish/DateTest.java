package tk.itish;

import java.text.SimpleDateFormat;
import java.util.Date;

// test date items
public class DateTest {
    public static void main(String[] args) {
        System.out.println("Print Dates");

        Date date = new Date();
        System.out.println("unformatted Date: "+date);

        System.out.println();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y/M/dd");
        final String printOutString = "Formatted Date: " + simpleDateFormat.format(date);
        System.out.println(printOutString);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Formatted Date: " + simpleDateFormat2.format(date));

        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Formatted Date: " + simpleDateFormat3.format(date));

        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Formatted Date: " + simpleDateFormat4.format(date));
    }
}