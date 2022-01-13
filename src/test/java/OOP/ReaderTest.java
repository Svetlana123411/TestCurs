package OOP;

import org.testng.annotations.Test;

public class ReaderTest {
    @Test
    public void readTest(){
        Reader reader= new Reader("Прутас Світлана Сергіївна");
        reader.takeBooks(2,3);
        Reader reader1= new Reader("Бойчук Альона Валеріївна");
        reader1.reternBooks(12,10);


    }
}
