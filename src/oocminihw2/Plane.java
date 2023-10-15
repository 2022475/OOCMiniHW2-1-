/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Clara
 */
public class Plane extends Vehicle implements Flyable {
    
    private float altitude = 0;
    
    public Plane(String make, String type){
        this.make = make;
        this.type = type;
        numWings = 2;
    }
    
    
    @Override
    public void accelerate(float speed){
    }
    
    @Override
    public void brake(){
    }
    
    @Override
    public void turn(float angle){
    }
    
    @Override
    public float getDirection(){
        return direction;
    }
    
    @Override
    public float getSpeed(){
        return speed;
    }
    
    @Override
    public String getMake(){
        return make;
    }
    
    @Override
    public String getType(){
        return type;
    }
    
    @Override
    public void changeAltitude(float change) {
        //implement the changeAltitude method for an airplane
        altitude += change;
    }

    @Override
    public float getAltitude() {
        //implement the getAltitude method for an airplane
        return altitude;
    }
}
