// Date: 05/19/2026
// File: Circle.java
// Name: Nhorman Untalan Jr.

// Subclass of Shape
public class Circle extends Shape
{
   
   // Private field added onto Shape's fields
   private double radius;
   
   // Constructor that takes one argument
   public Circle(double radius)
   {
      super();
      this.radius = radius;
   }
   
   // Getter method
   public double getRadius()
   {
      return radius;
   }
   
   // Getter methods that calculate area and perimeter
   public double getArea()
   {
      return Math.PI * radius * radius;
   }
   
   public double getPerimeter()
   {
      return 2 * Math.PI * radius;
   }
   
   // Displays the type of shape (Circle)
   public String getShapeType()
   {
      return "Circle";
   }
}