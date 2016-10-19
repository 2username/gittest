import java.util.Random;
import java.util.Scanner;

public abstract class Car implements OldCar, LowCar {

    int year;
    int price = 10000;
    double gas = 10.9391913931913;
    int stop = 0;
    boolean startOnOff = false; // машина заведена или нет

    abstract String getDeveloper(); // страна производитель

    abstract String setmark(); // получение марки

    void go(int year, String nameCountry) {
        if (startOnOff == false) {
            System.out.println("Заведите авто");
            start();
        }
        int noStart = 0;// счетчик, прошла ли машина всю дистанцию?
        if (year < 1990) {
            switch (nameCountry) {
                case "Germany":
                    Random random = new Random(System.currentTimeMillis());
                    for (int i = 0; i < 5; i++) {
                        int q = random.nextInt(20) + 1;
                        if (q <= 1) {
                            System.out.println("Германсоке авто заглохло " + q);
                            noStart++;
                            start();
                        } else System.out.println("Германское авто завелось " + q);
                    }
                    break;
                case "Japan":
                    Random random1 = new Random(System.currentTimeMillis());
                    for (int i = 0; i < 5; i++) {
                        int q = random1.nextInt(20) + 1;
                        if (q <= 1) {
                            System.out.println("Японское авто заглохло " + q);
                            noStart++;
                            start();
                        } else System.out.println("Японское авто завелось " + q);
                    }
                    break;

                case "Russia":
                    Random random2 = new Random(System.currentTimeMillis());
                    for (int i = 0; i < 5; i++) {
                        int q = random2.nextInt(4) + 1;
                        if (q <= 1) {
                            System.out.println("Русское авто заглохло " + q);
                            noStart++;
                            start();
                        } else System.out.println("Русское авто завелось " + q);
                    }
                    break;
            }
        } else switch (nameCountry) {
            case "Germany":
                Random random = new Random(System.currentTimeMillis());
                for (int i = 0; i < 5; i++) {
                    int q = random.nextInt(20) + 1;
                    if (q <= 1) {
                        System.out.println("Германсоке авто заглохло " + q);
                        noStart++;
                        start();
                    } else System.out.println("Германское авто завелось " + q);
                }
                break;
            case "Japan":
                Random random1 = new Random(System.currentTimeMillis());
                for (int i = 0; i < 5; i++) {
                    int q = random1.nextInt(20) + 1;
                    if (q <= 1) {
                        System.out.println("Японское авто заглохло " + q);
                        noStart++;
                        start();
                    } else System.out.println("Японское авто завелось " + q);
                }
                break;

            case "Russia":
                Random random2 = new Random(System.currentTimeMillis());
                for (int i = 0; i < 5; i++) {
                    int q = random2.nextInt(3) + 1;
                    if (q <= 1) {
                        System.out.println("Русское авто заглохло " + q);
                        noStart++;
                        start();
                    } else System.out.println("Русское авто завелось " + q);
                }
                break;

        }
        if (noStart <= 0) {
            System.out.println("По итогу машина доехала отлично");
        }else System.out.println("По итогу машина глохла");
    }

    void start(){
        increaseStop();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 чтобы завести");
        if (sc.nextInt() == 1){
            System.out.println("Дрынь-дынь-дынь!");
            startOnOff = true;
        }else start();
    };

    void stop(int stop) {
        this.stop = stop;
    } // метод глохнуть  начальной вероятностью 0%(Подсказка по реализации ниже)


    void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }
}
