import java.util.Scanner;
public class Assignment5 {
    /**
     * @param args
     */
    public static void main(String args[]){
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();
if (number1==number2){ //  Check number is equal or not
    System.out.println("Number is equal"); // Display the results
}
else {
    System.out.println("Number is not equal"); // Display the results
     }
}
} 
