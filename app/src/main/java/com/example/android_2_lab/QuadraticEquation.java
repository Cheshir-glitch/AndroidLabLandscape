package com.example.android_2_lab;

import java.util.ArrayList;

public class QuadraticEquation {
    String promej;

    protected int a = 0;
    protected int b = 0;
    protected int c = 0;
    protected int D = 0;
    protected int x = 0;
    protected double x1 = 0;
    protected double x2 = 0;


    public String solveEqation(String str) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        for (int index = str.indexOf('=');
             index >= 0;
             index = str.indexOf('=', index + 1))
        {
            first.add(index);
        }
        for (int index = str.indexOf(',');
             index >= 0;
             index = str.indexOf(',', index + 1))
        {
            second.add(index);
        }

         a = Integer.parseInt(str.substring(first.get(0)+1,second.get(0)));
         b = Integer.parseInt(str.substring(first.get(1)+1,second.get(1)));
         c = Integer.parseInt(str.substring(first.get(2)+1));









        D = b * b - 4 * a * c;
        if(D==0){
            x= -b/2*a;
            return "Ответ x = " +  x;
        }else if(D>0){
            x1 = -b - Math.sqrt(D) /2*a;
            x2 = -b + Math.sqrt(D) /2*a;

            return  "Ответ x1 = " +  x1 + " x2 = " + x2;


        }
        else {
            return "Решений нет";
             }


    }
}
