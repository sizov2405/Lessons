package lesson7.homework.model;

public class Office {
    private Employee[] employees = new Employee[12];
    private int employeeCounter = 0;

    public void addToOffice(Employee employee) {
        if (employeeCounter < employees.length) {
            employees[employeeCounter] = employee;
            employeeCounter++;
            System.out.println("we have " + employeeCounter + " employees in the office");
            return;
        }
        System.out.println("Office is full. We can't hire a new employee " + employee.getFullName());
    }

    public Employee getEmployeeByID(int employeeID){
        for(Employee employee : employees){
            if(employee != null && employeeID == employee.getEmplyeeId()){
                return employee;
            }

        }
        return null;
    }
}
