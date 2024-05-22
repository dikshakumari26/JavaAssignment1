import java.util.Scanner;
public class Assignment16 {
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= scanner.nextInt();
        scanner.close();
        if(number!=0 && number>=9){
            int first_number= number/100;
            int second_number= (number/10)%10;
            int third_number= number%10;
            int reversed= (third_number*100)+(second_number*10)+ first_number;
            System.out.println("Reversed number: "+ reversed);
    } else{
        System.out.println("Invalid output");
    }

}
}
