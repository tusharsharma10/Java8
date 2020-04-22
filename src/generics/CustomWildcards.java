package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




/*Remember PECS: "Producer Extends, Consumer Super". Produce = get Consume = add

    "Producer Extends" - If you need a List to produce T values (you want to read Ts from the list),
     you need to declare it with ? extends T, e.g. List<? extends Integer>. But you cannot add to this list.

    "Consumer Super" - If you need a List to consume T values (you want to write Ts into the list),
     you need to declare it with ? super T, e.g. List<? super Integer>.

     But there are no guarantees what type of object you may read from this list.

    If you need to both read from and write to a list,
     you need to declare it exactly with no wildcards, e.g. List<Integer>.*/



public class CustomWildcards {

    /**
     * Upper bounded wildcard
     * any List extending Number class is valid others are invalid and only their elements will be added
     * ? = any class
     * any subclass of Number can be a valid type for List here
     */
    static Number sumOfNumberList(List<? extends Number> num) {

        double sum = 0.0;

        for (Number x : num) {

            sum += x.doubleValue();

//                ClassCastException
//                sum += (double)x
        }

        return sum;
    }


    /**
     * Lower bound Wildcard
     * any class that is the super class of Number is a valid List type here
     */

    static void addValues(List<? super Integer> num) {

        System.out.println(num);
    }


    static <X> X doubleValue(X val) {

        return val;
    }

    public static void main(String args[]) {

        List<? extends Number> list1 = new ArrayList<Integer>();
       // only Integer  or its subclass values can be added to the list
        List<? super Integer> list2 = new ArrayList<Number>();

        Number ob = 20;

       


    }

}
