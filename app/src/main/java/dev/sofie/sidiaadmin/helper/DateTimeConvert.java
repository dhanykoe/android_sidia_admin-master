package dev.sofie.sidiaadmin.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConvert {
    public static String hourOnly(String time) {
        String result = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("Y-M-d H:mm:s");
        try {
            return new SimpleDateFormat("HH:mm:ss ").format(dateFormat.parse(time));
        } catch (ParseException e) {
            return result;
        }
    }

    public static String dateOnly(String time) {
//        String result = "";
//        SimpleDateFormat dateFormat = new SimpleDateFormat("Y-M-d");
//        try {
//            return new SimpleDateFormat("d MMM Y ").format(dateFormat.parse(time));
//        } catch (ParseException e) {
//            return result;
//        }
        return time;
    }

    public static String dateOnlyNow(){
        return new SimpleDateFormat("d MMM Y ").format(new Date());
    }
}
