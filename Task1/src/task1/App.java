package task1;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            new TaskOne().run("5", "4");
        } else {
            new TaskOne().run(args[0], args[1]);
        }
    }
}
