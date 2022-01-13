package OOP;

import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void personTest(){
        Person person= new Person("Чудесная Света", 24);
        person.personMove();
        person.personTalk();
        Person person1= new Person("Бойчук Альона",28);
        person1.personTalk();
        person1.personMove();
        Person person3=new Person();
        person3.personMove();
        person3.personTalk();
    }
}
