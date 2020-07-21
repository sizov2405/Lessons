package lesson7.homework;

import lesson7.homework.model.Employee;
import lesson7.homework.model.Office;

public class OfficeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Petya");
        Employee employee2 = new Employee("Tanya");
        Employee employee3 = new Employee("Vika");
        Employee employee4 = new Employee("Sergey");

        Office office = new Office();

        office.addToOffice(employee1);
        office.addToOffice(employee2);
        office.addToOffice(employee3);
        office.addToOffice(employee4);

        int number = 4;
        Employee petya = office.getEmployeeByID(number);
        if (petya != null) {
            System.out.println(petya.getFullName());
        } else{
            System.out.println("There is no employee with this ID " + number);
        }
    }
}
