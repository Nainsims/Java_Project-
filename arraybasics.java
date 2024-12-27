public class arraybasics {
     public static void main(String[] args) {
        //declaration
        int arr[];
        // int[] arr;

        //allocation
        arr = new int[10];

        //initilization
        int marks[] = {100,99,98,100,99};
        int n = marks.length;
        //using for loop to print entire array
        System.out.println("normal for loop: ");
        for(int index=0; index<=n-1; index++){
            System.out.println(marks[index]);
        }

        System.out.println("for each loop: ");
        for(int number : marks){
            System.out.println(number);
        }
        System.out.println(marks.length);
        System.out.println("first element: " +marks[0]);
        System.out.println("second element: " +marks[1]);
        System.out.println("third element: " +marks[2]);
        System.out.println("fourth element: " +marks[3]);
        System.out.println("fifth element: " +marks[4]);
     }
}
