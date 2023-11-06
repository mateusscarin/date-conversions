package br.com.dateconvertions.controller;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Tests {

    public static void main(String[] args) {
        Date dateUtil = new Date();
        LocalDate localDateUtil = LocalDate.now();
        LocalDateTime localDateTimeUtil = LocalDateTime.now();

        // Date
        System.out.println("---------------------- Date -----------------------");
        System.out.println(converterParaDateViaLocalDate(localDateUtil));
        System.out.println(converterParaDateViaLocalDate2(localDateUtil));

        System.out.println(converterParaDateViaLocalDateTime(localDateTimeUtil));
        System.out.println(converterParaDateViaLocalDateTime2(localDateTimeUtil));

        // LocalDate
        System.out.println("-------------------- LocalDate --------------------");
        System.out.println(converterParaLocalDateViaDate(dateUtil));
        System.out.println(converterParaLocalDateViaDate2(dateUtil));

        // LocalTime
        System.out.println("-------------------- LocalTime --------------------");
        System.out.println(converterParaLocalTimeViaDate(dateUtil));
        System.out.println(converterParaLocalTimeViaDate2(dateUtil));

        // LocalDateTime
        System.out.println("------------------ LocalDateTime ------------------");
        System.out.println(converterParaLocalDateTimeViaDate(dateUtil));
        System.out.println(converterParaLocalDateTimeViaDate2(dateUtil));
    }

    public static Date converterParaDateViaLocalDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }

    public static Date converterParaDateViaLocalDate2(LocalDate localDate) {
        return java.util.Date.from(localDate.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }

    public static Date converterParaDateViaLocalDateTime(LocalDateTime localDateTime) {
        return java.sql.Timestamp.valueOf(localDateTime);
    }

    public static Date converterParaDateViaLocalDateTime2(LocalDateTime localDateTime) {
        return java.util.Date
                .from(localDateTime.atZone(ZoneId.systemDefault())
                        .toInstant());
    }

    public static LocalDate converterParaLocalDateViaDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static LocalDate converterParaLocalDateViaDate2(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static LocalTime converterParaLocalTimeViaDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalTime();
    }

    public static LocalTime converterParaLocalTimeViaDate2(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalTime();
    }

    public static LocalDateTime converterParaLocalDateTimeViaDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public static LocalDateTime converterParaLocalDateTimeViaDate2(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
