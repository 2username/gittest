
public class les2 {
    public static void main(String[] args) {

        int a = 9;
        int b = 10;
        boolean boT = true;
        boolean boF = false;

matod(a, b, boT, boT);

    }

    public static void matod (int a, int b, boolean boT, boolean boF) {

        if (a < 8 && !boF){
            System.out.println("First if");
        }else if (a > 9 && !boF){
            System.out.println("Second if");
        }else System.out.println("else");

    }

}
