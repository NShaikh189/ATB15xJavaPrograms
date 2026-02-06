package Practice.Inheritance;

public class AnnonymousClass {


    static A a = new A(){
        @Override
        public void display(){
            System.out.println("Hello");
        }
    };


    public static void main(String[] args) {
        a.display();
    }


}
