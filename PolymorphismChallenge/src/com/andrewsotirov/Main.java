package com.andrewsotirov;


class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;
    private int velocity;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = 5;
        this.velocity = 0;
    }

    public String startEngine() {
        System.out.println("Car.startEngine()");
        return "Vroom!!!";
    }

    public String accelerate(int speed) {
        velocity += speed;
        System.out.println("Car.accelerate()");
        return "You are accelerating with " + speed + "km/h. And you are moving with " + velocity + "km/h";
    }

    public String brake() {
        System.out.println("Car.brake()");
        velocity = 0;
        return "You stopped";
    }


    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mercedes extends Car {

    public Mercedes() {
        super("Mercedes", 6);
    }

    @Override
    public String startEngine() {
        return "Mercedes.startEngine()";
    }

    @Override
    public String accelerate(int speed) {
        return "Mercedes.accelerate()";
    }

    @Override
    public String brake() {
        return "Mercedes.brake()";
    }
}

class BMW extends Car {

    public BMW() {
        super("BMW", 6);

    }

    @Override
    public String startEngine() {
        return "BMW.startEngine()";
    }

    @Override
    public String accelerate(int speed) {
        return "BMW.accelerate()";
    }

    @Override
    public String brake() {
        return "BMW.brake()";
    }
}

class Audi extends Car {
    public Audi() {
        super("Audi", 4);
    }

    @Override
    public String startEngine() {
        return "Audi.startEngine()";
    }

    @Override
    public String accelerate(int speed) {
        return "Audi.accelerate()";
    }

    @Override
    public String brake() {
        return "Audi.brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here

        Car car = new Car("Base", 64);

        System.out.println(car.startEngine());
        System.out.println(car.accelerate(50));
        System.out.println(car.brake());

        Mercedes mercedes = new Mercedes();
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate(50));
        System.out.println(mercedes.brake());

        Ford ford = new Ford();
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate(50));
        System.out.println(ford.brake());

    }


    static class Ford extends Car {
        public Ford() {
            super("Audi", 4);
        }

        @Override
        public String startEngine() {
            return "Ford.startEngine()";
        }

        @Override
        public String accelerate(int speed) {
            return "Ford.accelerate()";
        }

        @Override
        public String brake() {
            return "Ford.brake()";
        }
    }
}
