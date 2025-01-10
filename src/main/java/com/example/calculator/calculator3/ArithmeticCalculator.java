package com.example.calculator.calculator3;

import java.util.Scanner;

public class ArithmeticCalculator<T extends Number> { // i는 넘버타입으로 상속받은 애들로 국한됨
    private T number;
    private Class <T> classtype;
    double result;// T인 클래스

    public ArithmeticCalculator(Class<T> classtype) { //클래스 타입에 대한 정의
        this.classtype = classtype;
    }

    public void set(T number) { //메서드
        this.number = number;
    }

    public T get() {
        return this.number;
    }
        //double로 형 변환해서 쓰는 것

    public T calculator(T num1, T num2, OperatorType operatorType) throws BadInputException { // 사칙연산, 정수1, 정수2를 입력 받아서 부호에 맞게 계산

        switch (operatorType) {
            case PLUS:
                result = num1.doubleValue() + num2.doubleValue();
                break;
            case SUB:
                result = num1.doubleValue() - num2.doubleValue();
                break;
            case DIVIDE:
                result = num1.doubleValue() / num2.doubleValue();
                break;
            case MULTIPLY:
                result = num1.doubleValue() * num2.doubleValue();
                break;
            default:
                throw new BadInputException();
        }
        //convertor(Number result, Class<T> classtype)
        //<T extends Number> T converter(Number result, Class<T> classtype) // 메서드
        return converter(result, classtype);
    }

    public <T extends Number> T converter(Number result, Class<T> classtype){
        System.out.println(classtype);
        if(classtype == Integer.class) {//.class => int 타입이냐.
            return (T)Integer.valueOf(result.intValue()); //따로 클래스나 메서드로 변경.
            //result 값을 받고 => 클래스 타입에 맞추어서 나간다.
        } else if (classtype == Double.class) {
            return (T)Double.valueOf(result.doubleValue());
        } else if (classtype == Float.class) {
            return (T)Float.valueOf(result.floatValue());
        } else if (classtype == Long.class) {
            return (T)Long.valueOf(result.longValue());
        }
        return null;
    }



}

