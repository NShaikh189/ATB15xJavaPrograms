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

    public abstract void title();
    public abstract void url();

    public void displayLogo()
    {
        System.out.println("Page - Logo displayed");
    }

    public void footers()
    {
        System.out.println("Page - Footers displayed");
    }

}
