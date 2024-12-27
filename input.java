import java.math.BigInteger;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        // create a object of scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age:");
        int age = sc.nextInt();
         
        System.out.println("enter your float: ");
        float f = sc.nextFloat();

        // System.out.println("enter your hasnextint: ");
        // boolean check = sc.hasNextInt();

        System.out.println("enter your bigintegar: ");
        BigInteger bg = sc.nextBigInteger();

        System.out.println("my age is: "+age);
        System.out.println("my float is: "+f);
        // System.out.println("my hasnextint is: "+check);
        System.out.println("my bigintegar is: " +bg);
        

        sc.close();

    }
}
