package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    static BiPredicate<Integer,Double> biPredicate1 = (gradeLevel, gpa) ->  gradeLevel >= 2 &&  gpa <= 3.7 ;
    static BiPredicate<Integer,Double> biPredicate2 = (gradeLevel, gpa) ->  gradeLevel >= 2 &&  gpa >= 2.9 ;

    static Consumer<Student> consumer = (student) -> {

            if(biPredicate1.and(biPredicate2).test(student.getGradeLevel(),student.getGpa())){
                System.out.println(student);
            }
    };

    public static  void filterStudents(){

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(consumer);
    }

    public static void main(String[] args) {


        filterStudents();
    }

}
