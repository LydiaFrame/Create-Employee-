/*
 * Subclass: Bagger.java
 * Purpose: Represents a Bagger, a specific type of Employee
 */

 public class Bagger extends Employee {

    // Overrides the call method to provide specific behavior for Bagger
    @Override
    public void call() {
        System.out.println("Call a bagger for help!"); // Message specific to Bagger
    }
}

