/*Q9)Interface and abstract class Vehicle and car
Define an interface named Vehicle with methods start(), stop(), accelerate(),
and brake().
Abstract Car Class :
Create an abstract class named Car that implements the Vehicle interface.
Provide standard implementations for the interface methods in the Car class.
Include an abstract method displayFeatures() specific to cars.
Abstract Bike Class :
Create an abstract class named Bike that implements the Vehicle interface.
Provide standard implementations for the interface methods in the Bike class.
Include an abstract method displayFeatures() specific to bikes.
Concrete BMW Class :
Create a concrete class named BMW that extends the Car abstract class.
Implement the displayFeatures() method to showcase features specific to BMW
cars.

Concrete Enfield Class :
Create a concrete class named Enfield that extends the Bike abstract class.
Implement the displayFeatures() method to showcase features specific to Enfield bikes.

Testing class:
Write a test program that demonstrates the functionality of your vehicle hierarchy.
Create instances of BMW and Enfield.
Call various methods to showcase the common and specific behaviors of cars and
bikes.
*/
package com.nt;

public interface IVehicleAndCar {
    public default void start(){
    	System.out.println("Vehicle is Started.");
    }
    public default void stop(){
    	System.out.println("Vehicle is Stopped.");
    }
    public default void accelerate(){
    	System.out.println("Vehicle Speed is OK.");
    }
    public default void brake(){
    	System.out.println("Brake is working properly.");
    }
}
