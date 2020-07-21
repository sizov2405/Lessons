package lesson7.homework.model;

public class Employee {
    private static int employeeIdCounter = 1;
    private int emplyeeId;
    private String fullName;

    public Employee(String fullName){
        this.fullName = fullName;
        emplyeeId = employeeIdCounter;
        employeeIdCounter++;
    }

    public int getEmplyeeId() {
        return emplyeeId;
    }

    public String getFullName() {
        return fullName;
    }

}

