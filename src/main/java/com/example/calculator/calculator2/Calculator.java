package com.example.calculator.calculator2;

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Calculator {
    App a = new App();
    Plus p = new Plus();
    Sub s = new Sub();
    Devide d = new Devide();
    Multiply m = new Multiply();

    private int result;
    private int i=0;
    //int [] arr = new int[10];
    private Queue<Integer> integerQueue = new LinkedList<Integer>();

    public void addResult(int result){ //배열을 넣는 작업(수정) //이름 변경
            //this.arr[i] = result;
           //return arr[i++];
            integerQueue.add(result);
    }
    public Queue<Integer> getResultLog(){ //배열에 넣어진 결과값을 넣는 작업(조회)
        //return Arrays.copyOfRange(this.arr,0, i);
        //while(!integerQueue.isEmpty()){
            //System.out.println(integerQueue.poll());
        //}
        //integerQueue.add(result);
        return integerQueue;
    }

    public void removeResult() {
        integerQueue.remove();
    }

    public void all_removeResult() {
        while(!integerQueue.isEmpty()) {
            integerQueue.clear();
        }
    }


}



