package com.company;

import java.util.Scanner;

public class Calculator {

    public void multiple(int x){
        System.out.println("x*4= " + (x*4));
    }

    public void add(int x, int y){
        System.out.println("x+y= " + (x+y));
    }

    public void minus(int x,int y){
        System.out.println("x-y=" + (x-y));
    }


    public static void main(String[] args){
        Scanner keyboardInput=new Scanner(System.in);
        System.out.println("input1: ");
        int input1 = keyboardInput.nextInt();
        System.out.println("input2: ");
        int input2 = keyboardInput.nextInt();


        Calculator cal=new Calculator();
        cal.add(input1,input2);
        cal.minus(input2,input1);
        cal.multiple(input1,input2);
    }
}


