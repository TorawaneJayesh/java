// packege - A package is a namespace used to organize related classes and interfaces.
/* Built-in Packages
    Java already provide karta hai
Examples:
    java.lang
    java.util */

import calculator.Package;

class Packege {

    public static void main(String[] args) {

        Package c = new Package();

        int sum = c.add(5, 5);

        System.out.println("Addition is: " + sum);
    }
}