import java.util.Random;
import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        // int arr[] = {10,20,30,40,50};
        // System.out.println("before");
        // printArr(arr);
        //   Scanner sc = new Scanner(System.in);
        //   System.out.println("enter the value of n: ");
        //   int n = sc.nextInt();
        //   int a=5;
        //   int b= 10;
        //   int mini = Math.min(a, b);
        //   System.out.println(mini);
        // System.out.println(10);
        // callMyname();
        // System.out.println(40);
        // int result = getsum(10, 20);
        // System.out.println("sum is: " +result);
        // callMyname("deepti");
        //  printName(n);
        // printSum(n);
        // double ans = getAvg(4, 5);
        // System.out.println(ans);
        // int mini = getMin(50,100);
        // System.out.println(mini);
        // int maxi = getMax(50, 100);
        // System.out.println(maxi);
        // int absolute = getAbs(-4);
        // System.out.println(absolute);
        // int exponent = getpow(2, 4);
        // System.out.println(exponent);
        // int rnd = getrandom(5);
        // System.out.println(rnd);
        //  int ans = getSum(arr);
        //  System.out.println(ans);
        //   int ans1 = getsum(arr);
        //   System.out.println(ans1);
        // getdblArray(arr);
        // System.out.println("after");
        // printArr(arr);
        // int n=10;
        System.out.println(getrandom(10));


    }
    public static void callMyname(){
        System.out.println(20);
        System.out.println("deepti");
        System.out.println(30);
    }

    public static int getsum(int a, int b){
        int sum = a+b;
        return sum;
    }


    public static void callMyname(String name){
        System.out.println("my name is: "+name);
    }

    public static void printName(int n){
        for(int num=1; num<=n; num++){
            System.out.println("deepti");
        }
    }

    public static void printSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("total sum is: " +sum);
    }

    public static double getAvg(int a,int b){
        double avg = (double)(a+b)/2;
        return avg;
    }

    public static int getMin(int a, int b){
        if(a<b){
            return a;
        }
        else{
            // agar number ek negative number hai
            return b;
        }
    }

    public static int getpow(int a, int b){
        int ans = 1;
        for(int i=1; i<=b; i++){
            ans = ans*a;
        }
        return ans;
    }
    

    public static int getMax(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int getAbs(int a){
        if(a>=0){
            return a;
        }
        else{
            return (0-a);
        }
    }

    // public static int getrandom(int n){
    //     for(int i=1; i<=n; i++){
    //         int ans = Math.random()*i;
    //     }
    //     return ans;
    // }

    public static void printArr(int arr[]){
        for(int num: arr){
            System.out.println(num);
        }
    }

    public static int getSum(int arr[]){
        int sum=0;
        int n = arr.length;
        for(int index=0; index<n; index++){
            sum = sum+arr[index];
        }
        return sum;
    }

    public static int getsum(int arr[]){
        int sum = 0;
        for(int element:arr){
            sum = sum+element;
        }
        return sum;
    }

    public static void getdbl(int arr[]){
        for(int element:arr){
             element =2*element;
            System.out.println(element);
        }
        
    }
    public static void getdblArray(int arr[]){
        for(int index=0; index<5; index++){
              arr[index] = 2*arr[index];
        }
    }

    public static int getrandom(int n){
        Random rand = new Random();
        int rnd =  rand.nextInt(n)+1;
        return rnd;
    }

   
}
