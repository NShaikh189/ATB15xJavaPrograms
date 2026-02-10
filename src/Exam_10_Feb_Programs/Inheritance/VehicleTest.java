package Exam_10_Feb_Programs.Inheritance;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};

        for(Vehicle vehicle: vehicles)
        {
            vehicle.start();
        }
    }
}
