import java.util.Scanner;
import java.util.*;
class StringDemo {
    public static void main(String args[]){
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 +" "+ s2);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(0));
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); 
        String s = "Programming";
        System.out.println(s.substring(3,7)); 

    }
    
}
