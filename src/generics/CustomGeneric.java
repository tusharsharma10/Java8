package generics;

// Simple Generic Class
class CustomListSimple<T>{

    int size = 0;
    Object arr[] = new Object[10];

    public CustomListSimple(){

    }

    void add(T ob){

        arr[size] = ob;
        size++;
    }

    T get(int index){

        return (T) arr[index];

    }

}

// Advanced  Generic Class
class CustomListAdvanced<T extends Number>{

    int size = 0;
    Object arr[] = new Object[10];

    public CustomListAdvanced(){

    }

    void add(T ob){

        arr[size] = ob;
        size++;
    }

    T get(int index){

        return (T) arr[index];

    }

}


public class CustomGeneric {

    // Simple Generic Method
    static   <T> T simpleGenericMethod(T val){

        return val;
    }


    // advanced generic method
    static <T extends Number> T advancedGenericMethod(T val){

        return val;
    }

    public static void main(String args[]){

        CustomListSimple<String> list = new CustomListSimple<String>();
        list.add("Ronaldo");
        list.add("Messi");
        System.out.println(list.get(1));

        CustomListSimple<Integer> list2  = new CustomListSimple<>();
        list2.add(1);
        list2.add(31);

        System.out.println(list2.get(0));


    }


}
