/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author taciana
 */
public class boat extends Vehicle implements Sailable{

    //Constructor for the Boat class
    public boat(int numPassengers) {
        super(0, "boat", 0, 0, 1, numPassengers);
       
        //Ensure the number of passengers is within a valid range
        if(numPassengers > 20) {
            this.numPassengers = 20;
        }
        if(numPassengers < 1) {
            this.numPassengers = 1;
        }
    }

    // Hoist the sail of the boat, increasing speed and setting direction to 90 degrees
    @Override
    public void hoistSail() {
        this.speed += 10;
        this.direction = 90;
    }

    // Lower the sail of the boat, decreasing speed
    @Override
    public void lowerSail() {
        this.speed -= 10;
    }

    // Check if the sail is hoisted by examining the boat's speed
    @Override
    public boolean isSailHoisted() {
        if(this.speed > 0){
            return true;
        } else if(this.speed <= 0){
            return false;
        } else {
            return false;
        }

    }

    //setting its speed to zero
    @Override
    public void landHo() {
        this.speed = 0;
    }

}