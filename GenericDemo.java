
class Box<T>
    {
        T value;

        void setvalue(T value)
        {
            this.value = value;
        }

        T getvalue()
        {
            return value;
        }
    }

class Data<T>
{
    T value;
    void setvalue(T value)
    {
        this.value = value;
    }

    T getvalue()
    {
        return value;
    }
}

public class GenericDemo
{
    public static void main(String args[])
    {
        // Box<Integer> b1 = new Box<>();
        // b1.setvalue(100);
        // System.out.println(b1.getvalue());

        // Box<String> b2 = new Box<>();
        // b2.setvalue("java");
        // System.out.println(b2.getvalue());

        Data<Integer> d1 = new Data<>();
        d1.setvalue(10000);
        System.out.println(d1.getvalue());

        Data<String> d2 = new Data<>();
        d2.setvalue("Java Advance");
        System.out.println(d2.getvalue());

        Data<Double> d3 = new Data<>();
        d3.setvalue(1.0000);
        System.out.println(d3.getvalue());
    }
}