package task2;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            new TaskTwo().run("src/task2/file1.txt", "src/task2/file2.txt");
        } else {
            new TaskTwo().run(args[0], args[1]);
        }
    }
}
