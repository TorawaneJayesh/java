/* Access modifiers control the accessibility of variables, methods, and classes. 
    public - access in same class subclass same packege and other package.
    protected - access in same package same class and subclass.
    default - acces in same class and same package.
    private - access in same class.
    */

class Person {

    private int age = 21;          // private → only accessible inside this class

    public String name = "Jayu";   // public → accessible everywhere

    protected String city = "Pune"; // protected → accessible in same package + subclasses

    int id = 101;                  // default → accessible only inside same package

    // public method to access private variable
    public void showAge() {
        System.out.println("Age: " + age);
    }
}

// Child class to demonstrate protected access
class Student extends Person {

    void display() {

        // name is public → accessible
        System.out.println("Name: " + name);

        // city is protected → accessible in subclass
        System.out.println("City: " + city);

        // id is default → accessible in same package
        System.out.println("ID: " + id);

        // age is private → cannot access directly
        // System.out.println(age); ❌ ERROR

        // Instead we call public method
        showAge();
    }
}
class Acceses_modifiers {
    public static void main(String args[]){
        Student s = new Student();

        // public variable → accessible
        System.out.println("Name: " + s.name);

        // protected variable → accessible (same package)
        System.out.println("City: " + s.city);

        // default variable → accessible (same package)
        System.out.println("ID: " + s.id);

        // private variable → not accessible directly
        // System.out.println(s.age); ERROR

        // accessing private data using method
        s.showAge();

        // calling subclass method
        s.display();
    
    }    
}
