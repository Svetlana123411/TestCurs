package Primitiv;

import org.testng.annotations.Test;

public class Long {
    @Test
    public void testLong(){
        System.out.println(summary(35235689,25364875));
        System.out.println(multiplication(10,4));
        System.out.println(division( 50,25));
        System.out.println(remainder(11,5));
        System.out.println(subtraction(150,148));
    }
    public long summary(long first, long second) {
        return  (first + second);
    }
    public long multiplication( long first, long second){
        return  (first * second);
    }
    public long division(long first,long second){
        return (first / second);
    }
    public long remainder (long first,long second){
        return  (first % second);
    }
    public long subtraction (long first,long second){
        return  (first - second);
    }
}
