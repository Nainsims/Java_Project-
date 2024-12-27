public class Operators {
     public static void main(String[] args) {
        // Arithmetic Operator
        int num1 = 30;
        int num2 = 20;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println((double)num1/num2);
        System.out.println(num1%num2);

        // Relational and comparision operator
        int a = 10;
        int b = 20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a == b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a != b);

        // Logical operator
        int x = 10;
        int y = 20;
        int z = 30;
        boolean cond1 = (x > y);
        boolean cond2 = (y < z);
        boolean cond3 = (x < z);
        boolean answer1 = cond1 && cond2 && cond3;
        System.out.println(answer1);
        boolean answer2 = cond1 || cond2 || cond3;
        System.out.println(answer2);
        boolean answer3 = !cond1;
        System.out.println(answer3);


        // Assignment operator
        int age = 12;
        //age = age +8;
        age+=8;
        System.out.println(age);

       // age = age - 1;
       age-=1;
        System.out.println(age);

        //age = age *10;
        age*=10;
        System.out.println(age);

        // age = age /10;
        age/=10;
        System.out.println(age);

        // age = age%5;
        age%=5;
        System.out.println(age);

        //Unary Operator
        int value = 5;
        System.out.println(value++);
        System.out.println(value);
        System.out.println(++value);

        System.out.println(value--);
        System.out.println(value);
        System.out.println(--value);
     }
}
     

