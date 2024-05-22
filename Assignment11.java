import java.util.Scanner;
public class Assignment11 {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the value of Fahrenheit:");
        int fahrenheit= scanner.nextInt();
        scanner.close();
        int celsius=(fahrenheit-32)*5/9;
        System.out.println("Fahrenheit to Celsius: "+ celsius);

    }
    
}
