class Methods {

    public int add(int a, int b) {
        return a + b;
    }

    static void evenodd(int n){
        if(n%2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        int result = m.add(5, 3);
        evenodd(2);
        System.out.println(result);
    }
}
