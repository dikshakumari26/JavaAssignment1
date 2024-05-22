import java.util.Scanner;
public class Assignment14 {
    public static void main (String args[]){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a four digit number: ");
    int number= scanner.nextInt();
    scanner.close();
    if (number<9999 && number>999){
        int firstDigit= number/1000;
        if(firstDigit<8){
            firstDigit+=2;
        }
        else {
            System.out.println("Invalid input");
        }
        int secondDigit= (number/100)%10;
        if( secondDigit<8){
            secondDigit+=2;
        }
        else{
            System.out.println( "Invalid input");
        }
        int thirdDigit= (number/10)%10;
        if (thirdDigit<8){
        thirdDigit+=2;
        }
        else{
            System.out.println("Invalid input");
        }
        int fourthDigit= number%10;
        if (fourthDigit<8){
            fourthDigit+=2;
        }
        else{
        System.out.println("Invalid input");
        }
        int result= firstDigit*1000+secondDigit*100+thirdDigit*10+fourthDigit;
        System.out.println("Final Result: " +result);
        }
       else{
        System.out.println("Invalid input");
       } 

    }
}
