package ru.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            new TaskThree().run("C:\\Users\\Alexandr\\Desktop\\dev\\Task3\\tests.json", "C:\\Users\\Alexandr\\Desktop\\dev\\Task3\\values.json");
        } else {
            new TaskThree().run(args[0], args[1]);
        }
    }
}
