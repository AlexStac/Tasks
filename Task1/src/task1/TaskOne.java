package task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    int n = 0;
    int m = 0;
    int[] mass = new int[n];
    List<Integer> dinMass = new ArrayList<>();
    int start = 1;
    int stop = 0;

    public void run(String arg1, String arg2) throws IOException {
        init(arg1, arg2);
        createAnswer();
    }


    private void init(String arg1, String arg2) throws IOException {
        n = Integer.parseInt(arg1);
        m = Integer.parseInt(arg2);

        for (int i = 0; i < (n * m); i++) {
            for (int j = 0; j < n; j++) {
                dinMass.add(j + 1);
            }
        }

    }

    private void createAnswer() {
        int i = 0;
        System.out.print(start);

        for (i = m-1; i < dinMass.size(); i = i + m-1){
            if (start != dinMass.get(i)){
                System.out.print(dinMass.get(i));
            }
            else { break ;}
        }
    }
}