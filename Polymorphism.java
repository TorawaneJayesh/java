

class Overload{
    void multiplication(int a, int b){
        System.out.println(a * b);
    }

    void multiplication(int a , int b , int c){
        System.out.println(a * b * c);
    }
}

class Cat{
    void sound(){
        System.out.println("this is cat sound");
    }
}

class Dog extends Cat{
    void sound(){
        System.out.println("this is dog sound");
    }
}

public class Polymorphism {
    public static void main(String [] args){
    Overload Od = new Overload();
    Od.multiplication(2, 04, 2);

    Cat c = new Dog();
    c.sound();
    }
    
}
