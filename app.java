public class app {
    public static void main(String[] args) {
        // student A  = new student();
        // A.id = 1;
        // A.age = 14;
        // A.name = "xyz";
        // A.nos = 5;
        // System.out.println(A.id);
        // System.out.println(A.age);
        // System.out.println(A.name);
        // System.out.println(A.nos);

        // A.study();
        // A.bunk();
        // A.sleep();

        //parameterised ctor
        student A = new student(3,103,"abc",3,"ryg");
         // System.out.println(A.id);
        // System.out.println(A.getage());
        // A.setage(67);
        // System.out.println(A.getage());

        // System.out.println(A.getname());
        // System.out.println(A.nos);
        // System.out.println(A.gf);
        
        // A.bunk();
        // A.sleep();
        // A.study();
        // A.gfChatting();
        
        //copy ctor
        student B = new student(A);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.name);
        System.out.println(B.nos);


        // B.study();
        // B.sleep();
        // B.bunk();










        // default ctor
        // student1 A = new student1();
        // A.id = 1;
        // A.age = 15;
        // A.name = "xyz";
        // A.nos = 5;
        // System.out.println(A.id);
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.nos);

        // A.study();
        // A.bunk();
        // A.sleep();

        // parameterised ctor
        // student1 A = new student1(3,105,"abc",3,"hjygg");
        // System.out.println(A.getname());
        // System.out.println(A.id);
        // System.out.println(A.getage());
        // A.setage(23);
        // System.out.println(A.getage());
        // System.out.println(A.nos);
        // System.out.println(A.gf);
        // A.study();
        // A.bunk();
        // A.sleep();
        // A.gf();

        // copy ctor
        // student1 B = new student1(A);
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.id);
        // System.out.println(B.nos);
        // B.sleep();
        // B.study();
        // B.bunk();




    }
}
