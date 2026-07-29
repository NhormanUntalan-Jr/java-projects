// Date: 05/19/2026
// File: Square.java
// Name: Nhorman Untalan Jr.

// Subclass of Rectangle
public class Square extends Rectangle
{
   
   // Constructor that takes two arguments
   public Square(double size)
   {
      super(size, size);
   }
   
   // Displays the type of shape (Square)
   public String getShapeType()
   {
      return "Square";
   }
}