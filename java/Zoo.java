class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Lion roars");
    }
}
class Monkey extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Monkey chatters");
    }
}
class Elephant extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets");
    }
}
public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal monkey = new Monkey();
        Animal elephant = new Elephant();
        lion.makeSound();
        monkey.makeSound();
        elephant.makeSound();
    }
}
