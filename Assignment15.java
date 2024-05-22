import java.util.Scanner;
public class Assignment15 {
    public static void main (String args[]){
    Scanner scanner= new Scanner(System.in);
    System.out.print("Enter three digit number: ");
    int number = scanner.nextInt();
    scanner.close();
    if (number>=100 && number<=999){
        int first_number= number/100;
        int second_number= (number/10)%10;
        int third_number= number%10;
        int sum = first_number+ second_number+ third_number;
        System.out.println("Sum of digits: "+ sum);
    }
else {
    System.out.println("Invalid input");
}
    }

}
