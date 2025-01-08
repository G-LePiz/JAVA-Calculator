package com.example.calculator.calculator2;

import java.sql.SQLOutput;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public Object get;

    public static void main(String[] args) {
        Calculator c = new Calculator(); //결과 기능 호출
        Plus p = new Plus(); //플러스 기능 호출
        Multiply m = new Multiply(); // 곱하기 기능 호출
        Sub s = new Sub(); // 빼기 기능 호출
        Devide d = new Devide();


        Scanner sc = new Scanner(System.in); // 정수를 입력 받을 값
        Scanner sc2 = new Scanner(System.in); // 처음에서 결과값 받을거야?
        Scanner sc3 = new Scanner(System.in); // 저장한 결과값을 다 지울까?
        Scanner sc4 = new Scanner(System.in); // 그만할래?

        int result = 0;
        while(true) { // true이면
            System.out.println("첫번째 정수를 입력하시오: "); // 첫번째 정수 입력
            int num1 = sc.nextInt(); // 첫번째 정수를 입력받음
            System.out.println("===================================================");
            System.out.println("두번째 정수를 입력하시오: "); // 두번째 정수 입력
            int num2 = sc.nextInt(); // 두번째 정수를 입력받음
            System.out.println("===================================================");
            while (true) { // true이면 계속 반복
                System.out.println("사칙연산을 입력하시오: "); // 사칙연산을 입력하라는 문구가 나옴
                char operator = sc.next().charAt(0); // 사칙연산 입력
                if(operator != '+' && operator != '-' && operator != '*' && operator != '/') { // 만약 사칙연산이 아닐 시
                    System.out.println("사칙연산 수식이 잘못되었습니다. 다시 되돌아갑니다."); // 잘못했다고 문구가 나옴
                    continue; // 다시 사칙연산을 입력하라는 곳으로 이동
                }
                if(operator == '+') { // 만약 사칙연산이 +이면
                    result = p.Operator(num1, num2); // result는 num1 num2를 더한다
                } else if(operator == '-') { // 만약 사칙연산이 -이면
                    result = s.Operator(num1, num2); // result는 num1 num2를 뺀다
                } else if(operator == '*') { // 만약 사칙연산이 *이면
                    result = m.Operator(num1, num2); // result는 num1 num2를 곱한다.
                } else { // 사칙연산이 /이면
                    if(num2 == 0) { // num2가 0이라면
                        System.out.println("나눗셈에서 분모가 0이 될 수 없습니다."); // 출력이 이렇게 나옴
                    } else {
                        result = d.Operator(num1, num2); // 0이 아니면 result는 num1 num2를 나눈다.
                    }
                }
                c.addResult(result);
                System.out.println("결과값 : " + result); // 총 연산을 해서 계산값 나옴
                break; // stop
            }
            System.out.println("===================================================");
            System.out.println("처음에 저장한 결과값을 삭제?(네/아니요)");
            String result2 = sc2.nextLine();
            if (result2.equals("네")) { // 네를 입력하면 queue 앞부분이 삭제됨.
                System.out.println("삭제되었습니다!"); //삭제되었습니다. 문구가 나옴
                c.removeResult(); //데이터를 삭제함.
            } else {
                System.out.println("데이터를 삭제하지않겠습니다."); // 데이터를 삭제하지않겠다고 말함.
            }
            System.out.println("===================================================");
            System.out.println("전체에 저장된 결과값을 삭제?(네/아니요)");
            String result3 = sc3.nextLine();
            if (result3.equals("네")) { // 전체 데이터를 삭제할 의향이 있다면?
                System.out.println("모든 데이터를 삭제했습니다."); //삭제문 출력
                c.all_removeResult();
            } else {
                System.out.println("네, 삭제하지않겠습니다."); //삭제하지않겠다는 문구 출력
            }
            System.out.println("===================================================");
            System.out.print("계산을 더 하시겠습니까? (exit 입력시 종료)"); // 계산을 더 할까라는 문구가 나옴
            String result4 = sc4.nextLine(); // result2라는 입력을 받기위한 준비
            if(result4.equals("exit")) { // 만약 result2가 exit라는 단어를 받으면
                break; // stop
            }
        }
        System.out.println(c.getResultLog());

    }
}
