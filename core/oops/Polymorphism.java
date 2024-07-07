package oops;

/**
 * Polymorphism
 */

/**
 * a
 */
class A {

    public void show() {
        System.out.println("a showing something");
    }

}

class B extends A {

    public void show() {
        System.out.println("b showing something");
    }

}

public class Polymorphism {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}