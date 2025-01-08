package com.example.calculator.calculator2;

public class Plus extends AbstractOperation {
    private int result;

    @Override
    public int Operator(int num1, int num2) { //더하기 기능
        result = num1 + num2;
        return result;
    }

}
