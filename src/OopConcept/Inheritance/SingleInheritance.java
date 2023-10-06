package OopConcept.Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
    static class Animal{
        void eat(){System.out.println("eating...");}
    }
    static class Dog extends Animal{
        void bark(){System.out.println("barking...");}
    }
}
