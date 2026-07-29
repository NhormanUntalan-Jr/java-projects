// Date: 05/14/2026
// File: Shape.java
// Name: Nhorman Untalan Jr.

// Abstract superclass that counts the number of shapes created
public abstract class Shape implements Comparable<Shape>
{
   
   // Private fields
   private static int numShapes = 0;
   private int id;
   
   // Constructor
   public Shape()
   {
      id = numShapes;
      numShapes++;
   }
   
   // Getter methods
   public static int getNumShapes()
   {
      return numShapes;
   }
   
   public int getID()
   {
      return id;
   }
   
   // Overriden method that compares the ID's of two shapes
   public int compareTo(Shape s)
   {
      return Integer.compare(id, s.getID());
   }
   
   // Overridden method that returns the Shape's ID number
   public String toString()
   {
      return "\nShape ID: " + id;
   }
   
   // Abstract methods to be overridden in the subclasses
   public abstract double getArea();
   
   public abstract double getPerimeter();
   
   public abstract String getShapeType();
}