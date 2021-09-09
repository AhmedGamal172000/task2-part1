

public class main extends Car
{

    public static void main(String[] args)
    {

        BMW X1 = new BMW("X1", "blue", "electric",counter++);
        Marcedes A200 = new Marcedes("A200", "red", "benzene", counter++);
        System.out.println("car name is " + X1.getName() + " & car type is " + X1.getFuel() + " & NUM of objects created is = " + X1.getCounter_num());
        System.out.println("car name is " + A200.getName() + " & car type is " + A200.getFuel() + " & NUM of objects created is = " + A200.getCounter_num());

    }
}

