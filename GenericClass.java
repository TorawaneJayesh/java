
class Pair<K, V>
{
    K key;
    V value;

    Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

     void display()
        {
            System.out.println("key: " + key);
            System.out.println("value: " + value);
        }
}
class GenericClass
{
    public static void main(String args [])
    {
        Pair <Integer, String> p1 = new Pair<>(101, "java");
        p1.display();
    }
}