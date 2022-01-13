package OOP;

import org.testng.annotations.Test;

public class PhoneTest {
    @Test
    public void phoneTest(){
        Phone phone=new Phone("+380651234567","iPhone",200);
        phone.reciveCall("Sveta");
        phone.check();

        Phone phone1=new Phone("+38456789456","Sumsung",150);
        phone1.reciveCall("Sveta");
        phone1.check();
        Phone phone2=new Phone();
        phone2.reciveCall("Alex");
        phone2.check();


    }
}
