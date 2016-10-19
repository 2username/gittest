
public class Overload {


       public void olvDemo(){
            System.out.println("No parametrs");
        }
        public void olvDemo(int a){
            System.out.println("One parameters");
        }
        public int olvDemo (int a, int b){
            System.out.println("Turo parameters " + a + " " + b);
            return a+b;
        }
        public double olvDemo (double a, double b){
            System.out.println("Two double parameters" + a + " " + b);
            return  a+b;
        }

    int x ;
    static int y;
    int sun () {
        return x+y;
        }

    static int olvDiv(int z){
        return z / 2;

    }

    static double rootOf1;
    static double rootOf2;
    static{
        System.out.println("Insid static block");
        rootOf1 = 60/8;
        rootOf2 = 70/22;
    }
    Overload(String msq){
        System.out.println(msq);
    }

    public Overload() {
    }
}

