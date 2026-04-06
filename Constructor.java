/*Constructor ek special method hota hai jo object create hone par automatically call hota hai.
    Default Constructor
    Parameterized Constructor
    Copy Constructor */
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }

    // constructor overloading..
    void display() {
        System.out.println(name);
    }

    Student(String name, int roll) {
        System.out.println(name + " " + roll);
    }
}

class A{
    int a; String n;
    A(){
        a = 10; n = "java";
    }
    
    // copy constructor        
    A(A obj){
        a = obj.a;
        n = obj.n;
        System.out.println(a+" "+n);
        // call for constructor overloading..
        Student s = new Student("Jayu");
        Student s1 = new Student("Jayu",101);
        s.display();
    }

    }
public class Constructor {
    public static void main(String args[]){
        A r = new A();
        A a = new A(r); // call copy constructor
    }
    
}
