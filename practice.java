import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1 = 3;
       int num2 = 6;
       int num3 = 9;
       int sum1 = num1+num2+num3;
       System.out.println(sum1);

       float a = 56;
       float b = 78;
       float c = 89;
       float cgpa = (a+b+c)/30;
       System.out.println(cgpa);


      System.out.println("enter your name: ");
      String name = sc.nextLine();
      System.out.println("hello "+ name +", have a good day.");

      System.out.println("enter the kilometers: ");
      float km = sc.nextFloat();
      float ms = km*0.621371f;
      System.out.println(km + " kilometer is equal to " + ms +" miles");


      System.out.println("enter your first subject number is: ");
      int sub1 = sc.nextInt();
      System.out.println("enter your second subject number is: ");
      int sub2 = sc.nextInt();
      System.out.println("enter your third subject number is: ");
      int sub3 = sc.nextInt();
      System.out.println("enter your fourth subject number is: ");
      int sub4 = sc.nextInt();
      System.out.println("enter your fifth subject number is: ");
      int sub5 = sc.nextInt();
      System.out.println("my first subject number is: "+sub1);
      System.out.println("my second subject number is: "+sub2);
      System.out.println("my third subject number is: "+sub3);
      System.out.println("my fourth subject number is: "+sub4);
      System.out.println("my fifth subject number is: "+sub5);
      int sum = sub1+sub2+sub3+sub4+sub5;
      System.out.println("the sum of these subject is: "+sum);
      float percentage = sum*100/500;
      System.out.println("the percentage of these sum: "+ percentage +"%");

      System.out.println("enter the number: ");
      System.out.println(sc.hasNextInt());

    }
}
