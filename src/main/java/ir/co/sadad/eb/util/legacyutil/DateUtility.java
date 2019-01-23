package ir.co.sadad.eb.util.legacyutil;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by kahmadi on 2/6/2017.
 */
public class DateUtility {

    static final long ONE_MINUTE_IN_MILLIS = 60000;

    public static LocalDate convertToLocalDate(Date date) {
        if (date == null) return null;
        return new LocalDate(date);
    }

    public static DateTime convertToDateTime(Date date) {
        if (date == null) return null;
        return new DateTime(date);
    }

    public static Date combineDateTime(Date date, Date time) {
        Calendar calendarA = Calendar.getInstance();
        calendarA.setTime(date);
        Calendar calendarB = Calendar.getInstance();
        calendarB.setTime(time);

        calendarA.set(Calendar.HOUR_OF_DAY, calendarB.get(Calendar.HOUR_OF_DAY));
        calendarA.set(Calendar.MINUTE, calendarB.get(Calendar.MINUTE));
        calendarA.set(Calendar.SECOND, calendarB.get(Calendar.SECOND));
        calendarA.set(Calendar.MILLISECOND, calendarB.get(Calendar.MILLISECOND));

        Date result = calendarA.getTime();
        return result;
    }


    public static String getCombineJalaliDateTime(String jalalidate, String time) throws ParseException {

        if (time.length() < 6) {
            time = "0" + time;
        }
        Date transactionFromDate = new SimpleDateFormat("yyyy-MM-dd").parse(new SimpleDateFormat("yyyy-MM-dd").format(DateUtility.convertJalaliToMiladi(jalalidate)));
        Date transactionFromTime = new SimpleDateFormat("HH:mm:ss").parse(time.substring(0, 2) + ":" + time.substring(2, 4) + ":" + time.substring(4, 6));
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(DateUtility.combineDateTime(transactionFromDate, transactionFromTime));

    }

    public static Date convertJalaliToMiladi(String dateString) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//        LocalDate date = LocalDate.parse(dateString, formatter); // 13940631 -> 1394-06-30
        //13951130093949
        int y = Integer.valueOf(dateString.substring(0, 4));
        int m = Integer.valueOf(dateString.substring(4, 6));
        int d = Integer.valueOf(dateString.substring(6, 8));

        int hour = 0;
        int minute = 0;
        int second = 0;

        if (dateString.length() > 8) {
            hour = Integer.valueOf(dateString.substring(8, 10));
            minute = Integer.valueOf(dateString.substring(10, 12));
            second = Integer.valueOf(dateString.substring(12, 14));
        }

