class Classdemo {
    static class Car{
        String color;
        int speed;
        static String col_name = "ABC"; // static variable
        void details(){
            System.out.println("color of car:" + color + "speed of car:"+ speed);
        }
    }
    public static void main(String args[]){
        Car c1 = new Car();
        c1.color="red";
        c1.speed=300;
        c1.details();
    }
    
}
