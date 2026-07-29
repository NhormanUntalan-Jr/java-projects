// Date: 05/19/2026
// File: ShapeComparator.java
// Name: Nhorman Untalan Jr.

// Imports the Comparator interface
import java.util.Comparator;

// Driver class
public class ShapeComparator implements Comparator<Shape>
{
   
   // Overridden method to compare the areas of two shapes
   public int compare(Shape s1, Shape s2)
   {
      if (s1.getArea() < s2.getArea())
      {
         return -1;
      }
      
      if (s1.getArea() > s2.getArea())
      {
         return 1;
      }
      
      return 0;
   }
   
   // Determines if two shapes are equal based on their perimeter
   public boolean equals(Shape s1, Shape s2)
   {
      return s1.getPerimeter() == s2.getPerimeter();
   }
}