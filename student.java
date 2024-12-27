public class student {
    //Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getname(){
        return this.name;
    }

    public int getage(){
        return this.age;
    }

    public void setage(int a){
        // extra layer of authantication
        if(age< 100)
           this.age = a;
        return;
    }


    // Default ctor / attr --> garbage
    public student(){
        System.out.println("student Default ctor called");
    }

    // parameterised ctor
        public student(int id , int age,String name,int nos,String gf){
        System.out.println("student parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos= nos;
        this.gf = gf;
    }

    // copy ctor
    public student(student srcobj){       // srcobj = A
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }


    // Methods / Behavior
    public void study(){
        System.out.println(name + " studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunk(){
        System.out.println(name + " bunking");
    }
    private void gf(){
        System.out.println(name + " gfChatting");
    }
}
