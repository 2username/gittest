
public class Car {

    protected int id = 0;
    protected String mark = "n/d";
    protected String model = "n/d";
    protected int year = 0;
    protected String color = "n/d";
    protected int price = 0;
    protected String vin = "n/d";

    public void setId(int id){
        this.id = id;
    }
    public void setMark(String mark){
        this.mark = mark;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setVin(String vin){
        this.vin = vin;
    }

    public  void descroptionOfCar(){
        System.out.println("____________________");
        System.out.println("id Car " +  id);
        System.out.println("mark Car " + mark);
        System.out.println("model Car " + model);
        System.out.println("year Car " + year);
        System.out.println("color Car " + color);
        System.out.println("price Car " + price);
        System.out.println("vin Car " + vin);

    }
}
