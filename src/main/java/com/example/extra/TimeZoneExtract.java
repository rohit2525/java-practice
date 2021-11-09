package com.example.extra;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;

import static java.util.Calendar.getInstance;

public class TimeZoneExtract {

    public static void main(String[] args) {
        System.out.println( "OffSet: " + getTimeInUTc("EST") );

        System.out.println("OffSet: "+ getOffSetHours2("EDT"));
    }

   static String getTimeInUTc(String Id)
    {
        TimeZone tz = TimeZone.getTimeZone(Id);
        Calendar cal = getInstance(tz);
        int offsetInMillis = tz.getOffset(cal.getTimeInMillis());

        String offset = String.format("%02d:%02d", Math.abs(offsetInMillis / 3600000), Math.abs((offsetInMillis / 60000) % 60));
        offset = "GMT"+(offsetInMillis >= 0 ? "+" : "-") + offset;

        return offset;
    }

    static String getOffSetHours2(String Id){
        TimeZone timeZone = TimeZone.getDefault();
      ///  String timeZoneInGMTFormat = timeZone.getDisplayName(false,TimeZone.getTimeZone(Id));
        int mil=TimeZone.getTimeZone(Id).getRawOffset();
        ZonedDateTime utc = Instant.ofEpochMilli(mil).atZone(ZoneOffset.UTC);
        System.out.println(utc);
        return null;

    }
}
