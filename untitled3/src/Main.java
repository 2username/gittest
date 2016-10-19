
public class Main {
    public static void main(String[] args){

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setId(1234);
        car1.setMark("Volvo");
        car1.setModel("W40");
        car1.setYear(12);
        car1.setColor("Yellow");
        car1.setPrice(4000);
        car1.setVin("A2300ABH");

        car2.setId(4321);
        car2.setMark("ZAZ");
        car2.setModel("Lanos");
        car2.setYear(0);
        car2.setColor("Blue");
        car2.setPrice(8100);
        car2.setVin("AB060091SSJ");

        car3.setId(56789);
        car3.setMark("UAZ");
        car3.setModel("Bobik");
        car3.setYear(20);
        car3.setColor("Green");
        car3.setPrice(2050);
        car3.setVin("GJKG787s");

        car1.descroptionOfCar();
        car2.descroptionOfCar();
        car3.descroptionOfCar();
    }
}
