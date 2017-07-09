package com.company;


class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name,int cylinders){
        this.wheels = 4;
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String startEngine(){
        return  "Car -> Engine started";
    }


    public String  accelerate(){
        return  "Car -> accelerated";
    }

    public String brake(){
        return "Car -> brake";
    }


}

class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
    Car car = new Car("Base",4);
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());


    Mitsubishi mitsubishi  = new Mitsubishi("Outlander",6);
    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());


    Ford ford  = new Ford("Ford",6);
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());



    }
}
