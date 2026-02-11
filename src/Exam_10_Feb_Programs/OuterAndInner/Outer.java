package Exam_10_Feb_Programs.OuterAndInner;

public class Outer {

    private int x =10;

    public class Inner{

        public void display()
        {
            System.out.println("Inner class accessing outer variable: "+x);
        }

    }

    public void show()
    {
     System.out.println("Outer class variable x: "+x);

//     Inner inner = new Inner();
//     inner.display();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();

        Outer.Inner inner =  outer.new Inner();
        inner.display();
    }
}
