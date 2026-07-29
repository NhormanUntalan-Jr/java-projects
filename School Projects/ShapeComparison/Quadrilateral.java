// Date: 05/19/2026
// File: Quadrilateral.java
// Name: Nhorman Untalan Jr.

// Subclass of Shape
public abstract class Quadrilateral extends Shape
{
   
   // Private fields added onto Shape's fields
   private double height;
   private double width;
   
   // Constructor that takes two arguments
   public Quadrilateral(double height, double width)
   {
      super();
      this.height = height;
      this.width = width;
   }
   
   // Getter methods
   public double getHeight()
   {
      return height;
   }
   
   public double getWidth()
   {
      return width;
   }
}