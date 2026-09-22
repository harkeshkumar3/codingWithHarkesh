package org.example.bms.nab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;

public class localdate {
    public static void main(String[] args) throws ParseException {
        String sDate1="31/12/1998";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        OffsetDateTime localDate = toLocalDate(date1);
        System.out.println(localDate);
        System.out.println(LocalDate.now());
    }
   static OffsetDateTime toLocalDate(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime();
    }
}
