import java.util.Scanner;

public class deepti2 {
    public static void main(String[] args) {
        //  int arr[] = {10,20,30,40,50,-2};
        //  System.out.println("maximum value: ");
        //  int maxi = Integer.MIN_VALUE;
        //  for(int num : arr){
        //     if(num > maxi){
        //         maxi = num;
        //     }
        //  }
        //  System.out.println("maximum number: " +maxi);

         //System.out.println("minimum value: ");
        //  int mini = Integer.MAX_VALUE;
        //  for(int num: arr){
        //     if(num<mini){
        //        mini = num;
        //     }
        //  }
        //  System.out.println("minimum number: " + mini);
        // taking input in array
        // int size;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of array");
        // size = sc.nextInt();
        // int arr[] = new int[size];
        // for(int count=1; count<=size; count++){
        //     int index = count-1;
        //     System.out.println("enter the value for index: "+index);
        //     arr[index] = sc.nextInt();
        // }

        //printing the array 
        // int sum = 0;
        // for(int n:arr){
        //     sum+=n;
        // }
        // System.out.println("total sum: "+sum);
        // for(int n=0; n<=size-1; n++){
        //     System.out.println(arr[n]);
        // }

        // 2d array
        // creation
        // int arr[][] =new int[4][5];

        // initilization
        // int arr[][]={
        //     {2,4,5,8},
        //     {7,8,9,10},
        //     {6,7,5,5}
        // };

        // printing  the arrray
        // for(int temp[]: arr){
        //     for(int num:temp){
        //         System.out.println(num);
        //     }
        // }

        // int rowsize = arr.length;
        // int colsize = arr[1].length;

        // int sum=0;
        // for(int rowindex=0; rowindex<=rowsize-1; rowindex++){
        //     for(int colindex=0; colindex<=colsize-1; colindex++){
        //         sum = sum + arr[rowindex][colindex];
        //     }
        // }
        // System.out.println(sum);
        // System.out.println(rowsize);
        // System.out.println(colsize);
        // for(int rowindex=0; rowindex<=rowsize-1; rowindex++){
        //     // jis bhi row per tum ho , uske liyesabhi columns per jao
        //     for(int colindex=0; colindex<=colsize-1; colindex++){
        //         System.out.println(arr[rowindex][colindex] + " ");
        //     }
        // System.out.println();
        // }
    //    int arr[] =  {10,20,30,40,50};
        //    int size;
        //    Scanner sc = new Scanner(System.in);
        //    System.out.println("enter the  size of array: ");
        //    size =   sc.nextInt();
        //    int arr[] = new int[size];
        // for(int count=1; count<=size; count++){
        //     int index = count-1;
        //     System.out.println("enter the  array for index: " +index);
        //     arr[index] = sc.nextInt();
        // }
        // int multi = 1;
        //  for(int num:arr){
        //     multi = multi*num;
            
        //  }
        //  System.out.println(multi);
        // for(int num=0; num<size; num++){
        //     System.out.println(arr[num]);
        // }

        int row;
        int col;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter te size of row: ");
        row = sc.nextInt();
        System.out.println("enter the sizr of col: ");
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                int rowindex = i-1;
                int colindex = j-1;
                System.out.println("enter the 2d  array for  rowindex:"+rowindex + " colindex:" +colindex);
                arr[rowindex][colindex] = sc.nextInt();
            }
        }
        // for(int temp[]:arr){
        //     for(int num:temp){
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }
        for(int temp=0; temp<row; temp++){
            for(int num=0; num<col; num++){
                System.out.print(arr[temp][num] + " ");
            }
            System.out.println();
        }
    }
}
