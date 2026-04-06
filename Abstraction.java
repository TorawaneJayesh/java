/*Abstract Class
abstract keyword use hota hai
Method implementation optional
Object directly nahi bana sakte
Interface
Fully abstract (Java 8 se default & static methods allowed)
Multiple inheritance allow karta ha */

// abstract class 
abstract class Shape {
    abstract void area();

    void area1() {
        System.out.println("This is shape class");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("This is circle class");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("This is rectangle class");
    }
}

// interface class
interface Flayable {
    void fly();    
}

class Bird implements Flayable{
    public void fly(){
        System.out.println("bird is flying");
    }
}
class Abstraction {
    public static void main(String args[]) {

        Shape c = new Circle();      // Parent reference
        Shape r = new Rectangle();   // Parent reference

        c.area();
        r.area();
        c.area1();

        Bird b =new Bird();
        b.fly();
    }
}

