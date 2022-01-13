package Primitiv;

import org.testng.annotations.Test;

public class Two {
    @Test
    public void testMah() {
        System.out.println(summary(45, 45));
        System.out.println(multiplication(20,30));
        System.out.println(division(50,25));
        System.out.println(remainder(11,5));
        System.out.println(subtraction(150,148));
    }

    public int summary(int first, int second) {
        return first + second;

    }
    public int multiplication(int first, int second){
        return first * second;
    }
    public int division(int first,int second){
        return first / second;
    }
    public int remainder (int first,int second){
      return  first % second;
    }
    public int subtraction (int first,int second){
        return first - second;
    }
}
