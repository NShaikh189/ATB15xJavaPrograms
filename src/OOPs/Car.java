package OOPs;

public class Car {
    private String fuelType; //petrol,cng,diesel
    private int regno;
    private String modelno;
    private String carName;

    public Car(String carName, int regno, String modelno, String fuelType)
    {
        this.carName = carName;
        this.regno=regno;
        this.modelno=modelno;
        this.fuelType=fuelType;
    }
    public void manual()
    {
        System.out.println("Manual");
    }

    public void automatic()
    {
        System.out.println("Automatic");
    }

    public void getInfo()
    {
        System.out.println("CarName: "+carName);
        System.out.println("Reg No: "+regno);
        System.out.println("Model No: "+modelno);
        System.out.println("Fuel Type: "+fuelType);
    }
}
