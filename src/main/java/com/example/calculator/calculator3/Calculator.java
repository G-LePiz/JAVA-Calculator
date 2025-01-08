package com.example.calculator.calculator3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    ArithmeticCalculator a = new ArithmeticCalculator(Long.class);
    private double result;

    List<Long> calculator = new ArrayList<>();

    public List<Long> getResult() {
        return calculator;
    }

    public void AddResult(long result) {
        calculator.add(result);
    }

    public void RemoveResult() {
        calculator.remove(0);
    }

    public void AllremoveResult() {
        calculator.clear();
    }

    public List<Long> SearchNumber(long t) { //필터를 사용하고 난 다음에,
        return  calculator.stream()
                .filter(value -> value > t).collect(Collectors.toList()); //필터링을 하고 나면, 원래 있었던 리스트가 아니다.
                // .collect(Collectors.toList()); 는 거의 필수
    }
}
