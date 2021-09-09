

public class Marcedes extends Car {

    public Marcedes(String name, String color, String fuel_type, int counter)
    {
        super(name, color, fuel_type , counter);
    }

    public String getName() {
        return super.name;
    }
    public String getFuel()
    {
        return fuel_type;
    }
    public int getCounter_num()
    {
        counter++;
        return counter;
    }
}



