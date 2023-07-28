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
        System.out.println("Formatted Date: " + simpleDateFormat.format(date));

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Formatted Date: " + simpleDateFormat2.format(date));
    }
}