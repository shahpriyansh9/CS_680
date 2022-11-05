package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CarTest{

    private String[]carToStringArray(Car car){
        String[] carDetails = {
                car.getmake(), car.getmodel(),
                Integer.toString(car.getyear())
        };
        return carDetails;
    }



    @Test
    public void verifyCarEqualitywithMakeModelYear()
        {
            String[] expected = {"RangeRover", "SPORT", "2022"};
            Car actual = new Car("RangeRover", "SPORT", 19, 2022, 190000);
            assertArrayEquals(expected, carToStringArray(actual));
        }


    @Test
    public void verifyCarEqualityWithPrice(){
        Car actual= new Car("", "", 0, 0, 190000);
        assertEquals(190000, actual.getprice(), 0.1);
    }

    @Test
    public void verifyCarEqualityWithMileage(){
        Car actual= new Car("", "", 19, 0, 0);
        assertEquals(19, actual.getmileage(), 0.1);
    }

}