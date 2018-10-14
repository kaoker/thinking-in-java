package com.lihuan;

/**
 * @author li.huan
 * @create 2018-10-14
 */
public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("1: n1.i: " + n1.i + " ,n2.i " + n2.i);
        n1 = n2;
        System.out.println("1: n1.i: " + n1.i + " ,n2.i " + n2.i);
        n1.i =27;
        System.out.println("1: n1.i: " + n1.i + " ,n2.i " + n2.i);
    }
}

class Number {
    int i;
}