package Primitiv;

import com.sun.jdi.ByteType;
import com.sun.jdi.ByteValue;
import org.testng.annotations.Test;

public class Byte {
    @Test
    public void testMah() {
        System.out.println(summary((byte)35,(byte)45));
        System.out.println(multiplication((byte)10,(byte)4));
        System.out.println(division((byte) 50,(byte)25));
        System.out.println(remainder((byte)11,(byte)5));
        System.out.println(subtraction((byte)150,(byte)148));
    }
    public int summary(byte first, byte second) {
        return first + second;
    }
    public int multiplication(byte first, byte second){
        return first * second;
    }
    public int division(byte first,byte second){
        return first / second;
    }
    public int remainder (byte first,byte second){
        return  first % second;
    }
    public int subtraction (byte first,byte second){
        return first - second;
    }
}
