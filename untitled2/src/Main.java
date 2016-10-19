
public class Main {
    public static void main(String[] args) {




        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);



//        // the initial formula
//        String con = "9x^2 - 3x - 2 = 0";
//        System.out.println("Condition: " + con);
//
//        // meaning
//        int a = 9;
//        int b = -3;
//        int c = -2;
        System.out.println("Value: " + "a= " + a + ", b= " + b + ", c= " + c);

        // discriminant calculation
        double d = b*b - (4 * a * c);
        System.out.println("The discriminant = " + d);

        // the calculation of the equation root
        if (d > 0){
            System.out.println("The discriminant is greater than zero");
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else {
            System.out.println("Achtung. The discriminant is less than zero");
        }

//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        int c = Integer.parseInt(args[2]);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
    }
}
