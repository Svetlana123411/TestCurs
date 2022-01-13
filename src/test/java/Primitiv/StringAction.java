package Primitiv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringAction {
    @Test
    public void check() {
        Assert.assertFalse(summ(30,23) ==56);
        Assert.assertTrue(kvadrat(10) ==100);
        Assert.assertTrue(ploschaKruga(-10) ==100);
    }
    public int summ(int numone,int numtwo){
        return numone+numtwo;
    }
    public int kvadrat(int num){
        return num*num;
    }
    @Test
    public void checkKrug(){
        Assert.assertTrue(ploschaKruga(10)==10);
    }

    public double ploschaKruga(double radius) {
        System.out.println("nhfnnf" + ploschaKruga(10));
        return 3.14 * (radius * radius);
    }

    @Test
    public void areaRectangl() {
        Assert.assertTrue(area(10, 4) == 40);
        Assert.assertEquals(40, 20);
    }

    public int area(int a, int b) {
        int area = a * b;
        System.out.println("Дізнатися площу прямоктника");
        System.out.println("якщо a=10, b=4");
        System.out.println("10*4=40");
        return area;
    }
    @Test
    public void VolumeOfCylinder(){
        Assert.assertTrue(volume(10,3.14,3)==942.4777960769379);
    }

    public double volume(int r, double PI, int h) {
        double valueOfCylinder = Math.PI * (r * r * h);
        System.out.println("Дізнатися V циліндра");
        System.out.println("Площа циліндра = "+ valueOfCylinder);
        return valueOfCylinder;
    }
    @Test
    public void volumeOfCube(){
        Assert.assertTrue(cube(15) == 3375);
    }
    public int cube(int a){
        int valueCube = a*a*a;
        System.out.println("Дізнатися V куба");
        System.out.println("Об'єм куба = "+ valueCube);
        return valueCube;
    }
    @Test
     public void areaCircle(){
        Assert.assertTrue(circle(3.14,12)==1357.1680263507906);

    }
    public double circle(double PI,int R) {
        double S = Math.PI * Math.pow(R, 2);
        System.out.println("Дізнатися площу круга" );
        System.out.println("Площа круга дорівнює " + S );
        return S;
    }
    @Test
    public void lengthOfCircle(){
        Assert.assertTrue(length(3.14,5,2)==31.41592653589793);

    }
    public double length(double PI, int r, int b){
        double C = (2*Math.PI) * r;
        System.out.println("Дізнатися довжину круга" );
        System.out.println("Довжина круга дорівнює " + C );
        return C;
    }
    @Test
    public void ThreeNumbers(){
        Assert.assertTrue(summ(3.14,5,2)==31.41592653589793);

    }
    public double summ(double PI, int r, int b){
        double C = 5.63+10+50;
        System.out.println("Дізнатися суму 3 х чисел" );
        System.out.println("Сума 3х чисел дорівнює  " + C );
        return C;
    }

    @Test
    public void threeNumbers(){
        Assert.assertTrue(multiplication(1000,3,-1)==-3000);

    }
    public int multiplication(int a, int r, int b){
        int M = a*r*b;
        System.out.println("Дізнатися добуток 3 х чисел" );
        System.out.println("Добуток 3х чисел дорівнює  " + M );
        return M;
    }

    @Test
    public void twoNumbers(){
        Assert.assertTrue(division(3000000,45)==66666);

    }
    public int division(int a,int b){
        int M = a/b;
        System.out.println("Дізнатися частку 2 х чисел" );
        System.out.println("Частка 2х чисел дорівнює  " + M );
        return M;
    }








    // лоща прямокутника, обьем куба, площа круга, довжина кругу,суа 3х чисел, поділити 2 чила
}
