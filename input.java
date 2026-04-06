import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class input {
    public static void main(StringDemo[] args) {

        // scanner method 
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        float marks = sc.nextFloat();
        String name = sc.next();

        System.out.println(age);
        System.out.println(marks);
        System.out.println(name);

        // buffer reader method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mark = br.read(System.in);
        System.out.println(mark);
    }
}
