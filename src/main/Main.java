package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Box.method() );
    }
}
class Box<T> {
    T returns;

    public static <T> Box method() {
       Box<String> box = new Box();
       box.returns = "I am Generic class and method!";

       return box;
   }

    @Override
    public String toString() {
        return  "Box: " +
                "Returns = " + returns;
    }
}