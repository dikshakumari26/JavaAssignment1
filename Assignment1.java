import java.util.Scanner;
public class Assignment1{
    /**
     * @param args
     */
    public static void main (String args[]){
        // Create a Scanner object to read input
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the length of the rectangle: ");
       int length = scanner.nextInt();
       System.out.println("Enter the breadth of the rectangle: ");
       int breadth = scanner.nextInt();
       scanner.close();
       // Calculate area and perimeter
     int area = length*breadth;
     int perimeter = 2 * (length + breadth);
     // Display the results
     System.out.println("Area of the rectangle: " + area);
     System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}