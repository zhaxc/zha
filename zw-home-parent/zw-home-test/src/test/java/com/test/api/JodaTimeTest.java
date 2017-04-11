package com.test.api;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/11
 * \* Time: 16:34
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class JodaTimeTest {

    @Test
    public void construcor(){
        //创建一个用时间表示的某个随意的时刻
        DateTime dateTime = new DateTime(2015,12,21,0,0,0,333);//// 年,月,日,时,分,秒,毫秒
        //格式化时间输出
        String string = dateTime.toString("yyyy/MM/dd HH:mm:ss EE");
        System.out.println("string = " + string);
    }

    @Test
    public void parse() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        //解析文本格式时间
        DateTime parse = DateTime.parse("2015-12-21 23:22:45", formatter);
        String string1 = parse.toString("yyyy/MM/dd HH:mm:ss");
        System.out.println("string1 = " + string1);
    }

    @Test
    public void plus() {
        //在某个日期上加上90天2小时并输出结果
        DateTime dateTime = new DateTime(2016, 1, 1, 0, 0, 0, 0);
        DateTime dateTime1 = dateTime.plusDays(90).plusHours(2);
        System.out.println(dateTime1.toString("E MM/dd/yyyy HH:mm:ss.SSS"));
    }

    @Test
    public void daysToNewYear() {
        //到新年还有多少天
        LocalDate fromDate = new LocalDate();
        LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
        Days days = Days.daysBetween(fromDate, newYear);
        int days1 = days.getDays();
        System.out.println("days1 = " + days1);

    }

    @Test
    public void convert() {
        DateTime dateTime = new DateTime();
        //转换成java.util.Date对象
        Date date = new Date(dateTime.getMillis());
        Date date1 = dateTime.toDate();
        System.out.println("date1 = " + date1);
        System.out.println("date = " + date);
    }

    @Test
    public void TimeZone() {
        //默认设置为日本时间
        DateTimeZone.setDefault(DateTimeZone.forID("Asia/Tokyo"));
        DateTime dt1 = new DateTime();
        System.out.println(dt1.toString("yyyy-MM-dd HH:mm:ss"));

        //伦敦时间
        DateTime dt2 = new DateTime(DateTimeZone.forID("Europe/London"));
        System.out.println(dt2.toString("yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void cala() {
        DateTime begin = new DateTime("2015-02-01");
        DateTime end = new DateTime("2016-05-01");

        //计算区间毫秒数
        Duration duration = new Duration(begin, end);
        long millis = duration.getMillis();
        System.out.println("millis = " + millis);
        //计算区间天数
        Period period = new Period(begin, end, PeriodType.days());
        int days = period.getDays();
        System.out.println("days = " + days);
        //计算特定日期是否在该区间内
        Interval interval = new Interval(begin, end);
        boolean contains = interval.contains(new DateTime("2015-03-01"));
        System.out.println("contains = " + contains);
    }

    @Test
    public void contract() {
        DateTime d1 = new DateTime("2015-10-01");
        DateTime d2 = new DateTime("2016-02-01");

        //和系统时间比
        boolean b1 = d1.isAfterNow();
        boolean b2 = d1.isBeforeNow();
        boolean b3 = d1.isEqualNow();

        //和其他日期比
        boolean f1 = d1.isAfter(d2);
        boolean f2 = d1.isBefore(d2);
        boolean f3 = d1.isEqual(d2);
    }

    /**
     * Instant 时刻，瞬间
     */
    @Test
    public void Instant(){
        DateTime dt = new DateTime();  // current time
        int month = dt.getMonthOfYear();     // gets the current month
        System.out.println("month = " + month);
        int month1 = dt.monthOfYear().get();  // alternative way to get value
        System.out.println("month1 = " + month1);
        String monthStr = dt.monthOfYear().getAsText();  // gets the month name
        System.out.println("monthStr = " + monthStr);
    }

}