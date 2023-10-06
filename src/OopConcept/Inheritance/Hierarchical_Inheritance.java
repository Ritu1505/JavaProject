package OopConcept.Inheritance;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
    static class Animal{
        void eat(){System.out.println("eating...");}
    }
    static class Dog extends Animal{
        void bark(){System.out.println("barking...");}
    }
    static class Cat extends Animal{
        void meow(){System.out.println("meowing...");}
    }
}
