import java.util.*;
class BankAccount{
    private int balance = 0;
    void deposit(int ammount){
        balance += ammount;
    }

    void Display(){
        System.out.println("balance is:" + balance);
    }
}
class encapsulation {
    public static void main(String [] args){
        BankAccount Ba = new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ammount:");
        int am=sc.nextInt();
        Ba.deposit(am);
        Ba.Display();
    }
    
}
