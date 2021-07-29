package task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskFour {
    List<String> file1;
    int sum = 0;
    double avar = 0;
    int more = 0;
    int less = 0;
    int count = 0;

    public void run(String file1) throws IOException {
        init(file1);
        createAnswer();
    }


    private void init(String file1Path) throws IOException {
        Path one = Paths.get(file1Path);
        file1 = Files.readAllLines(one);

    }

    private void createAnswer() {
        for (String line : file1) {
            sum += Integer.parseInt(line);

        }

        avar = sum * 1.0 / file1.size();

        for (String line : file1) {
            if (avar < Double.parseDouble(line)) {
                more++;
            } else {
                less++;
            }
        }
        if (less >= more) {
            avar = Math.floor(avar);
        } else {
            avar = Math.ceil(avar);
        }

        for (String line : file1) {
            count += (int) Math.abs(avar - Double.parseDouble(line));
        }
        System.out.println(count);
    }
}

