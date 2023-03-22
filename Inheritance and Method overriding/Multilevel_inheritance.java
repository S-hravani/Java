

class Car
{
    String vehicle = "car";
    void vehicle_type()
    {
        System.out.println("vehicle type = "+vehicle);
    }
}

class Maruti extends Car{
    String brand = "TATA";
    void brand()
    {
        System.out.println("brand = "+brand);
    }
}

class Maruti800 extends Maruti
{
    int speed = 100;
    void speed()
    {
        System.out.println("speed = "+speed+" kmph");
    }
}


public class Multilevel_inheritance {
    public static void main(String args[])
    {
        Maruti800 obj = new Maruti800();
        obj.speed();
        obj.brand();
        obj.vehicle_type();
    }
}
