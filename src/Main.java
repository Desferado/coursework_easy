import java.util.Scanner;

public class Main {
    public static class Employee {

            private final String firstName;
            private final String middleName;
            private final String lastName;
            private int department;
            private int salary;
            public int id;

            public Employee(String firstName, String middleName, String lastName, int department, int salary, int id) {
                this.firstName = firstName;
                this.middleName = middleName;
                this.lastName = lastName;
                this.department = department;
                this.salary = salary;
                this.id = id;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getMiddleName() {
                return middleName;
            }

            public String getLastName() {
                return lastName;
            }

            public int getDepartment() {
                return department;
            }

            public int getSalary() {
                return salary;
            }

            public int getId() {
                return id;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            public void setDepartment(int department) {
                this.department = department;
            }

            @Override
            public String toString() {
                String data = "Ф.И.О.: " + lastName + " " + firstName + " " + middleName;
                data += " зарплата: " + salary;
                data += " отдел: " + department;
                data += " id: " + id + "\n";
                return data;
            }

        public static void printListEmployee(Employee[] employees) {
            String person = employees[0].toString();
            for (int i = 1; i < employees.length; i++) {
                person += employees[i].toString();
            }
            System.out.println(person);
        }

        public static int getSumSalaryEmployees(Employee[] employees) {
            int sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalary();
            }
            return sum;
        }

        public static Employee getMinSalaryEmployee(Employee[] employees) {
                Employee employeeMinSalary = employees[0];
            for (Employee employee : employees) {
                if (employee.getSalary() < employeeMinSalary.getSalary()) {
                    employeeMinSalary = employee;
                }
            }
                return employeeMinSalary;
        }

        public static Employee getMaxSalaryEmployee(Employee[] employees) {
            Employee employeeMaxSalary = employees[0];
            for (Employee employee : employees) {
                if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                    employeeMaxSalary = employee;
                }
            }
                return employeeMaxSalary;
        }
        public static void printNicEmployee(Employee[] employees) {
            for (Employee employee : employees) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }

        public static void main(String[] args) {
                Employee[] employees = new Employee[4];
                int id = 0;
                for (int n = 0; n < employees.length; n++) {
                    System.out.println("Введите Имя сотрудника");
                    Scanner name1 = new Scanner(System.in);
                    String firstNameEmployee = name1.nextLine();
                    System.out.println("Введите Отчество сотрудника");
                    Scanner name2 = new Scanner(System.in);
                    String middleNameEmployee = name2.nextLine();
                    System.out.println("Введите Фамилию сотрудника");
                    Scanner name3 = new Scanner(System.in);
                    String lastNameEmployee = name3.nextLine();
                    System.out.println("Введите отдел сотрудника от 1 до 5");
                    Scanner departmentEmployee = new Scanner(System.in);
                    int departmentPerson = departmentEmployee.nextInt();
                    System.out.println("Введите зарплату сотрудника");
                    Scanner salaryEmployee = new Scanner(System.in);
                    int salaryPerson = salaryEmployee.nextInt();
                    id++;
                    employees[n] = new Employee(firstNameEmployee, middleNameEmployee, lastNameEmployee, departmentPerson, salaryPerson, id);
                }
                float averageSalary = (float) Employee.getSumSalaryEmployees(employees)/employees.length;
            Employee.printListEmployee(employees);
            System.out.println("Сумма всех затрат на зарплаты в месяц составляет " + Employee.getSumSalaryEmployees(employees) + " рублей.");
            System.out.println("Сотрудник с минимальной зарплатой: \n" + Employee.getMinSalaryEmployee(employees));
            System.out.println("Сотрудник с максимальной зарплатой: \n" + Employee.getMaxSalaryEmployee(employees));
            System.out.println("Среднее значение зарплат за месяц = " + averageSalary);
            Employee.printNicEmployee(employees);
        }
    }


