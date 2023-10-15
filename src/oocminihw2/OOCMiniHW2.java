/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author taciana
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane (20); //Create an Airplane object named myAirplane with a passenger capacity of 20.
        myAirplane.accelerate (300); //Accelerate the airplane to a speed of 300 units.
        myAirplane.changeAltitude(500); //Change the altitude of the airplane to 500 units.
        
        Car myCar = new Car (4); //object named myCar with 4 wheels.
        myCar.accelerate ((float)43.6); //Accelerate the object myCar to a speed of 43.6 units
        
        boat myboat = new boat (18); //a object named myBoat
        myboat.hoistSail (); //Hoist the sail of the boat.
       
       
        // Print information about the car.
        System.out.println(
            "**************CAR*************\n" +
            "speed:" + Float.toString (myCar.getSpeed()) + "\n" +
            "type:" + myCar.getType() + "\n"+
            "direction:" + Float.toString (myCar.getDirection()) + "\n"
        );
        
        //Print information about the boat.
        System.out.println(
            "***********BOAT******************\n" +
            "on move:" + Boolean.toString(myboat.isSailHoisted()) + "\n" +
            "type:" + "boat" + "\n"
        );
        
        // Print information about the Airplane.        
        System.out.println(
            "********AIRPLANE**************************\n" +
            "speed:" + Float.toString (myAirplane.getSpeed()) + "\n" +
            "type:" + myAirplane.getType() + "\n"+
            "direction:" + Float.toString (myAirplane.getDirection()) + "\n" +
            "Altitude:" + Float.toString (myAirplane.getAltitude ()) + "\n"
                        
        );
                 
        
    }
    
}
