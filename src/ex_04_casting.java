public class ex_04_casting {

    public static void main() {
        int n = 1000;
        byte b = 50;

        //widening - implicit casting
        int nn= b;
        System.out.println(nn);
        //narrowing
       // byte nb = n; //implicit narrowing is not allowed gives error
        byte bb = (byte) n;

        System.out.println(bb);
    }
}
