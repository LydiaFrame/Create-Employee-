/*
 * Subclass: Manager.java
 * Purpose: Represents a Manager, a specific type of Employee
 */

 public class Manager extends Employee {

    // Overrides the call method to provide specific behavior for Manager
    @Override
    public void call() {
        System.out.println("Call a manager for help!"); // Message specific to Manager
    }
}

