package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 양의 정수를 입력하세요: "); // 첫번째 양의 정수 입력
        int num1 = sc.nextInt();
        System.out.println("두번째 양의 정수를 입력하세요: "); // 두번째 양의 정수 입력
        int num2 = sc.nextInt();
        System.out.println("원하시는 사칙연산을 입력하세요(+,-,*,/)"); // char를 사용하여 사칙연산을 입력
        char operator = sc.next().charAt(0); //sc.next()는 char를 받을 수 없음. chatAt()을 사용해서 한 문자만 받도록 해야함.

        switch (operator){
            case '+': // + 일때의 조건
                System.out.println("계산 결과: " + (num1 + num2));
                break;

            case '-': // - 일때의 조건
                System.out.println("계산 결과: " + (num1 - num2));
                break;

            case '*': // * 일때의 조건
                System.out.println("계산 결과: " + (num1 * num2));
                break;

            case '/': // / 일때의 조건
                if(num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                } else {
                    System.out.println("계산 결과: " + (num1 / num2));
                }
                break;

            default: // 그 외의 조건
                System.out.println("사칙연산을 잘못 입력했습니다.");

        }

    }
}
