import java.util.Scanner;

public class arraybasics_practice {
     public static void main(String[] args) {
         int arr[] = {100,50,20,150,-2,250,-5,-50,12,16};
        //  System.out.println("integar min value: ");
        // int mini = Integer.MAX_VALUE;
        // for(int num:arr){
        //     if(num<mini){
        //         mini = num;
        //     }
        // }
        // System.out.println("minimum number is: " +mini);
        // System.out.println("integar maximum value");
        // int maxi = Integer.MIN_VALUE;
        // for(int num:arr){
        //     if(num>maxi){
        //         maxi =  num;
        //     }
        // }
        // System.out.println("maximum number is: " +maxi);
        //  taking input in array
        // int size;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // size = sc.nextInt();
        // int arr[];
        // arr = new int[size];
        // for(int count=1; count<=size; count++){
        //      int index = count-1;
        //      System.out.println("enter the value for index: " +index);
        //      arr[index] = sc.nextInt();
        // }
        //printing the array
        // for(int n:arr){
        //     System.out.println(n);
        // }

        int sum = 0;
        for(int num:arr){
            sum = sum+num;;
        }
        System.out.println("total sum: " + sum);

        int multi = 1;
        for(int num:arr){
            multi = multi*num;
        }
        System.out.println("total multiply: "+multi);
     }
}
