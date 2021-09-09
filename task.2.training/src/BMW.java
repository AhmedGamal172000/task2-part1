

public class BMW extends Car {

    public BMW(String name, String color, String fuel_type , int counter)
    {
        super(name, color, fuel_type,counter);
    }

    public String getName()
    {
        return super.name;
    }

    public String getFuel()
    {
        return super.fuel_type;
    }
    public int getCounter_num()
    {
        counter++;
        return counter;
    }
}

