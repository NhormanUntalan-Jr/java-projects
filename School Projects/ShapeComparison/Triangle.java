// Date: 05/19/2026
// File: Triangle.java
// Name: Nhorman Untalan Jr.

// Subclass of Shape
public class Triangle extends Shape
{
   
   // Private fields added onto Shape's fields
   private double height;
   private double baseWidth;
   private double side1Length;
   private double side2Length;
   
   // Constructor that takes 4 arguments
   public Triangle(double height, double baseWidth, double side1Length, 
                   double side2Length)
   {
      super();
      this.height = height;
      this.baseWidth = baseWidth;
      this.side1Length = side1Length;
      this.side2Length = side2Length;
   }
   
   // Getter methods
   public double getHeight()
   {
      return height;
   }
   
   public double getBaseWidth()
   {
      return baseWidth;
   }
   
   public double getSide1Length()
   {
      return side1Length;
   }
   
   public double getSide2Length()
   {
      return side2Length;
   }
   
   // Getter methods that calculate area and perimeter
   public double getArea()
   {
      return 0.5 * height * baseWidth;
   }
   
   public double getPerimeter()
   {
      return baseWidth + side1Length + side2Length;
   }
   
   // Displays the type of shape (Triangle)
   public String getShapeType()
   {
      return "Triangle";
   }
}