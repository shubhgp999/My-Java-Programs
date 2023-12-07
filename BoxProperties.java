import java.util.Scanner;
public class BoxProperties{
  public static void main(String[] args)
  {
    // create a scanner object to read input
    Scanner scanner = new Scanner(System.in);
    // Prompt user to enter sides of the box
    System.out.println("Enter the value of side a  : ");
    double a = scanner.nextDouble();

    System.out.println("Enter the value of side b : ");
    double b = scanner.nextDouble();

    System.out.println("Enter the value of side c : ");
    double c = scanner.nextDouble();

    double volume = calculateVolume(a,b,c);
    double surfacearea = calculateSurfaceArea(a,b,c);
    
    scanner.close();
    
    System.out.println("Volume of Box : "+volume);
    System.out.println("Surface Area of Box : "+surfacearea);
  } // End of Main 
  // Define methods for calculating volume and surface area
  public static double calculateVolume(double a,double b,double c)
  {
    return a*b*c;
  }
  public static double calculateSurfaceArea(double a,double b,double c)
  {
    return 2*(a*b+b*c+c*a);
  }
} // end of class BoxProperties
