package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data: ");

            //Escolhe se é terceiro ou não
            System.out.print("Outsourced (y/n)? ");
            sc.nextLine();
            String choiceOutsourced = sc.nextLine();

            //Insere o name
            System.out.print("Name: ");
            String name = sc.nextLine();


            //Insere a hour
            System.out.print("Hours: ");
            int hours = sc.nextInt();

            //Insere valor por hour
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            //Valida se é necessario adicionar atualizacao
            if (choiceOutsourced.equalsIgnoreCase("y")){
                System.out.print("Additional change: ");
                double addtionalChange = sc.nextDouble();
                listEmployees.add(new OutsourcedEmployee(name, hours, valuePerHour, addtionalChange));
            } else {
                listEmployees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS:");

        /*
        Criado uma lista com n itens, dentro dessa lista pode conter dois tipos de objetos,
        OutsourcedEmployee ou Employee, de acordo com o que é definido no input.

        Ao interar pela lista e passar pelo OutsourcedEmployee chamando o metodo payment é chamado
        o metodo sobreescrito.
        */
        for (Employee employees : listEmployees) {
            System.out.println(employees.getName() + " - $ " + String.format("%.2f", employees.payment()));
        }

        sc.close();
    }
}
