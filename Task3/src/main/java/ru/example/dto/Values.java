package ru.example.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Values {

    private List<Value> values = new ArrayList<>();

    @Data
    public static class Value {
        private Long id;

        private String value;
    }
}
