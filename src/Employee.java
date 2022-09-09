import java.util.Objects;

public class Employee {
    private final String fio;
    private int department;
    private double salary;

    public Employee(String fio, int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void printId(int id) {
        for (int i = 0; i < 10; i++) {
        id = id + 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && fio.equals(employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, department, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
