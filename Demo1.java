class Animal{
    void sound(){
        System.out.println("Anuimal makes a sound");
    }
    }
class Dog extends Animal{
  //  @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Demo1 {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    myDog.sound();
  }
}
