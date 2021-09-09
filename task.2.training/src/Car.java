
public abstract class Car {
    public static int counter = 0;
    String name;
    String color;
    String fuel_type;

public Car()
{

}
    public Car(String name, String color, String fuel_type, int counter) {
        this.counter=counter;
        this.name = name;
        this.color = color;
        this.fuel_type = fuel_type;
    }

    public String getName()
    {
        return null;
    }

    public String getFuel()
    {
        return null;
    }
    public int getCounter_num()
    {
        return 0;
    }

}

