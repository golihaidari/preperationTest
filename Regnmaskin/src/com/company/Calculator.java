package com.company;

import java.util.Scanner;

public class Calculator {

    public void add(int x, int y,int z){
        System.out.println("x+y+z= " + (x+y+z));
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

    }
}

