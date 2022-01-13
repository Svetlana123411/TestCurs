package OOP;

import org.testng.annotations.Test;

public class TestCar {

    @Test
    public void test(){
        Car car =new Car("BMV","black", 2);
        car.showParametrs();
        Car car1 =new Car("Volvo","blu");
        car1.showParametrs();
        Car car2 =new Car();
        car2.showParametrs();

    }


}
