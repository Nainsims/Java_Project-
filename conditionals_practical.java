import java.util.Scanner;

public class conditionals_practical {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }



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



        System.out.println("enter lower case character: ");
        char lowercaseChar = sc.next().charAt(0);
        if(lowercaseChar >= 'a' && lowercaseChar <= 'z'){
            char uppercaseChar = (char)(lowercaseChar-('a'-'A'));
            System.out.println(uppercaseChar);
        }
        else{
            System.out.println("not a valid input");
        }


        System.out.println("enter upper case character: ");
        char uppercase = sc.next().charAt(0);
        if(uppercase >= 'A' && uppercase <= 'Z'){
            char lowercase = (char)(uppercase-('A'-'a'));
            System.out.println(lowercase);
        }
        else{
            System.out.println("not a valid input");
        }

        


        System.out.println("enter your first subject number is: ");
        int marks1 = sc.nextInt();
        System.out.println("enter your second subject number is: ");
        int marks2 = sc.nextInt();
        System.out.println("enter your third subject number is: ");
        int marks3 = sc.nextInt();
        System.out.println("enter your fourth subject number is: ");
        int marks4 = sc.nextInt();
        System.out.println("enter your fifth subject number is: ");
        int marks5 = sc.nextInt();
        int leastScore = Math.min(Math.min(Math.min(marks1, marks2),Math.min(marks3, marks4)),marks5);
        int sumtopfour = marks1+marks2+marks3+marks4+marks5-leastScore;
        float per = sumtopfour/4f;
        System.out.println("the pecentage is: "+ per);

        
        
     }
}
