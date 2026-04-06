/*The static keyword is used to create class-level members (variables, methods, blocks)
  that can be accessed without creating an object */
class Student {

    int roll;
    String name;

    static String college = "ABC College"; // static variable

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}
class Test {
    // static method 
    static void show() {
        System.out.println("Static method called");
    }

    // static block
    static {
        System.out.println("Static block executed");
    }
}
public class Static {
    public static void main(String args[]){
        Student s1 = new Student(1,"Jayu");
        Student s2 = new Student(2,"Rahul");

        s1.display();
        s2.display();
        Test.show(); // bina object call to static method..
    }
    
}
