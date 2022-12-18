package edu.umb.cs680.hw14;

import java.util.Collections;
import java.util.LinkedList;
public class Car 
{
    private String make;
    private String model;
    private int year;
    private float price;
    private int DomCount;
    private int mileage;
    public Car(String make, String model, int year, float price, int mileage) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }
    public String getMake() 
    {
        return make;
    }
    public String getModel() 
    {
        return model;
    }
    public int getYear() 
    {
        return year;
    }
    public float getPrice() 
    {
        return price;
    }
    public int getDominationCount() 
    {
        return DomCount;
    }
    public int getMileage() 
    {
        return mileage;
    }
    public void setDominationCount(LinkedList<Car> cars) 
    {
        this.DomCount = 0;
        for(Car car: cars) {
            if(car.getPrice() <= this.getPrice() && car.getMileage() <= this.getMileage() && car.getYear() >= this.getYear()) 
            {
                if(car.getPrice() < this.getPrice() || car.getMileage() < this.getMileage() || car.getYear() > getYear() ) {
                    DomCount++;
                }
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<Car>();
        cars.add(new Car("Toyota", "RAV4", 2019, 25000, 15000));
        cars.add(new Car("Toyota", "RAV4", 2018, 24000, 14000));
        cars.add(new Car("Honda", "CRV", 2018, 23000, 13000));
        cars.add(new Car("Honda", "CRV", 2017, 22000, 12000));
        for(Car car: cars) 
        {
            car.setDominationCount(cars);
        }
        Collections.sort(cars, (Car c1, Car c2)-> c1.getMileage() - c2.getMileage());
        System.out.println("Cars sorted by Mileage:");
        for(Car car: cars) 
        {
            System.out.println("Make:" + car.getMake() + " Model:" + car.getModel() + " Year:" + car.getYear() + " Price:" + car.getPrice() + " Mileage:" + car.getMileage());
        }
        Collections.sort(cars, (Car c1, Car c2)-> (int) (c1.getPrice() - c2.getPrice()));
        System.out.println("\nCars sorted by Price:");
        for(Car car: cars) 
        {
            System.out.println("Make:" + car.getMake() + " Model:" + car.getModel() + " Year:" + car.getYear() + " Price:" + car.getPrice() + " Mileage:" + car.getMileage());
        }
        Collections.sort(cars, (Car c1, Car c2)-> c2.getYear() - c1.getYear());
        System.out.println("\nCars sorted by Year:");
        for(Car car: cars) 
        {
            System.out.println("Make:" + car.getMake() + " Model:" + car.getModel() + " Year:" + car.getYear() + " Price:" + car.getPrice() + " Mileage:" + car.getMileage());
        }
        Collections.sort(cars, (Car c1, Car c2)-> c1.getDominationCount() - c2.getDominationCount());
        System.out.println("\nCars sorted by Domination Count:");
        for(Car car: cars) 
        {
            System.out.println("Make:" + car.getMake() + " Model:" + car.getModel() + " Year:" + car.getYear() + " Price:" + car.getPrice() + " Mileage:" + car.getMileage());
        }
    }
}