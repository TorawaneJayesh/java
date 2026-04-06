// The final keyword is used to restrict variables, methods, and classes.
// final variable final method final class..
class Animal {
    final int x = 10;
    // x = 20; // ERROR (cannot change final variable)

    final void sound() {
        System.out.println("Animal sound");
    }

}

class Dog extends Animal {

    // void sound() {} // ERROR (cannot override final method)

}
/*final final class Animal {

    void show() {
        System.out.println("Animal class");
    }

}

// class Dog extends Animal {} //  ERROR
*/
public class Final {
    public static void main(String args[]){
        Animal a = new Animal();
        a.sound();

    }
    
}
