public class Person 
{
    private String name;
    public Person(String theName, Person theObject)
    {
        this.name = theName;
    }
    public Person(String theName)
    {
        this.name = theName;
    }
    public Person(Person theObject)
    {
        if (theObject != null)
            this.name = theObject.getName();
    }
    public String getName()
    {
        return name;
    }
    public void setName(String theName)
    {
        this.name = theName;
    }
    public String toString()
    {
        return name;
    }
    public boolean equals(Object other)
    {
        if ((other != null) && (other.getClass() == Person.class))
        {
            if (this.name.equals(((Person) other).getName()))
            {
                return true;
            }
        }  
        return false;
    }
}