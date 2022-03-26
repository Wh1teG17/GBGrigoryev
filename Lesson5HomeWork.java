package JavaGB;

/**
 * @name Homework 5
 * @author Grigoryev
 * @date 26.03.22
 */

class Lesson5HomeWork {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivanov Ivan", "Engineer",
                        "iivanov@mail.cu", "2323123", 30000, 30),
                new Employee("Petrov Petr", "Lead Engineer",
                        "ppetrov@mail.cu", "1212123", 42000, 39),
                new Employee("Vasilev Vasya", "Head of Head",
                        "vvasilev@mail.cu", "1231234", 52000, 55),
                new Employee("Sidorov Sega", "Sergeunt",
                        "ssidorov@mail.cu", "1232123", 60000, 42),
                new Employee("Sergeev Sidor", "Trainer",
                        "ssergeev@mail.cu", "2323245", 20000, 26)
        };

        for (Employee employee : employees) {
            if (employee.getAge()>40) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employee(String name, String position, String email, String phone,
                    int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name +
                "\n| Position: " + position +
                "\n| Email: " + email +
                "\n| Phone: " + phone +
                "\n| Salary: " + salary +
                "\n| Age: " + age);
    }
}