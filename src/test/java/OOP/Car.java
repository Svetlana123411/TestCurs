package OOP;

public class Car {
    String marka;
    String color;
    int VBaka;

    public Car(String marka, String color, int VBaka) {
        this.marka = marka;
        this.color = color;
        this.VBaka = VBaka;
    }

    public Car(String marka, String color) {
        this.marka = marka;
        this.color = color;
    }

    public Car() {

    }
    public void showParametrs(){
        System.out.println("marka = "+marka + "______"+ "color = "+color + "_____"+" VBaka"+"-"+ VBaka);
    }
}
