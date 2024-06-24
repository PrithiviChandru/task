package src.main.java.org.task.concept;

/**
 * FUNCTIONAL INTERFACE
 * (ABSTRACT METHODS, DEFAULT METHODS, STATIC METHODS, OBJECT METHODS)
 * Contains one abstract method
 * Central to the design Lambda expression
 * Also called Single Abstract Method Interface (SAM)
 * Annotate not mandatory, but it's good practice
 * Can have default and static methods
 * Can have Object class methods
 */

@java.lang.FunctionalInterface
interface Animal {

    void eat();

    int hashCode();

    boolean equals(Object obj);

    String toString();

}

@java.lang.FunctionalInterface
interface Cat {

    void sleep();

    default void run() {
        System.out.println("Cat running");
    }

    static void eat() {
        System.out.println("Cat eating");
    }

}

public class FunctionalInterface {

    public static void main(String[] args) {
        Cat.eat();
    }

}
