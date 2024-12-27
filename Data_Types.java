public class Data_Types {
   public static void main(String[] args) {
    // Boolean
       boolean found = true;
       boolean isavailable = false; 
       System.out.println(found);
       System.out.println(isavailable);

    // Char
    char ch = 'k';
    System.out.println("My character is: " + (char)(ch+2));

    //byte
    byte marks = 127;
    System.out.println(marks);

    //short
    short myWeight = 32000;
    System.out.println("my weight:" + myWeight);

    //integar
    int myHeight = 1000000;
    System.out.println("my height:"+ myHeight);

    // long
    long length = 1000000000000000L;
    System.out.println("my length: " + length);

    // decimal points
    float number = 3.1456789756667f;
    System.out.println("my number is: " + number);

    // double
    double percentage = 99.99876544322336886889999;
    System.out.println("my percentage: " + percentage);
 


    // datatype implict/explict Conversion

    // implicit conversion
    byte  num1 = 12;
    short num2 = num1;
    System.out.println(num2);
    int num3 = num2;
    System.out.println(num3);
    long num4 = num3;
    System.out.println("last num :" + num4);

    //explicit conversion
    int num = 100;
    char mych = (char)num;
    System.out.println(mych);

    int mynum = 500;
    byte mynum2 = (byte)mynum;
    System.out.println(mynum2);

   }
}
