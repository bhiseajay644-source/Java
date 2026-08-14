package inheritance.animalsoundsystem;

class Animal{
    void makeSound(){

    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog says : Bark Bark!");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat says : Meow Meow!");
    }
}

class Cow extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cow Says : Moo Moo!");
    }
}
public class AnimalSoundSystem {
    public static void main(String[] args) {
        Animal Dog=new Dog();
        Dog.makeSound();
        Animal c=new Cat();
        c.makeSound();
        Animal cw=new Cow();
        cw.makeSound();
    }
}
