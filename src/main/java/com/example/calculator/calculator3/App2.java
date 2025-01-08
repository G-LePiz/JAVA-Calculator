package com.example.calculator.calculator3;

import java.util.Scanner;

public class App2  {

    public static void main (String[] args) throws BadInputException { //예외처리를 받아야함.
        // 필드는 무조건 private로 선언해야한다.
        Scanner sc = new Scanner(System.in); // 입력받음
        Scanner sc2 = new Scanner(System.in); // 먼저 수식 받은거 삭제할거냐고 물어봄
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        Calculator c = new Calculator();

    while (true) {
            System.out.println("첫번째 정수를 입력하세요");
            String putNum1 = sc.nextLine();
            System.out.println("두번째 정수를 입력하세요");
            String putNum2 = sc.nextLine();
            while (true) {
                System.out.println("사칙연산을 입력하세요."); // 사칙연산을 입력함
                char operator = sc.next().charAt(0);
                OperatorType type = OperatorType.getType(operator);
                ArithmeticCalculator a = new ArithmeticCalculator(Long.class);

                double num1 = Double.parseDouble(putNum1);
                double num2 = Double.parseDouble(putNum2);
                long result = (long) a.calculator(num1, num2, type);
                c.AddResult(result);
                System.out.println("계산 결과는" + result + "입니다");
                break;
                }
                System.out.println("=========================================");
                System.out.println("먼저 계산한 수식을 삭제하시겠습니까? Y/N");
                char remove = sc2.next().charAt(0); //Y/N 입력
                if(remove == 'Y') {
                    c.RemoveResult();
                } else{
                    System.out.println("삭제하지않겠습니다.");
                }
                System.out.println("==========================================");
                System.out.println("전체 결과값을 삭제하시겠습니까? Y/N");
                char allremove = sc3.next().charAt(0);
                if(allremove == 'Y') {
                    c.AllremoveResult();
                } else{
                    System.out.println("삭제하지 않겠습니다.");
                }
                System.out.println("==========================================");
                System.out.println("숫자를 입력하여 입력값보다 큰 숫자를 출력합니다.");
                long printnumber = sc4.nextLong();
                System.out.println("입력하신 숫자보다 큰 결과값은 " + c.SearchNumber(printnumber));
                System.out.println("===========================================");
                System.out.println("종료 하시겠습니까? (종료:exit)");
                String exit = sc5.nextLine();
                if(exit == "exit") break;
            }
            c.getResult();
         //result 값
        }
    }

//        if(isInteger(putNum1)&&isInteger(putNum2)) {
//            int num1 = Integer.parseInt(putNum1);
//            int num2 = Integer.parseInt(putNum2);
//            int result = (int)a.calculator(num1, num2, type);
//        } else {
//            double num1 = Integer.parseInt(putNum1);
//            double num2 = Integer.parseInt(putNum2);
//            double result = (int)a.calculator(num1, num2, type);
//        }
//        //앞단에서 int/double
//    }
//    public static boolean isInteger(String str) { //integer인지 double인지 판별하는 것
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }
// }
