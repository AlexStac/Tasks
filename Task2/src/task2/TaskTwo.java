package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskTwo {
    float x0 = 0;
    float y0 = 0;
    float r = 0;
    float x1 = 0;
    float y1 = 0;
    List<String> file1;
    List<String> file2;

    public void run(String file1, String file2) throws IOException {
        init(file1, file2);
        createAnswer();
    }


    private void init(String file1Path, String file2Path) throws IOException {
        Path one = Paths.get(file1Path);
        Path two = Paths.get(file2Path);
        file1 = Files.readAllLines(one);
        file2 = Files.readAllLines(two);
        x0 = Float.parseFloat(file1.get(0).split(" ")[0]);
        y0 = Float.parseFloat(file1.get(0).split(" ")[1]);
        r = Float.parseFloat(file1.get(1).split(" ")[0]);
    }

    private void createAnswer() {
        for(String line: file2){
            x1 = Float.parseFloat(line.split(" ")[0]);
            y1 = Float.parseFloat(line.split(" ")[1]);

            if((Math.pow((x1-x0),2)
                    + Math.pow((y1-y0),2)) < Math.pow(r,2)){
                System.out.println(1);
            }
            else if ((Math.pow((x1-x0),2)
                    + Math.pow((y1-y0),2)) == Math.pow(r,2)){
                System.out.println(0);
            }
            else if ((Math.pow((x1-x0),2)
                    + Math.pow((y1-y0),2)) > Math.pow(r,2)) {
                System.out.println(2);
            }
        }
    }
}

