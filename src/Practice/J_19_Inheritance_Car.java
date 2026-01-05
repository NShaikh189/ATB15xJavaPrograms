package Practice;

public class J_19_Inheritance_Car extends J_19_Inheritance_Vehicle{
    /*
    start(), stop(),billing(), handbrake()

     */
    @Override
    public void start(){
        System.out.println("Vehicle Car : start"+super.wheels);

    }

    public void engine(){
        System.out.println("Car : Engine Type");
    }


    //Method hiding: Parent class static members with same signature in the child class
    public static void speed()
    {
        System.out.println("Car : Speed");
    }


	    /*
	     *  Cannot override the final method from Vehicle
           - overrides JavaPrograms.Vehicle.parking

	    @Override //
	    public final void parking()
	    {}
/*
 * - This instance method cannot override the static method from Vehicle

	    public void speed()
	    {

	    }

	    /*@Override
	    public void handbrake(){
	        System.out.println("Vehicle Final : handbrake");
	    }*/


}
