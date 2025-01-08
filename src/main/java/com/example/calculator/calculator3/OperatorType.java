package com.example.calculator.calculator3;

import java.util.function.BiFunction;

public enum OperatorType { //enum은 values()를 사용하면, enum에 있는 값들이 다 조회된다.
    PLUS('+'), DIVIDE('/'), MULTIPLY('*'), SUB('-');

    private char value; // 속성(필드)

    OperatorType(char value) { // 생성자: 조립 설명서
        this.value = value;
    }

    public static OperatorType getType(char operator) { // 메서드:

        if (operator == '+') {    // if문을 사용해서 enum에 있는 상수와 Calculator에 있는 문자와 비교해서 맞는지 아닌지 확인해야함.
            return OperatorType.PLUS;
        } else if (operator == '-') {       //for문으로 한번 돌리고, if문으로 한번 체크 돌려야한다. 값을 리턴.
            return OperatorType.SUB;
        } else if (operator == '*') {
            return OperatorType.MULTIPLY;
        } else if (operator == '/') {
            return OperatorType.DIVIDE;
        }
        return null;
//        for (OperatorType type : OperatorType.values()) { // 향상된 for문
//            if(type.value == operator) {
//                return type;
//            }
//        }
//        return null;
    }
    }
//for(int i=0; i<OperatorType.vales(); i++) {


