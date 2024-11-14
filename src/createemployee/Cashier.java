/*
 * Subclass: Cashier.java
 * Purpose: Represents a Cashier, a specific type of Employee
 */

 public class Cashier extends Employee {

    // Overrides the call method to provide specific behavior for Cashier
    @Override
    public void call() {
        System.out.println("Call a cashier for help!"); // Message specific to Cashier
    }
}

