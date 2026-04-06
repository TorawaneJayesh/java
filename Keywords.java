class Animal {

    String color = "White";

}

// The super keyword is used to access the variables and methods of the parent class.
// parent class variable and constructor.
class Dog extends Animal {

    String color = "Black";

    void printColor() {
        System.out.println(color);       // child variable
        System.out.println(super.color); // parent variable
    }
}

class Student {

    String name;

    Student(String name) {
        // The this keyword refers to the current object.
        this.name = name;
    }
    void display() {
        System.out.println(name);
    }
}
class Keywords {
    public static void main(String args[]){
        Student s = new Student("Jayu");
        s.display();

        // call for super method 
        Dog d = new Dog();
        d.printColor();
    }    
}
