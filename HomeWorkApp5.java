public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "iivanov@mailbox.com", "892312312",30000,30);
        empCorp[1] = new Employee("Petrov Petr", "Creator", "ppetrov@mailbox.com", "892312314",50000,32);
        empCorp[2] = new Employee("Sidorov Alexandr", "Security", "asidorov@mailbox.com", "892312311",10000,43);
        empCorp[3] = new Employee("Alexeeva Maria", "Cleaner", "malexeeva@mailbox.com", "892312315",5000,54);
        empCorp[4] = new Employee("Altunina Daria", "Trainee", "daltunina@mailbox.com", "892312319",3000,21);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    int getAge() {
        return age;
    }
    static String getEmpYears(int age) {
        int a1;
        int a2;
        a1 = age % 10;
        a2 = age % 100;

        if (a1 == 1 && a2 != 11) {
            return "год";
        } else if (a1 >= 2 && a1 <= 4 && (a2 < 10 || a2 >= 20)) {
            return "года";
        } else {
            return "лет";
        }
    }
    @Override
    public String toString() {
        return name +
                "\n| Должность: " + position +
                "\n| E-mail: " + email +
                "\n| Телефон: " + phone +
                "\n| Оклад: " + salary + " руб." +
                "\n| Возраст: " + age + " " + getEmpYears(age) + ".";
    }
}