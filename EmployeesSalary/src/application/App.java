package application;

import entities.SalaryOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int numberEmployees;
        int id;
        String name;
        double salary;
        double percentage;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<SalaryOption> employeesList = new ArrayList<>();

        System.out.println("How many employees will be registered? ");

        numberEmployees = sc.nextInt();

        for (int i = 1; i <= numberEmployees; i++) {
            System.out.println("\nEmployee: " + i);

            //Preenchimento do ID
            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();

            //Preenchimento do Name
            System.out.print("Name: ");
            name = sc.nextLine();

            //Preenchimento do Salary
            System.out.print("Salary: ");
            salary = sc.nextDouble();

            employeesList.add(new SalaryOption(id, name, salary));
        }

        System.out.println("\nEnter the employee id that will have salary increase: ");
        id = sc.nextInt();

        int hasIdSalary = hasId(employeesList, id);
        if (hasIdSalary == -1){
            System.out.println("This id does nor exist!");
        }
        else{
            System.out.println("\nEnter the percentage: ");
            percentage = sc.nextDouble();

            employeesList.get(hasIdSalary).incrementSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (SalaryOption employee : employeesList){
            System.out.println(employee);
        }
    }

    public static int hasId(List<SalaryOption> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }
}
