/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car myCar = new Car( "Citroen", "C3");
        Plane myPlane = new Plane("Boeing", "Commercial");
        Boat myBoat = new Boat ("Regina", "Catamaran");

        //performing operarions with the object, such as accelerate or changing direction
        myCar.accelerate(60);
        myCar.turn(45);
        myPlane.changeAltitude(10000);
        myBoat.hoistSail();
        

        //access to the attributes and methos of the object
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Type: " + myCar.getType());
        System.out.println("Plane Altitude:" + myPlane.getAltitude());
        System.out.println("Boat Sail Hoisted;" + myBoat.isSailHoisted());
    }
}
        
    
    
