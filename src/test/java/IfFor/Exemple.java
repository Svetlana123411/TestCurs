package IfFor;

import org.testng.annotations.Test;

public class Exemple {
    @Test
    public void test() {
        int a = 10, b = 0;
        if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }
    }

    @Test
    public void test1() {
        ifNumbersAreSame(4, 6);
    }

    public void ifNumbersAreSame(int a, int b) {
        if (a == b) {
            System.out.println("true");
        } else if (a != b) {
            System.out.println("false");
        }
    }

    @Test
    public void forTest() {
        for (int i = 0; i < 6; i++) {
//            System.out.println("1");
            System.out.println(i);
        }

        for (int i = 6; i >= 0; i--) {
            System.out.println(i);
        }
// дізнатися парні числа
        for (int i = 0; i < 10; i += 2) {
//            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        for (int i = 0; i < 10; i += 2) {
//            System.out.println(i);
            if (5 < i && i == 8) {// i , или ||
                System.out.println(i);

            }
        }

        for (int i = 0; i < 10; i += 2) {
//            System.out.println(i);
            if (i == 6) {// i , или ||
                System.out.println("break");
                break;

            }
        }
        for (int i = 0; i < 10; i++) {
            if (i == 6) {// i , или ||
                continue;
            }
            System.out.println(i);
        }


    }

    @Test
    public void forTest3() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void forTest4() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }

    @Test
    public void forTest5() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);

//            цикл в цикле
        }
    }

    @Test
    public void daysOfWeek() {
        testDaysOfWeek(6);
    }

    public void testDaysOfWeek(int i) {
        if (i <= 5) {
            System.out.println("робочі дні");
        }
        if (i == 1) {
            System.out.println("Monday-день тяжелый!");
        } else if (i == 2) {
            System.out.println("Tuesday");
        } else if (i == 3) {
            System.out.println("Wednesday");
        } else if (i == 4) {
            System.out.println("Thursday");
        } else if (i == 5) {
            System.out.println("Friday");
        }
        if (i == 6 || i == 7) {
            System.out.println("Вихідний");
        }
        if (i == 6) {
            System.out.println("Saturday");
        } else if (i == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("error");
        }

    }

    @Test
    public void daysOfTheMonth() {
        testDaysofTheMonth(2);
    }

    public void testDaysofTheMonth(int i) {
        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
            System.out.println(" 31 ");
        }
        if (i == 4 || i == 6 || i == 9 || i == 11) {
            System.out.println("30");
        } else {
            System.out.println("28");
        }
    }

    @Test

    public void testMultiplicity() {
        for (int j = 0; j < 100; j += 3) {
            System.out.println(j);

        }
    }

    @Test
    public void fizzBuzz() {
        doFizzBuzz(-15);
    }

    public void doFizzBuzz(int num) {
        for (int i = num; i <= 0; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    @Test
    public void withoutGolosni() {
        check("dokyukgkdvmmnbfhgjghjdfncmkdfwi");
    }

    public void check(String text) {
        text.length();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'o' ||
                    text.charAt(i) == 'y' ||
                    text.charAt(i) == 'u' ||
                    text.charAt(i) == 'i') {

            } else {
                System.out.print(text.charAt(i));
            }
        }
    }

    @Test
    public void withoutPrigolosni() {
        check1("ksdlfjlksdskldvmnkldkldssdlhsdhjdshjkdalksjd");
    }

    public void check1(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'k' ||
                    a.charAt(i) == 's' ||
                    a.charAt(i) == 'd' || a.charAt(i) == 'l' || a.charAt(i) == 'f' || a.charAt(i) == 'v' || a.charAt(i) == 'm' ||
                    a.charAt(i) == 'h' || a.charAt(i) == 'j' || a.charAt(i) == 'n'
            ) {

            } else {
                System.out.print(a.charAt(i));
            }

        }
    }
// Тренувальнй тест голосні приголосні
    @Test
    public void withoutProbel() {
        tratata("hjksjhsdkjf kdfjdshfj kddfsdhf ");
    }

    public void tratata(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {

            } else {
                System.out.print(a.charAt(i));
            }
        }

    }

    //    Тренувальний тест з врємєнєм
    @Test
//    public void testTime() {
//       // velue(5);
//    }

    public void velue() {
        for (int i = 0; i < 24; i++) {
            for (int a = 0; a < 60; a++) {
//                    System.out.println("0" + i + ":" + "0" + a);
//                } else if (i < 10) {
//                if (a < 10 && i < 10) {
//                    System.out.println("0" + i + ":" + a);
//                } else if (a < 10) {
//                    System.out.println(i + ":" + "0" + a);
//                }else {
                    System.out.println(i + ":" + a);
//                }
//            }

            }
        }
    }
}


















