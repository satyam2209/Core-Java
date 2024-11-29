// Is-A relation

class device
{
    private String name;
    public void setname(String sname)
    {
        this.name = sname;
    }
    public String showname()
    {
        return this.name;
    }
}

class mouse extends device
{
    void show()
    {
        showname();
    }
}

public class Inheritance9 {
    public static void main(String args[])
    {
        mouse m = new mouse();
        m.setname("HP");
        System.out.println("The device name is");
        System.out.println(m.showname());
    }
}
