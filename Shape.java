public interface Shape 
{
    /*
     * Returns the area of the geometric shapes by utilizing the appropriate formulas.
     */
    public double area();
}

class Circle implements Shape
{
    private double radius;

    public Circle(double newRadius)
    {
        this.radius = newRadius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double newRadius)
    {
        this.radius = newRadius;
    }
    public double area()
    {
        return (Math.PI * this.radius * this.radius);
    }
}

class Rectangle implements Shape
{
    private double length, width;

    public Rectangle(double newLength, double newWidth)
    {
        this.length = newLength;
        this.width = newWidth;
    }
    public Rectangle(double newLength)
    {
        this.length = newLength;
    }
    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setLength(double newLength)
    {
        this.length = newLength;
    }
    public void setWidth(double newWidth)
    {
        this.width = newWidth;
    }
    public double area()
    {
        return (this.length * this.width);
    }
    public static void main(String[] args)
    {
       Circle c = new Circle(4); // Radius of 4 
       Rectangle r = new Rectangle(4,3); // Height = 4, Width = 3 
       showArea(c);
       showArea(r);
    }
    public static void showArea(Shape s)
    {     
      double area = s.area();
      System.out.println("The area of the shape is " + area);
    }
}