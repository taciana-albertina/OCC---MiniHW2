/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author taciana
 */
public class Car extends Vehicle implements Drivable{

    //Constructor for the Car class
    public Car (int numPassengers){
        super(0, "Car", 4, 0, 0, numPassengers);
       
        //Ensure the number of passengers is within a valid range
        if(numPassengers > 5){
            this.numPassengers = 5;
        } else if (numPassengers < 1) {
            this.numPassengers = 1;
        }

    }

    //Accelerate by increasing its speed
    @Override
    public void accelerate(float speed) {
        this.speed += speed;
    }

    //Brake the car, setting its speed to zero
    @Override
    public void brake() {
        this.speed = 0;
    }

    //Turn a specific angle
    @Override
    public void turn(float angle) {
       this.direction = angle;
    }

    //get direction of the car
    @Override
    public float getDirection() {
        return this.direction;
    }

    //Get speed 
    @Override
    public float getSpeed() {
        return this.speed;
    }

    //Get the make
    @Override
    public String getMake() {
        return this.make;
    }

    //Get the type (category) 
    @Override
    public String getType() {
        return this.type;
    }



}