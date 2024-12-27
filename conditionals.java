import java.util.Scanner;

public class conditionals {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int income;
        // System.out.println("enter your income: ");
        // income = sc.nextInt();

        //if statement
      // if(income>100000){
       //        System.out.println("you are rich");
     // }
     //else{
      //  System.out.println("you are not rich");
    // }
        //System.out.println("enter your age: ");
        //int age = sc.nextInt();
        //if (age>=18) {
         //   System.out.println("i am eligible to vote");
        //}

        //ternary operator
        // System.out.println((income>100000) ? "Ameer hu" : "Ameer nhi hu");
        // boolean ans = (10 > 20) ? true : false;
        // System.out.println(ans);


        // nested if-else
        // System.out.println("enter yur age: ");
        // int age = sc.nextInt();
        // System.out.println("drive: ");
        // boolean knowdriving = sc.nextBoolean();
        // if(age>18){
        //     System.out.println("your age is > 18");
        //     if(knowdriving){
        //         System.out.println("you can get a license");
        //     }
        //     else{
        //         System.out.println("you are not drive");
        //     }
        // }
        // else{
        //     System.out.println("your age is < 18");
        // }
         

        // logical operator
        // if(age > 18 && knowdriving){
        //     System.out.println("you will get a license");
        // }
        // else{
        //     System.out.println("either you are < 18 or you do not know how to drive");
        // }

        // if(age > 18 || knowdriving){
        //     System.out.println("you will get a license");
        // }
        // else{
        //     System.out.println("either you are < 18 or you do not know how to drive");
        // }
          

       // if-else if-else ladder
    //    if(income > 100000) {
    //         System.out.println("you are among top 5% indians");
    //    }
    //    else if(income > 90000){
    //     System.out.println("you are among top 10% indians");
    //    }
    //    else if(income > 50000){
    //     System.out.println("you are among top 20% indians");
    //    }
    //    else if(income > 30000){
    //     System.out.println("you are among top 40% indians");
    //    }
    //    else if(income > 20000){
    //     System.out.println("you are among top 50% indians");
    //    }
    //    else{
    //     System.out.println("aap khin to aa rhe");
    //    }

    // switch statement
    int day = sc.nextInt();
    // 1 -> monday
    // 2 -> tuesday
       switch (day) {
        case 1:
            System.out.println("monday");  
            break;    
        case 2:
            System.out.println("tuesday"); 
            break;
        case 3:
            System.out.println("wednesday"); 
            break;
        case 4:
            System.out.println("thursday"); 
            break;
        case 5:
            System.out.println("friday"); 
            break;
        case 6:
            System.out.println("saturday"); 
            break;
        case 7:
            System.out.println("sunday"); 
            break;
        default:
           System.out.println("sunday lelo");
       }
     }
}
