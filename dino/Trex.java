/* Alta3 Researchstop inheritance from a class with final – Save this file as Trex.java */
// parent class: Dinosaur
final class Dinosaur {   
    protected String species = "Generic Dinosaur"; // Dinosaur attribute
    public void roar() {  
        System.out.println("Roooaaarrr!");
    }
}
class Trex extends Dinosaur {
    private String name = "Tyrannosaurus Rex"; // Trex attribute
    public static void main(String[] args) {
        Trex myTrex = new Trex(); // Create a Trex object
        myTrex.roar(); // Call the roar() method (from the Dinosaur class) on the myTrex object
        // Display the value of the species attribute (from the Dinosaur class) and the value of the name from the Trex class
        System.out.println("Species: " + myTrex.species);
        System.out.println("Dinosaur Name: " + myTrex.name);
    }
}

