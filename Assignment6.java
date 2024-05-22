import java.util.Scanner;
public class Assignment6 {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
     
        System.out.print("Enter the value of x:");
      double x= scanner.nextDouble();
      scanner.close();
      double calculate= Math.pow(x,5);
      System.out.println("Power of x:"+ calculate);

    }
    
}
