class Animal {
    String name;

    void makeSound() {
        System.out.println("Some generic sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy"; 
        myDog.makeSound(); 
        myDog.bark(); 
    }
}

