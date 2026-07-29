// Date: 05/19/2026
// File: Rectangle.java
// Name: Nhorman Untalan Jr.

// Subclass of Quadrilateral
public class Rectangle extends Quadrilateral
{
   
   // Constructor that takes two arguments
   public Rectangle(double height, double width)
   {
      super(height, width);
   }
   
   // Getter methods that calculate area and perimeter
   public double getArea()
   {
      return super.getHeight() * super.getWidth();
   }
   
   public double getPerimeter()
   {
      return 2 * getHeight() + 2 * super.getWidth();
   }
   
   // Displays the type of shape (Rectangle)
   public String getShapeType()
   {
      return "Rectangle";
   }
}