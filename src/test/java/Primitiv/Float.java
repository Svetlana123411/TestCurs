package Primitiv;

import org.testng.annotations.Test;

public class Float {
    @Test
    public void testFloat(){
        System.out.println(summary(1.0f, 0.9456225f));
        System.out.println(multiplication(-0.9854568f,2.487456f));
        System.out.println(division(5.654f,4.9632f));
        System.out.println(subtraction(-3.0256f,-2.35f));
    }
    public float summary(float first,float second) {
        return  (first + second);
    }
    public float multiplication( float first, float second){
        return  (first * second);
    }
    public float division(float first,float second){
        return (first / second);
    }
    public float subtraction (float first,float second){
        return  (first - second);
    }
}
