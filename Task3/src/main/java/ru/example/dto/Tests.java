package ru.example.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Tests {

    private List<Value> tests = new ArrayList<>();

    @Data
    public static class Value {
        private Long id;

        private String title;

        private String value;

        private List<Value> values;
    }

}
