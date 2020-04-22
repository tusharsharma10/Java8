package docs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


interface Animal{

     void eat();
}


class Dog {

     public  static  void bark(){
        System.out.println("Bow Bow");
    }
}

public class Learn {




    static void play(String str, Animal l){
        l.eat();
    }

    public static void main ( String args[] ) {

        //doberman();

//            List<String> names = Arrays.asList("rooney","o'shea","giggs","scholes","park");
//
//            names.forEach(s-> System.out.println(s));

        // bark method of Dog class is being called inside the eat method of Animal i.e. the implementation of eat method.


        play("rooney", Dog::bark);

    }









    static void doberman() {
        Predicate<Integer> p = (num) -> num > 20 ;

        System.out.println(p.test(30));

        Function<Integer,Integer> add = (num) -> num + 50;
        Function<Integer,Integer> multiply = (num) -> num * 50;


        // 1. andThen method 1. first add and then multiply i.e. 100+50=150 andThen 150 * 50 = 7500

        System.out.println( "andThen"+   add.andThen(multiply).apply(100)                           );

        // first multipy and then add i.e. 50*100=5000 then 5000+50 = 5050

        System.out.println( "Compose" +  add.compose(multiply).apply(100)       );

    }


}
