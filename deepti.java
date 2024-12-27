public class deepti {
     public static void main(String[] args) {
        // Declaration
        int arr[];

        // Allocation
        arr = new int[5];

        // initilization
        int marks[] = {100,98,99,100,99};
        System.out.println(marks.length);
        System.out.println("first element: "+marks[0]);
        System.out.println("second element: "+marks[1]);
        System.out.println("third element: "+marks[2]);
        System.out.println("fourth element: "+marks[3]);
        System.out.println("fifth element: "+marks[4]);
        int n = marks.length;
        System.out.println("using for loop to entire array: ");
        for(int index=0;index<=n-1; index++){
            System.out.println(marks[index]);
        }
        System.out.println("for each loop: ");
        for(int num:marks){
            System.out.println(num);
        }

     }
}
