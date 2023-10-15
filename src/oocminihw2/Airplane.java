/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author taciana
 */
public class Airplane extends Vehicle implements Flyable {
 private float altitude;
 
  //Constructor for the Airplane class
    public Airplane (int numPassengers){
        super(0, "Airplane", 2, 2, 0, numPassengers);
        
         //Ensure the number of passengers is within a valid range
        if(numPassengers > 300){
            this.numPassengers = 300;
        } else if (numPassengers < 1) {
            this.numPassengers = 1;
        }}
      
     //Change the altitude of the airplane by a specified amount
    @Override
    public void changeAltitude(float change) {
        this.altitude += change;
        // Ensure the altitude is never negative
        if(this.altitude <  0) {
            this.altitude = 0;
        }
    }

    //Get the altitude of the airplane
    @Override
    public float getAltitude() {
        return this.altitude;
    }

    //Accelerate the airplane by increasing its speed
    @Override
    public void accelerate(float speed) {
        this.speed += speed;
    }

    //Brake the airplane, setting its speed to zero
    @Override
    public void brake() {
        this.speed = 0;
    }

    //Turn the airplane to a specific angle
    @Override
    public void turn(float angle) {
        this.direction = angle;
    }

    
    //Get the direction of the airplane
    @Override
    public float getDirection() {
        return this.direction;
    }

    //Get speed of the airplane
    @Override
    public float getSpeed() {
        return this.speed;
    }

    //Get the make (manufacturer) of the airplane
    @Override
    public String getMake() {
        return this.make;
    }

    
    //Get the type (category) of the airplane
    @Override
    public String getType() {
        return this.type;
    }
    }