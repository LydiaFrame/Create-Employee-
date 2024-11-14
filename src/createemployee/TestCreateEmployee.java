/*
 * Program: TestCreateEmployee.java
 * Student: Lydia Frame 
 * Purpose: Demonstrates creation and use of an array of Employee objects
 *          and calls a method on each to perform a task.
*/

import java.util.Scanner; // Import the Scanner class

public class TestCreateEmployee {

    public static void main(String[] args) {

        // Create an array to hold Employee class objects
        Employee allEmployees[] = new Employee[3];

        // Populate the array with objects of subclasses of Employee
        allEmployees[0] = new Bagger();  // Create and add a Bagger object
        allEmployees[1] = new Cashier(); // Create and add a Cashier object
        allEmployees[2] = new Manager(); // Create and add a Manager object

        // Loop through the array and call the `call` method on each Employee
        for(int i = 0; i < allEmployees.length; i++){
            allEmployees[i].call(); // Calls the overridden `call` method for each object
        }

    }
}