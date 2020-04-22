package com.learnJava.functionalInterfaces;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (i) -> {return  i%2 ==0;};

    static Predicate<Integer> p1 = (i) -> i%2 ==0;

    static Predicate<Integer> p2 = (i) -> i%5 ==0;


    public static void predicateAnd(){

        System.out.println("Result in predicateAnd : " + p1.and(p2).test(10));
    }

    public static void predicateOr(){

        System.out.println("Result in predicateOr : " + p1.and(p2).test(4));
    }

    public static void predicateNegate(){

        System.out.println("Result in predicateNegate : " + p1.and(p2).negate().test(4)); //equivalent to reversing the result
    }


    public static void main(String[] args) {

//        System.out.println("Result is p : " + p.test(2));
//
//        System.out.println("Result is p1 : " + p1.test(3));
//
//        predicateAnd();
//
//        predicateOr();
//
//        predicateNegate();

//        Predicate<Integer> p1 = (i) -> {
//            return i%2 == 0;
//        };
//
//        Predicate<Integer> p2 = (i) -> {
//            return i%5 == 0;
//        };
//
//        System.out.println(p1.negate().test(85));
//        ZonedDateTime z = ZonedDateTime.now();
//        ZoneId zoneId=ZoneId.of("Asia/Singapore");
//        ZonedDateTime.of(LocalDateTime.now(),zoneId);
//        System.out.println(z.getOffset());

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);
    }


}
