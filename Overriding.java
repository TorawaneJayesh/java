/* Method overriding occurs when a child class redefines a method of the parent class 
   with the same name and the same parameters. */

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }

}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

}

public class Overriding {
    public static void main(String args[]){
    Dog d = new Dog();
    d.sound();
    }
    
}
