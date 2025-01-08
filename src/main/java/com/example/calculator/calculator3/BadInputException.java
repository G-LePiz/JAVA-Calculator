package com.example.calculator.calculator3;

public class BadInputException extends Exception {
    public BadInputException() {
        super("잘못된 사칙연산입니다");
    }
}
