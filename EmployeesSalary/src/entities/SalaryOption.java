package entities;

public class SalaryOption {
    private int id;
    private String name;
    private double salary;

    public SalaryOption(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void incrementSalary(double percentage) {
        this.salary += salary * percentage / 100.00;
    }

    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary;
    }
}
