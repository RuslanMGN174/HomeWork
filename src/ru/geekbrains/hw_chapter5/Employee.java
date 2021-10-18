package ru.geekbrains.hw_chapter5;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String lastName, String firstName, String position, String email, String phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void getEmploeeInfo() {
        System.out.printf(
                "Фамилия: %s\n" +
                        "Имя: %s\n" +
                        "Должность: %s\n" +
                        "Электронная почта: %s\n" +
                        "Номер телефона: %s\n" +
                        "Зарплата: %d\n" +
                        "Возраст: %d\n",
                this.getLastName(),
                this.getFirstName(),
                this.getPosition(),
                this.getEmail(),
                this.getPhoneNumber(),
                this.getSalary(),
                this.getAge());
    }

    String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getPosition() {
        return position;
    }

    private void setPosition(String position) {
        this.position = position;
    }

    String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }

    int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}

/*todo
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */