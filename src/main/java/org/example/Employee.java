package org.example;

public class Employee {

    int id;
    static int nextId = 1;
    int maxHolidayDays = 26;
    int userHolidaysTaken = 0;

    Employee() {
        id = nextId;
        nextId++;
    }

    public boolean takeVacation(int days) {
        if (userHolidaysTaken + days <= maxHolidayDays) {
            userHolidaysTaken += days;
            System.out.println("Holidays of " + days + " days have been granted.");
            return true;
        } else {
            System.out.println("Cannot grant " + days + " days. User has only "
                    + (maxHolidayDays - userHolidaysTaken) + " days available.");
            return false;
        }
    }
}
