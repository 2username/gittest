
public class Main {
public static void main(String[] args){

   Overload ob = new Overload();
    Overload obj4 = new Overload("Inside Constructor");
    System.out.println("Result root of 1 " + Overload.rootOf1);
    Overload obj5 = new Overload("Inside Constructor");
    System.out.println("Result root of 1 " + Overload.rootOf2);

    int resI;
    double resD;

    ob.olvDemo();
    ob.olvDemo(2);
    resI = ob.olvDemo(5, 10);
    System.out.println("Parameter " + resI);
    resD = ob.olvDemo(1.1, 2.5);
    System.out.println("Parameter " + resD);

    Overload st1 = new Overload();
    Overload st2 = new Overload();

    st1.x = 10;
    st2.x = 20;

    Overload.y = 19;

    st1.sun();
    st2.sun();

    System.out.println("st1 " + st1.sun());
    System.out.println("st2 " + st2.sun());

    Overload.olvDiv(Overload.olvDiv(Overload.olvDiv(10)));


}

}
