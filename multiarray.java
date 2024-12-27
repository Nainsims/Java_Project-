public class multiarray {
    public static void main(String[] args) {
        // creation
        //int arr[][] = new int[4][5];
       
        //initilization
        int arr[][] = {
            {2,4,6,8},
            {1,3,5,7},
            {10,20,3,90}
        };

        int rowsize = arr.length;
        int colsize = arr[0].length;
        // System.out.println(rowsize + "  " + colsize);

        int sum = 0;
        for(int rowindex=0; rowindex<rowsize; rowindex++){
            for(int colindex=0; colindex<colsize; colindex++){
                sum = sum + arr[rowindex][colindex];
            }
        }
        System.out.println("overall sum: " +sum);

        // for(int rowindex=0; rowindex<rowsize; rowindex++){
        //     //jis bhi row per tum ho uske liye sabhi row per jao
        //     for(int colindex=0; colindex<colsize; colindex++){
        //         System.out.println(arr[rowindex][colindex] + " ");
        //     }
            //    System.out.println();
        // }
        // printing the array
        // for(int[] temp : arr){
        //     for(int num : temp){
        //         System.out.println(num);
        //     }
        // }
    }
}
