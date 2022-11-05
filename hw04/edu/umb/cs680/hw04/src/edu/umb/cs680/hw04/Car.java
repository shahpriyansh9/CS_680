package edu.umb.cs680.hw04;

public class Car {
    private String make, model;
    private int mileage, year;
    private float price;

    public Car(String make, String model, int mileage, int year, float price){
        super();
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;

    }
    public String getmake(){
        return make;
    }

    public String getmodel(){
        return model;
    }

    public int getmileage(){
        return mileage;
    }
    
    public int getyear(){
        return year;    
    }

    public float getprice(){
        return price;
    }

    public static void main(String[] args){
        Car car = new Car("RangeRover", "SPORT", 19, 2022, 190000);
        System.out.println("Make =" + car.getmake() + "\n" + "Model =" + car.getmodel() + "\n" + "Mileage =" + car.getmileage() + "\n" + "Year =" + car.getyear() + "\n" + "Price =" + car.getprice());
    }
}