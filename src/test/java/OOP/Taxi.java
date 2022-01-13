package OOP;

public class Taxi {

    int people;
    int trip;
    String carmodel;

    public Taxi(int people, int trip, String carmodel) {
        this.people = people;
        this.trip = trip;
        this.carmodel = carmodel;
    }
    public int calcNumberOfPeopleWeCanTransfer(){
        System.out.println("Тксі"+carmodel+" перевезе"+people*trip+" людей");
        return people*trip;
    }
}
