
public class Data {

    String model; // модель машины
    String mark; // марка машины
    String fuel; // вид топлива
    double theAmountOfGas; //сколько газа в баке
    double howMuchGasoline; // сколько бензина в баке
    double requiredFlow; // требуемый расход
    double howManyKilometers; // на сколько километров
    double kilometersTo10Liters; // Один километров на газу?
    double howMuchToPass; // Километров на 10 литрах
    double gasConsumption; // Расход газа
    double gasMileage; // Расход бензина


    public double getKilometersTo10Liters (){ // Один километров на газу?
        kilometersTo10Liters = howManyKilometers / requiredFlow;
        return kilometersTo10Liters;
    }

    public double getHowMuchToPass (){ // Километров на 10 литрах
    howMuchToPass = theAmountOfGas * getKilometersTo10Liters();
        return howMuchToPass;


}

}
