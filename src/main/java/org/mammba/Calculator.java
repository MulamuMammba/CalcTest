package org.mammba;

public class Calculator {

    public int add(double... numbers){
        double sum = 0;
        for(double number : numbers){
            sum+=number;
        }
        return (int) sum;
    }
    public int multiply(double... numbers){
        double sum = 0;
        for(double number : numbers){
            sum*=number;
        }
        return (int) sum;
    }
}
