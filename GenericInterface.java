interface Calculator <T>
{
    T Add(T a, T b);
}

class MyCalculator <T> implements Calculator<Integer>
{
    private Integer a,b;

    public Integer Add(Integer a, Integer b)
    {
        this.a = a;
        this.b = b;

        return a + b;
    }
}

class GenericInterface
{
    public static void main(String args[])
    {
        MyCalculator<Integer> c1 = new MyCalculator<>();
        int a = c1.Add(3, 7);
        System.out.println(a);
    }
}