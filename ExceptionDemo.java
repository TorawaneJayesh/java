//  Exception - An exception is an unwanted event that disturbs the normal flow of a program.
 class ExceptionDemo {
    static void checkAge(int age) throws ArithmeticException {

        if(age < 18) {
            throw new ArithmeticException("Not eligible");
        }

        System.out.println("Eligible to vote");
    }
    public static void main(String args[]){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }

        catch(ArithmeticException e) {
            
            System.out.println("Cannot divide by zero");
        }

        finally {
            System.out.println("Program finished");
        }
        
        //throw keyword ka use manually exception generate karne ke liye kiya jata hai.
        int age = 19;

        if(age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("You can vote");

        checkAge(15);
    }
    
}

