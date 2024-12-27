public class student1 {
    // Atributes
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
       // extra layer of authentication
        if(age<100)
          this.age = a;
        return;
    }


    // default construtor
    public student1(){
        System.out.println("default ctor called");
    }

    // parameterised  ctor
    public student1(int id, int age,String name,int nos, String gf){
        System.out.println("parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf =  gf;
       

    }
      

    // copy ctor
    public student1(student1 srcobj){
        System.out.println("copy ctor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }
    // Methods / behaviour
    public void study(){
        System.out.println(name + " Study");
    }

    public void sleep(){
        System.out.println(name +" sleeping");
    }

    public void bunk(){
        System.out.println(name + " bunk");
    }

    private void gf(){
        System.out.println(name + " gfchatting");
    }

    
}
