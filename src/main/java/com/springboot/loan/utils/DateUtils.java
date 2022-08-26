package com.springboot.loan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static Date dateFormat(String dateString){
        try{
            return new SimpleDateFormat().parse(dateString);
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return Calendar.getInstance().getTime();
    }
    public static String toString(Date date){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }
}
