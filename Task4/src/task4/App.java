package task4;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            new TaskFour().run("src/task4/file1.txt");
        } else {
            new TaskFour().run(args[0]);
        }
    }
}
