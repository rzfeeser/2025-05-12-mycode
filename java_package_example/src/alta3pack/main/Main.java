// alta3pack (folder)
// main (folder)
package alta3pack.main;

// alta3pack is a unique name (folder)
// service is buisness logic  (folder)
// MyClass is the class we want to import (filename)
import alta3pack.service.MyClass;

public class Main {
    // main method
    public static void main(String[] args) {
    // MyClass.javaCow();                  // would also works
    alta3pack.service.MyClass.javaCow();   // from the MyClass class we want the javaCow() method
    }
}
