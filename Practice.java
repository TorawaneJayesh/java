import java.io.Serializable;

public class Practice implements Serializable {
    private int id;
    private  String name;


    public Practice()
    {

    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
}
