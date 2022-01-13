package Primitiv;

import org.testng.annotations.Test;

public class Double {
    @Test
    public void testDouble(){
        System.out.println(summary(-3.0256,2.5689425));
        System.out.println(multiplication(-0.9854568,2.487456));
        System.out.println(division(5.654,4.9632));
        System.out.println(subtraction(-3.0256,-2.35));
    }
    public double summary(double first,double second) {
        return  (first + second);
    }
    public double multiplication( double first, double second){
        return  (first * second);
    }
    public double division(double first,double second){
        return (first / second);
    }
    public double subtraction (double first,double second){
        return  (first - second);
    }
}
