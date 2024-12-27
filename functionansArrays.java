public class functionansArrays {
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50};
        // printArray(arr);
        // int total = getArraysum(arr);
        // System.out.println(total);
        System.out.println("Before");
        printArray(arr);
        
        // double the array values
        doubleArrayvalues(arr);

        System.out.println("After");
        printArray(arr);

    }

    public static void printArray(int arr[]){
        for(int element:arr){
            System.out.println(element);
        }
    }

    public static int getArraysum(int arr[]){
        int sum=0;
        for(int element:arr){
            sum = sum+element;
        }
        return sum;
    }

    public static void doubleArrayvalues(int arr[]){
        int n = arr.length;
        for(int index=0; index<n; index++){
            arr[index] = 2*arr[index];
        }
    }
}
