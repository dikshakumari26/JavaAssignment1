import java.util.Scanner;
public class Assignment2 {
    public static void main (String args[]){
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = scanner.nextInt();
        scanner.close();
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }  
}
