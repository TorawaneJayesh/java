/* extends keyword se inheritance hota hai
   Child class parent ki methods use kar sakti hai
   Code reuse hota hai → efficient*/

class Animal{
    void sound(){
        System.out.println("sound - No");
    }
}
    class Dog extends Animal{
        void sound1(){
            System.out.println("dog sound - Bho Bho");
        }
    }

class Inheritance {
    public static void main(String []args){
        Dog d = new Dog();
        d.sound();
        d.sound1();
    }
    
}
