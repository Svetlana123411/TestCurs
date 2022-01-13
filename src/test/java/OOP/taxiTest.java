package OOP;

import org.testng.annotations.Test;

public class taxiTest {
    @Test
    public void taxiTest(){
        int vsichLudey=150;

        Taxi lider =new Taxi(4,1,"Lanos");
        if(vsichLudey > 0){
            vsichLudey=vsichLudey- lider.calcNumberOfPeopleWeCanTransfer();
        }
        Taxi sveta = new Taxi(8,1,"Subaru");
        if(vsichLudey>0){
            vsichLudey=vsichLudey-sveta.calcNumberOfPeopleWeCanTransfer();
        }
        Taxi lyux=new Taxi(14,1,"BMV");
        if(vsichLudey>0){
            vsichLudey=vsichLudey-lyux.calcNumberOfPeopleWeCanTransfer();
        }
    }
}
