class Demo
{
    <T> void display(T value)
    {
        System.out.println("value: " + value);
    }
}
class GenericMethod
{
    public static void main(String args[])
    {
        Demo d1 = new Demo();
        d1.display(2000);
        d1.display("cash on delivery");
    }
}