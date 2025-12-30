package Practice.Abstraction;

public abstract class Page {

   private int min_speed;

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

  //  public  default  void pageHeader(){} abstract class cannot have default methods.
    //default keyword can be used only with the interfacces

    public  static void pageAuthor(){
        System.out.println("PageAuthor static ");
    }

}
