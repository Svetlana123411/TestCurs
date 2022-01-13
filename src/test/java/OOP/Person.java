package OOP;

public class Person {
    String fullName;
    int age;


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }


    public void personMove(){
        System.out.println("Fool name : "+fullName+ " рухається." );
    }

    public void personTalk(){
        System.out.println("Fool name : "+fullName+ " говорить.");
    }
}
