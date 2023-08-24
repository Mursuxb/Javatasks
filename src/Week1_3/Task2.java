package Week1_3;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Give binary number to be converted to decimal");
        String binaryString = input.nextLine();
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);
    }
}
