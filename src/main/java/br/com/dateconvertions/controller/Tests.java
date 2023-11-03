package br.com.dateconvertions.controller;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Tests {

    public static void main(String[] args) {
        Date dateUtil = new Date();
        System.out.println(dateUtil);

        System.out.println(Instant.ofEpochMilli(dateUtil.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalTime());
    }
}
