package src.main.java.org.task.concept;

/**
 * DEFAULT METHOD & STATIC METHOD
 * Introduced Java 8
 * default methods in Interface allows implementation without forcing classes to be override
 * static methods in Interface allows implementation and can't be overridden by classes
 */

interface Vehicle {

    void start();

    default void stop() {
        System.out.println("Vehicle stop");
    }

    static void run() {
        System.out.println("Vehicle run");
    }

}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car start");
    }

//    @Override
//    public void stop() {
//        System.out.println("Car stop");
//    }

}

public class DefaultStaticMethod {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.stop();

        Vehicle.run();

    }

}
