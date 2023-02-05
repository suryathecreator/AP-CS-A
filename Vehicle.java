class Vehicle 
{
    private String manuName;
    private int numCylinders; 
    private Person owner;

    public Vehicle(String manuname, int numcylinders, Person owningperson)
    {
        this.manuName = manuname;
        this.numCylinders = numcylinders;
        this.owner = owningperson;
    }
    public Vehicle(String manuname)
    {
        this.manuName = manuname;
    }
    public Vehicle(int numcylinders)
    {
        this.numCylinders = numcylinders;
    }
    public Vehicle(Person owningperson)
    {
        this.owner = owningperson;
    }
    public Vehicle(Vehicle theObject)
    {
        if (theObject != null)
        {
            this.manuName = theObject.getManuName();
            this.numCylinders = theObject.getNumCylinders();
            this.owner = theObject.getOwner();
        }
    }
    public String getManuName()
    {
        return manuName;
    }
    public int getNumCylinders()
    {
        return numCylinders;
    }
    public Person getOwner()
    {
        return owner;
    }
    public void setManuName(String newManuName)
    {
        this.manuName = newManuName;
    }
    public void setNumCylinders(int newNumCylinders)
    {
        this.numCylinders = newNumCylinders;
    }
    public void setOwner(Person newOwner)
    {
        this.owner = newOwner;
    }
    public String toString()
    {
        return ("This car's manufacturer is " + manuName + ", it has " + numCylinders + " cylinders, and the owner of the vehicle is " + owner.toString() + ".");
    }
    public boolean equals(Object other)
    {
        if ((other != null) && (other.getClass() == Vehicle.class) && (this.manuName.equals(((Vehicle) other).getManuName())) && (this.numCylinders == ((Vehicle) other).getNumCylinders()) && (this.owner.equals(((Vehicle) other).getOwner())))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Person person = new Person("Surya");
        System.out.println("Before changing: " + person.toString());
        person.setName("Mr. P");
        System.out.println("After changing: " + person.toString());

        Vehicle vehicle = new Vehicle("Honda", 4, person);
        Person person2 = new Person("Spongebob");
        System.out.println("Before changing: " + vehicle.toString());
        vehicle.setManuName("Hyundai");
        vehicle.setNumCylinders(6);
        vehicle.setOwner(person2);
        System.out.println("After changing: " + vehicle.toString());

        Vehicle vehicle2 = new Vehicle("BMW", 8, person2);
        System.out.println("This should say false: " + vehicle2.equals(vehicle));
        System.out.println("This should say true: " + vehicle2.equals(vehicle2));

        Person person3 = new Person("Snoopy");
        Truck truck = new Truck(vehicle.getManuName(), vehicle2.getNumCylinders(), person3, 4501.5, 20000);
        System.out.println(truck.toString());
        truck.changeLoadCapacity(505.5);
        truck.changeTowingCapacity(2000);
        System.out.println("This is the new load capacity: " + truck.getLoadCapacity());
        System.out.println("This is the new towing capacity: " + truck.getTowingCapacity());

        System.out.println("Thanks for using my 'Vehicle' program!");
    }
}

class Truck extends Vehicle
{
    private double loadCapacity;
    private int towingCapacity;
    public Truck(String manuname, int numcylinders, Person owningperson, double loadcapacity, int towingcapacity)
    {
        super(manuname, numcylinders, owningperson);
        this.loadCapacity = loadcapacity;
        this.towingCapacity = towingcapacity;
    }
    public Truck(String manuname, int numcylinders, Person owningperson)
    {
        super(manuname, numcylinders, owningperson);
    }
    public double getLoadCapacity()
    {
        return loadCapacity;
    }
    public int getTowingCapacity()
    {
        return towingCapacity;
    }
    public void changeLoadCapacity(double newLoadCapacity)
    {
        this.loadCapacity = newLoadCapacity;
    }
    public void changeTowingCapacity(int newTowingCapacity)
    {
        this.towingCapacity = newTowingCapacity;
    }
    @Override
    public String toString()
    {
        return ("This truck was manufactured by " + this.getManuName() + " and has " + this.getNumCylinders() + " cylinders. It has a load capacity of " + loadCapacity + " and a towing capacity of " + towingCapacity + ".");
    }
    @Override
    public boolean equals(Object other)
    {
        if ((other != null) && (other.getClass() == Truck.class) && (loadCapacity == ((Truck) other).getLoadCapacity()) && (towingCapacity == ((Truck) other).getTowingCapacity()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}