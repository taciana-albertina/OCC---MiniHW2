/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public abstract class Vehicle {
    protected float speed;
    protected float direction = 0;
    protected String make;
    protected String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    int numPassengers; 

  public Vehicle(float speed, String type, int numWheels, int numWings, int numSails,  int numPassengers) {
        this.speed = 0;
        this.direction = 0;
        this.make = "";
        this.type = type;
        this.numWheels = numWheels;
        this.numWings = numWings;
        this.numSails = numSails;
        this.numPassengers = numPassengers;
    }

}

