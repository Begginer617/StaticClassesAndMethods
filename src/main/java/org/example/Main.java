package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();


//        System.out.println("Id employee 1 " + " " + employee1.id);
//        System.out.println("Id employee 2 " + " " + employee2.id);
//        System.out.println("Id employee 3 " + " " + employee3.id);

        //System.out.println("Nastepne id to : " + employee1.nextId);

        // pole statyczne moze zostac pobrane w kontekscie klasy, podjac nazwe klasy.
//        System.out.println("Nastepne id to : " + Employee.nextId);

        employee1.takeVacation(5);
        employee1.takeVacation(5);
        employee1.takeVacation(6);
        employee1.takeVacation(30);


    }


}