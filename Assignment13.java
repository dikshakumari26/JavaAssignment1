import java.util.Scanner;
public class Assignment13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter five digit number: ");
        int number= scanner.nextInt();
        scanner.close();
        if( number>=10000 && number<=99999){    // To check whether the user has input 5 digit number or not.
        
            int firstDigit = number / 10000;  // Calculate the first digit
            int lastDigit = number  % 10;    // Calculate the second last digit
        
            int sum= firstDigit+lastDigit;  // Calculate the sum of first and last digit 
            System.out.println("Sum of first and last digit: "+sum);  // to display the results
        } 
else{
    System.out.println("Invalid input");
}
    }


}
    
