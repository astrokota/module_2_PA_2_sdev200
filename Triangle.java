import java.util.Scanner;

//Triangle class, derived from GeometricObject
public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    //no arg constructor for default triangle instance
    public Triangle() {
    }
  
    //constructor with args for specific side values
    public Triangle(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }
  
    //get methods for each side of triangle
    public double getSide1() {
      return side1;
    }
  
    public double getSide2() {
      return side2;
    }
  
    public double getSide3() {
      return side3;
    }
  
    //method for area of triangle given by textbook
    public double getArea() {
      double s = (side1 + side2 + side3) / 2; //semi-perimeter
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
  
    //method for perimeter of triangle
    public double getPerimeter() {
      return side1 + side2 + side3;
    }
  
    //override method to return string description for triangle
    @Override
    public String toString() {
      return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
  
    //test program with user input 
    public static void main(String[] args) {
      
      //create scanner object (user input)
      Scanner input = new Scanner(System.in);
  
      //user prompt for sides of triangle
      System.out.print("Enter side 1: ");
      double side1 = input.nextDouble();
      System.out.print("Enter side 2: ");
      double side2 = input.nextDouble();
      System.out.print("Enter side 3: ");
      double side3 = input.nextDouble();
  
      //user prompt for color of triangle
      System.out.print("Enter the color: ");
      String color = input.next();
  
      //user prompt for filling of triangle
      System.out.print("Enter if triangle is filled or not (true/false): ");
      boolean filled = input.nextBoolean();
  
      //create triangle instance with above input values
      Triangle triangle = new Triangle(side1, side2, side3);
      triangle.setColor(color);
      triangle.setFilled(filled);
  
      //display of user inputs and results
      System.out.println("\nTriangle Details:");
      System.out.println("Area: " + triangle.getArea());
      System.out.println("Perimeter: " + triangle.getPerimeter());
      System.out.println("Color: " + triangle.getColor());
      System.out.println("Filled: " + triangle.isFilled());
    }
  }
