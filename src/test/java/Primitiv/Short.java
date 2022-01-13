package Primitiv;

import org.testng.annotations.Test;

public class Short {
    @Test
    public void testLong(){
        System.out.println(summary((short)-30256,(short)25635));
        System.out.println(multiplication((short)10256,(short)487456));
        System.out.println(division((short)-5654,(short)9632));
        System.out.println(remainder((short)15236,(short)700));
        System.out.println(subtraction((short)-30256,(short)-235));
    }
    public long summary(short first,short second) {
        return  (first + second);
    }
    public long multiplication( short first, short second){
        return  (first * second);
    }
    public long division(short first,short second){
        return (first / second);
    }
    public long remainder (short first,short second){
        return  (first % second);
    }
    public long subtraction (short first,short second){
        return  (first - second);
    }
}
