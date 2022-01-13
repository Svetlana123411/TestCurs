package OOP;

import org.testng.annotations.Test;

public class OOP {
    @Test
    public  void test(){
        int i;
        Home home= new Home(12,"Home");

        System.out.println(home.plosha);
//        Home home2= new Home();
//        home2.plosha =145;
//        System.out.println(home2.plosha);

        home.show();

        Home home2 =new Home(12,"Weret");
        home2.plosha =100;
        home2.name = "Weret";
        home2.show();
    }
}
