package com.example.calculator;

import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int num1, num2;
        char operator = 0;
        int result=0;
        String result2;

        while(true) {
            System.out.print("첫번째 정수를 입력하시오: ");
            num1 = sc.nextInt();
            System.out.print("두번째 정수를 입력하시오: ");
            num2 = sc.nextInt();
            while (true) {
                System.out.print("사칙연산자를 입력하시오: ");
                operator = sc.next().charAt(0);
                if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                    System.out.println("사칙연산을 잘못 입력하셨습니다.");
                    continue;
                }
                if (operator == '+') {
                    result = num1 + num2;
                } else if (operator == '-') {
                    result = num1 - num2;
                } else if (operator == '*') {
                    result = num1 * num2;
                } else {
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모가 0이 될 수 없습니다.");
                        break;//
                    } else {
                        result = num1 / num2;
                    }
                }
                System.out.println("계산 결과: " + result);
                break;
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료):");
            result2 = sc2.nextLine();
            if (result2.equals("exit")) {
                break;
            }
        }


    }
}
