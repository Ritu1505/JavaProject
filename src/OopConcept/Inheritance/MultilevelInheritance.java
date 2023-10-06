package OopConcept.Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
    static class Animal{
        void eat(){
            System.out.println("eating...");
        }
    }
    static class Dog extends Animal{
        void bark(){
            System.out.println("barking...");
        }
    }
    static class BabyDog extends Dog{
        void weep(){
            System.out.println("weeping...");
        }
    }
}
