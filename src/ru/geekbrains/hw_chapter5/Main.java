package ru.geekbrains.hw_chapter5;

public class Main {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov", "I.", "worker", "1@mail.ru", "123", 1, 30);
        employeesArray[1] = new Employee("Petrov", "P.", "manager", "1@mail.ru", "123", 1, 20);
        employeesArray[2] = new Employee("Sidorov", "S.", "director", "1@mail.ru", "123", 1, 40);
        employeesArray[3] = new Employee("Kruglov", "K.", "sales adm.", "1@mail.ru", "123", 1, 50);
        employeesArray[4] = new Employee("Mikhailov", "M.", "manager", "1@mail.ru", "123", 1, 60);

        for (Employee employee : employeesArray) {
            if (employee.getAge() > 40) {
                employee.getEmploeeInfo();
            }
        }
    }
}
