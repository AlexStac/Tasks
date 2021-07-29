package ru.example;

import com.google.gson.Gson;
import ru.example.dto.Tests;
import ru.example.dto.Values;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskThree {

    private static final Gson gson = new Gson();
    private static Tests tests;
    private static Values values;


    public void run(String testsPath, String valuesPath) throws IOException {
        /*
         * Инициализируем DTO
         * */
        init(valuesPath, testsPath);
        /*
         * Проходимя по всему Json DTO
         * */
        unpackTest(tests.getTests());
        /*
         * Пишем ответ в файл DTO
         * */
        createAnswer();
    }


    private void init(String valuesPath, String testsPath) throws IOException {
        Path value = Paths.get(valuesPath);
        Path test = Paths.get(testsPath);
        String valueString = new String(Files.readAllBytes(value));
        String testString = new String(Files.readAllBytes(test));

        tests = gson.fromJson(testString, Tests.class);
        values = gson.fromJson(valueString, Values.class);
    }

    private void unpackTest(List<Tests.Value> tests) {
        for (Tests.Value value : tests) {
            for (Values.Value otvet : values.getValues()) {
                if (value.getId().equals(otvet.getId())) {
                    value.setValue(otvet.getValue());
                    break;
                }
            }
            if (value.getValues() != null) {
                unpackTest(value.getValues());
            }
        }
    }

    private void createAnswer() throws IOException {
        Path result = Files.createFile(Paths.get("report.json"));
        Files.write(result, gson.toJson(tests).getBytes());
    }
}
