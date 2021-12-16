import java.util.ArrayList;

public class Employee {
    private int Id;
    private String FullName;
    private String BirthDay;
    private String Emai;
    private String Phone;
    private String Employee_type;
    private int Employee_count = 0;
    private ArrayList<Certificate> lsCertificate = new ArrayList<>();


    public Employee() {
    }

    public Employee(int Id, String FullName, String BirthDay, String Emai, String Phone, String Employee_type, int Employee_count, ArrayList<Certificate> lsCertificate) {
        this.Id = Id;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Emai = Emai;
        this.Phone = Phone;
        this.Employee_type = Employee_type;
        this.Employee_count = Employee_count;
        this.lsCertificate = lsCertificate;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFullName() {
        return this.FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getBirthDay() {
        return this.BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public String getEmai() {
        return this.Emai;
    }

    public void setEmai(String Emai) {
        this.Emai = Emai;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmployee_type() {
        return this.Employee_type;
    }

    public void setEmployee_type(String Employee_type) {
        this.Employee_type = Employee_type;
    }

    public int getEmployee_count() {
        return this.Employee_count;
    }

    public void setEmployee_count(int Employee_count) {
        this.Employee_count = Employee_count;
    }

    public ArrayList<Certificate> getLsCertificate() {
        return this.lsCertificate;
    }

    public void setLsCertificate(ArrayList<Certificate> lsCertificate) {
        this.lsCertificate = lsCertificate;
    }

    public Employee Id(int Id) {
        setId(Id);
        return this;
    }

    public Employee FullName(String FullName) {
        setFullName(FullName);
        return this;
    }

    public Employee BirthDay(String BirthDay) {
        setBirthDay(BirthDay);
        return this;
    }

    public Employee Emai(String Emai) {
        setEmai(Emai);
        return this;
    }

    public Employee Phone(String Phone) {
        setPhone(Phone);
        return this;
    }

    public Employee Employee_type(String Employee_type) {
        setEmployee_type(Employee_type);
        return this;
    }

    public Employee Employee_count(int Employee_count) {
        setEmployee_count(Employee_count);
        return this;
    }

    public Employee lsCertificate(ArrayList<Certificate> lsCertificate) {
        setLsCertificate(lsCertificate);
        return this;
    }

    
    public String showInfo() {
        return "{" +
            " Id='" + getId() + "'" +
            ", FullName='" + getFullName() + "'" +
            ", BirthDay='" + getBirthDay() + "'" +
            ", Emai='" + getEmai() + "'" +
            ", Phone='" + getPhone() + "'" +
            ", Employee_type='" + getEmployee_type() + "'" +
            ", Employee_count='" + getEmployee_count() + "'" +
            ", lsCertificate='" + getLsCertificate() + "'" +
            "}";
    }
    public String showMe(){return "";}
    
}
