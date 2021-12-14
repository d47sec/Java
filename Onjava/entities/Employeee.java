package entities;
public class Employeee extends Person{
    private int salary;
    public Employeee(String name, String addr, int salary) {
        super(name, addr);
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
            " salary='" + getSalary() + "'" +
            "}";
    }
}
