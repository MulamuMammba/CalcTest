package org.mammba;

public class Calculator {

    public int add(double... numbers){
        double ans = 0;
        for(double number : numbers){
            ans+=number;
        }
        return (int) ans;
    }
    public int multiply(double... numbers){
        double ans = 1;
        for(double number : numbers){
            ans*=number;
        }
        return (int) ans;
    }
    
    public int subtract(double... numbers){

        double ans = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            ans-=numbers[i];
        }
        return (int) ans;
    }

    public double divide(double... numbers) {
        double ans = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                return Double.NaN; // Avoid division by zero
            }
            ans /= numbers[i];
        }
        return ans;
    }

}
