package Practice.Abstraction;

public abstract class Page {

    int min_speed = 60;

    public Page()
    {
        this(20);
        System.out.println("Page constructor");
    }

    public Page(int x)
    {
        min_speed = x;
        System.out.println("Page constructor : "+min_speed);
    }
}
