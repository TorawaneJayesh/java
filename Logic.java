import java.util.Scanner;
class Logic {
     static void MaxOfThree(){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a > b && a> c){
            System.out.println(a + " number is max");
        } 
        else if(b > a && b > c){
            System.out.println(b + " number is max");
        }
        else{
            System.out.println(c + " number is big");
        }
    }
    static void Reverse(int num){
        int last;
        int rev = 0;
        while(num > 0){
            last = num % 10;
            num = num / 10;
            rev = rev * 10 + last;
        }
        System.out.println("reverse number is: " + rev);
    }
    static void Palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a palindrome number: ");
        int n, temp;
        n = sc.nextInt();
        temp = n;
        int last;
        int rev = 0;
        while (n > 0){
            last = n % 10;
            n = n / 10;
            rev = rev * 10 + last;
        }
        if (temp == rev){
            System.out.println(temp + " number is palindrome.");
        }
        else{
            System.out.println(temp + " number is not palindrome.");
        }
    }

    static void Armstrong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Armstrong number: ");
        int n;
        n = sc.nextInt();
        int last;
        int temp = n;
        int sum = 0;
        while(n>0){
            int cube;
            last = n % 10;
            n = n/10;
            cube = last* last* last;
            sum += cube;
        }
        System.out.println(sum);
        if(sum == temp){
            System.out.println("number is Armstrong.");
        }
        else{
            System.out.println("not Armstrong");
        }
    }

    static void Fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n;
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;
        System.out.println("0");
        for(int i = 2; i < n; i++){
            next = a + b;
            a = b;
            b = next;
            System.out.println(next);
        }
    }
    static void Factorial(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number for factorial: ");
    int n = sc.nextInt();

    int fact = 1;

    for(int i = 1; i <= n; i++){
        fact = fact * i;
    }

    System.out.println("Factorial is: " + fact);

}

static void Prime(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    if(n <= 1){
        System.out.println("Not Prime");
        return;
    }
    boolean isPrime = true;
    for(int i = 2; i < n; i++){
        if(n % i == 0){
            isPrime = false;
            break;
        }
    }
    if(isPrime){
        System.out.println("Prime Number");
    } else {
        System.out.println("Not Prime");
    }
}
    public static void main(String args[]){
         //MaxOfThree();
        //Reverse(123);
        //Palindrome();
        //Armstrong();
        //Fibonacci();
        //Factorial();
        //Prime();
    }
    
}
