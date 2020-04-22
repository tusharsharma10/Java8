package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

    public static void nameAndActivities(){

        // name and activities list of one student
        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        Consumer<String> stringConsumer = (name) -> System.out.println("name is  :" + name);

        List<Student> students = StudentDataBase.getAllStudents();

        // studentBiConsumer.accept(s.getName(),s.getActivities())); operation is being performend multiple times for all students
        students.forEach((s) -> studentBiConsumer.accept(s.getName(),s.getActivities()));
    }

    public static void main(String[] args) {

    // accept method definition for biConsumer
        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println(" a : "  +  a + " b : " + b );
        };
        biConsumer.accept("java7" , "java8");


        // accept method definition for multiply
        BiConsumer<Integer, Integer> multiply = (a,b) -> {
            System.out.println("Multiplication : " + (a * b));
        };

        // accept method definition for addition
        BiConsumer<Integer, Integer> addition = (a,b) -> {
            System.out.println("Addition : " + (a + b));
        };

        // accept method definition for division
        BiConsumer<Integer, Integer> division = (a,b) -> {
            System.out.println("Division : "  + (a / b));
        };


        //multiply.andThen(multiply).andThen(multiply).accept(10,5);



        nameAndActivities();

    }
}
