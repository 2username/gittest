import java.util.Random;

public interface OldCar {

    void slowGo(); // медленная езда

    void breaking(); // поломка

    default void increaseStop(String nameCountry) {
        switch (nameCountry) {
            case "Russia":
                Random random = new Random(System.currentTimeMillis());
                int q = random.nextInt(5) + 1;
                if (q <= 1) {
                    System.out.println("Русское авто не завелось ");

                }

            case "Germany":
                break;
            case "Japan":
                break;

        }
    }

    ; // увеличение шанса заглохнуть // реализовывать потом на 5% у немцев и японцев и 10% у русских

    void decreasePrice(); //уменьшение цены // реализовать уменьшение цены в 3 раза, если авто старое в классах использующих интерфейс

}