        JalaliCalendar.YearMonthDate yearMonthDate = new JalaliCalendar.YearMonthDate(y, m - 1, d);
        JalaliCalendar.YearMonthDate miladiDate = JalaliCalendar.jalaliToGregorian(yearMonthDate);
        DateTime dateTime = new DateTime(miladiDate.getYear(), miladiDate.getMonth() + 1, miladiDate.getDate(), hour, minute, second);
        return dateTime.toDate();
    }

    public static String getFormatedJalaliDate(Date date) {
        LocalDate localDate = DateUtility.convertToLocalDate(date);
        JalaliCalendar.YearMonthDate yearMonthDate = new JalaliCalendar.YearMonthDate(localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        JalaliCalendar.YearMonthDate jalaliDate = JalaliCalendar.gregorianToJalali(yearMonthDate);

        return String.format("%04d%02d%02d", jalaliDate.getYear(), jalaliDate.getMonth() + 1, jalaliDate.getDate());
    }

    /**
     * Get Miladi Date(new Date()) and return Persion Date like this: 1396/12/18
     *
     * @param date
     * @return Persion Date like this: 1396/12/18
     * @author Majid Fazeli Nasab
     */
    public static String getPersionDate(Date date) {
        LocalDate localDate = DateUtility.convertToLocalDate(date);
        JalaliCalendar.YearMonthDate yearMonthDate = new JalaliCalendar.YearMonthDate(localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        JalaliCalendar.YearMonthDate jalaliDate = JalaliCalendar.gregorianToJalali(yearMonthDate);

        String year = String.valueOf(jalaliDate.getYear());
        String month = ("0" + String.valueOf(jalaliDate.getMonth() + 1)).substring((("0" + String.valueOf(jalaliDate.getMonth() + 1)).length() - 2), ("0" + String.valueOf(jalaliDate.getMonth() + 1)).length());
        String day = ("0" + String.valueOf(jalaliDate.getDate())).substring((("0" + String.valueOf(jalaliDate.getDate())).length() - 2), ("0" + String.valueOf(jalaliDate.getDate())).length());
        String persionDate = year + "/" + month + "/" + day;

        return persionDate;
    }

    public static String getPersionDateTime(Date date) {
        DateTime dateTime = DateUtility.convertToDateTime(date);
        JalaliCalendar.YearMonthDate yearMonthDate = new JalaliCalendar.YearMonthDate(dateTime.getYear(), dateTime.getMonthOfYear() - 1, dateTime.getDayOfMonth());
        JalaliCalendar.YearMonthDate jalaliDate = JalaliCalendar.gregorianToJalali(yearMonthDate);

        String year = String.valueOf(jalaliDate.getYear());
        String month = ("0" + String.valueOf(jalaliDate.getMonth() + 1)).substring((("0" + String.valueOf(jalaliDate.getMonth() + 1)).length() - 2), ("0" + String.valueOf(jalaliDate.getMonth() + 1)).length());
        String day = ("0" + String.valueOf(jalaliDate.getDate())).substring((("0" + String.valueOf(jalaliDate.getDate())).length() - 2), ("0" + String.valueOf(jalaliDate.getDate())).length());

        int hour = dateTime.getHourOfDay();
        int minute = dateTime.getMinuteOfHour();
        int second = dateTime.getSecondOfMinute();

        String persionDate = year + "/" + month + "/" + day + " " + hour + ":" + minute + ":" + second;
        return persionDate;
    }

    public static int comparePersianDate(String d1, String d2) {
        Integer date1 = Integer.parseInt(d1.replace("/", ""));
        Integer date2 = Integer.parseInt(d2.replace("/", ""));

        if (date1 < date2) {
            return -1;
        } else if (date1 > date2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String getPersiaonDateFormated(Date date) {
        LocalDate localDate = DateUtility.convertToLocalDate(date);
        JalaliCalendar.YearMonthDate yearMonthDate = new JalaliCalendar.YearMonthDate(localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        JalaliCalendar.YearMonthDate jalaliDate = JalaliCalendar.gregorianToJalali(yearMonthDate);

        int year = jalaliDate.getYear();
        int month = jalaliDate.getMonth() + 1;
        int day = jalaliDate.getDate();
        return String.format("%04d/%02d/%02d", year, month, day);
    }


    public static String getFormatedJalaliDate(String dateString) {
        //sample input: 2017-08-27
        int y = Integer.valueOf(dateString.substring(0, 4));
        int m = Integer.valueOf(dateString.substring(5, 7));
        int d = Integer.valueOf(dateString.substring(8, 10));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, y);
        cal.set(Calendar.MONTH, m - 1); //Months are zero-based in Calendar
        cal.set(Calendar.DAY_OF_MONTH, d);
        LocalDate localDate = DateUtility.convertToLocalDate(cal.getTime());

        JalaliCalendar.YearMonthDate yearMonthDate = new JalaliCalendar.YearMonthDate(localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        JalaliCalendar.YearMonthDate jalaliDate = JalaliCalendar.gregorianToJalali(yearMonthDate);
        return String.format("%04d%02d%02d", jalaliDate.getYear(), jalaliDate.getMonth() + 1, jalaliDate.getDate());
    }

    /**
     * Get time in hh:mm:ss format
     *
     * @return Time like this: 19:12:18
     * @author Majid Fazeli Nasab
     */
    public static String getCurrentTime() {
        DateTime dt = new DateTime();

        int hours = dt.getHourOfDay();
        int minutes = dt.getMinuteOfHour();
        int seconds = dt.getSecondOfMinute();

        return hours + ":" + minutes + ":" + seconds;
    }

    public static String getFormatedTime(Date date, boolean showSeconds) {
        String pattern = "HHmm";

        if (showSeconds) {
            pattern += "ss";
        }

        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        return fmt.print(date.getTime());
    }

    public static String getFormatedTimeWithSeparator(Date date, boolean showSeconds) {
        String pattern = "HH:mm";

        if (showSeconds) {
            pattern += ":ss";
        }

        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        return fmt.print(date.getTime());
    }

    public static Date getOneDayBefore(Date date) {

        return new Date(date.getTime() - (24 * 3600000));
    }

    private Date getPreviousDate(Date date) {
        DateTime dateTime = new DateTime(date.getTime());
        return dateTime.minusDays(1).toDate();
    }

    public static Long getDiffDays(Date date1, Date date2) {
        long diff = Math.abs(date1.getTime() - date2.getTime());
        long diffDays = diff / (24 * 60 * 60 * 1000);
        return diffDays;
    }

    public static Date addMinutesToCurrentDate(int n) {
        Calendar now = Calendar.getInstance();
        now.add(Calendar.MINUTE, n);
        return now.getTime();
    }
}
