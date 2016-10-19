
public class Main {
    public static void main(String[] car) {

        Data car1 = new Data();
        car1.mark = "ZAZ"; // модель машины
        car1.model = "Lanos"; // марка машины
        car1.fuel = "Gaz"; // вид топлива
        car1.theAmountOfGas = 10; //сколько газа в баке
        car1.howMuchGasoline = 20; // сколько бензина в баке
        car1.requiredFlow = 12; // требуемый расход
        car1.howManyKilometers = 100; // на сколько километров
        car1.getKilometersTo10Liters();
        car1.getHowMuchToPass();

        Data car2 = new Data();
        car2.mark = "Vaz"; // модель машины
        car2.model = "Devyatka"; // марка машины
        car2.fuel = "Benzine"; // вид топлива
        car2.theAmountOfGas = 1; //сколько газа в баке
        car2.howMuchGasoline = 35; // сколько бензина в баке
        car2.requiredFlow = 9; // требуемый расход
        car2.howManyKilometers = 100; // на сколько километров


        double carHowMuchToPass = car1.getHowMuchToPass();
        System.out.println(carHowMuchToPass);

    }
}
