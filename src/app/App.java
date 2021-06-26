package app;

import java.util.ArrayList;
import java.util.List;

class App {
    private static final String HELLO_WORLD = "Hello World";
    private static List<String> list =  List.of("apple", "book", "cat");
    public static void main(String args[]) {
        System.out.println(HELLO_WORLD);

        for (String item : list) {
            System.out.println(item);
        }
    }
}