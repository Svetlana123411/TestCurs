package OOP;

public class Phone {
    String number;
    String model;
    int weight;
    String name;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }


    public void reciveCall(String name) {
        if (number == null) {
            System.out.println("Телефонує невідомий номер" + name);
        } else {
            System.out.println("Телефонує" + name + number);

        }
    }
    public String getNumber(){
        if (number == null) {
            System.out.println(" ");
        }
        return number;
    }
    public void check(){
        if( getNumber().contains("+380")){
            System.out.println("Ukrain");
        }else{
            System.out.println("Unknown");
        }
    }
}