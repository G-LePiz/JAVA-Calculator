package com.example.calculator;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int num1, num2;
        char operator = 0;
        int result=0;
        String result2 = "";

        while(true) { // true이면
            System.out.println("첫번째 정수를 입력하시오: "); // 첫번째 정수 입력
            num1 = sc.nextInt(); // 첫번째 정수를 입력받음
            System.out.println("두번째 정수를 입력하시오: "); // 두번째 정수 입력
            num2 = sc.nextInt(); // 두번째 정수를 입력받음
            while (true) { // true이면 계속 반복
                System.out.println("사칙연산을 입력하시오: "); // 사칙연산을 입력하라는 문구가 나옴
                operator = sc.next().charAt(0); // 사칙연산 입력
                if(operator != '+' && operator != '-' && operator != '*' && operator != '/') { // 만약 사칙연산이 아닐 시
                    System.out.println("사칙연산 수식이 잘못되었습니다. 다시 되돌아갑니다."); // 잘못했다고 문구가 나옴
                    continue; // 다시 사칙연산을 입력하라는 곳으로 이동
                }
                if(operator == '+') { // 만약 사칙연산이 +이면
                    result = num1 + num2; // result는 num1 num2를 더한다
                } else if(operator == '-') { // 만약 사칙연산이 -이면
                    result = num1 - num2; // result는 num1 num2를 뺀다
                } else if(operator == '*') { // 만약 사칙연산이 *이면
                    result = num1 * num2; // result는 num1 num2를 곱한다.
                } else { // 사칙연산이 /이면
                    if(num2 == 0) { // num2가 0이라면
                        System.out.println("나눗셈에서 분모가 0이 될 수 없습니다."); // 출력이 이렇게 나옴
                    } else {
                        result = num1 / num2; // 0이 아니면 result는 num1 num2를 나눈다.
                    }
                }
                System.out.println("결과값 : " + result); // 총 연산을 해서 계산값 나옴
                break; // stop
            }
            System.out.print("더 계산하시겠습니까? (exit 입력시 종료)"); // 계산을 더 할까라는 문구가 나옴
            result2 = sc2.nextLine(); // result2라는 입력을 받기위한 준비
            if(result2.equals("exit")) { // 만약 result2가 exit라는 단어를 받으면
                break; // stop
            }
        }
    }
}
