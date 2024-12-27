import java.util.Random;
import java.util.Scanner;

public class practice_function {
     public static void main(String[] args) {
        int a =2;
        int b =4;
        int mini = Math.min(a, b);
        System.out.println(mini);
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        // int anw = 1;
        // for(int count=1; count<=b; count++){
        //     anw = anw * a;
        // }
        // System.out.println(anw);
        // printname(n);
        //   printsum(n);
        // double ans = getAverage(5, 6);
        // System.out.println("average is: "+ans);
        // int mini = getMin(3, 9);
        // System.out.println("min value is: "+ mini);
        // int maxi = getMax(3, 9);
        // System.out.println(maxi);
        // int absolute = getAbs(4);
        // System.out.println(absolute);
        // int exponent = getpow(2, 4);
        // System.out.println(exponent);
        // if(n>=0){
        //     System.out.println(n);
        // }
        // else{
        //     System.out.println(0-n);
        //}
       int Random =  Getrandom(n);
       System.out.println(Random);

        
        // getrandom(n);
        // int n = 10;
        // System.out.println(getRandom(n));

     }

     public static void printname(int n){
        for(int i=1; i<=n; i++){
            System.out.println("deepti");
        }
     }

     public static void printsum(int n){
        int sum = 0;
        for(int num=1; num<=n; num++){
            sum = sum + num;
        }
        System.out.println("printing sum: "+sum);
     }

     public static double getAverage(int a,int b){
        double avg = (double)(a+b)/2;
        return avg;
     }

     public static int getMin(int a, int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }

     }

     public static int getMax(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
     }
     
     public static int getAbs(int number){
        if(number >= 0){
            return number;
        }
        else{
            //agar number ek negative number hai
            return (0-number);
        }
     }
     public static int getpow(int a, int b){
        int ans = 1;
        for(int count=1; count<=b; count++){
            ans = ans *a;
        }
        return ans;
     }

     public static int getrandom(int n){
        for(int i=0; i<n; i++){
            System.out.println(Math.random()*i);
        }
        return 0;
     }

     public static int getRandom(int n){
        Random rand = new Random();
        return rand.nextInt(n)+1;
    }

    public static int Getrandom(int n){
       int randomvalue = (int)(Math.random()*n)+1;
       return randomvalue;
    }
}
