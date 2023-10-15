/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Clara
 */
public class Car extends Vehicle implements Drivable {
    public Car(String make, String type){
        this.make = make;
        this.type = type;
        numWheels = 4;
        numPassengers = 1;
    }


 @Override
 public void accelerate(float speed){
 //implement the accelerate method for a car
 }

@Override 
 public void brake(){
 //implement the brake method for a car
}

 @Override
 public void turn(float angle){
 //implement the turn method for a car
 }

 @Override
 public float getDirection(){
 //implement the getDirection method for a car
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
 
}


