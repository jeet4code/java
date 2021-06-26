package app;

import java.util.List;

class App {
    private static final String HELLO_WORLD = "Hello World";
    private static List<String> list =  List.of("apple", "book", "cat", "dog", "elephant");
    public static void main(String args[]) {
        System.out.println(HELLO_WORLD);
        list.stream().forEach(System.out::println);
    }
}