/* Alta3 ResearchAbstract classes – Save this file as Main.java */
abstract class Dinosaur {
    // Abstract method (must be overridden in child classes)
    public abstract void makeSound();
}

// Child Class: Trex (inherits from Dinosaur)
class Trex extends Dinosaur {
    // Overriding the abstract method
    @Override
    public void makeSound() {
        System.out.println("The T-Rex roars: ROAAAR!!");
    }
}

// Child Class: Triceratops (inherits from Dinosaur)
class Triceratops extends Dinosaur {
    // Overriding the abstract method
    @Override
    public void makeSound() {
        System.out.println("The Triceratops bellows: GRUUMPH!!");
    }
}

// Main Class: Demonstrating Polymorphism with Abstract Class
class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Dinosaur myTrex = new Trex();
        Dinosaur myTriceratops = new Triceratops();

        // Displaying information and sounds of the dinosaurs
        myTrex.makeSound();
        
        myTriceratops.makeSound();
    }
}
