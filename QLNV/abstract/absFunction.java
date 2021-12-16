import java.util.ArrayList;

public abstract class absFunction {
    ArrayList<Employee> listEmp = new ArrayList<>();
    public abstract void addEmp(Employee e);
    public abstract void updateEmp(Employee e);
    public abstract void deleteEmp(int id);
    public abstract void showAllEmp(String type);
}
