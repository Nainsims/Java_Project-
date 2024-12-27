public class loop {
     public static void main(String[] args) {
        // for loop
        // for(int count = 1; count<=10; count=count+1){
        //     if(count == 3){
        //         break;
        //     }
        //     System.out.println(count);
        // } 

        for(int i = 1; i<= 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

        // for(int i = 1; i<=10; i=i+1){
        //     System.out.println(5*i);
        // }

        //nested for loop
        // for(int i=1; i<=3; i++){
        //     for(int j=1; j<=2; j++){
        //         System.out.println("i="+i + " " + "j="+j);
        //     }
        // }

     }
}
