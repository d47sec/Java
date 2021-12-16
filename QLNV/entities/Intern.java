import java.util.ArrayList;

public class Intern extends Employee{
    private String Majors;
    private int Semester;
    private String UniName;

    public Intern() {
    }

    public Intern(int Id, String FullName, String BirthDay, String Emai, String Phone, String Employee_type, int Employee_count, ArrayList<Certificate> lsCertificate, String Majors, int Semester, String UniName) {
        super(Id, FullName, BirthDay, Emai, Phone, Employee_type, Employee_count, lsCertificate);
        this.Majors = Majors;
        this.Semester = Semester;
        this.UniName = UniName;
    }

    public String getMajors() {
        return this.Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public int getSemester() {
        return this.Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public String getUniName() {
        return this.UniName;
    }

    public void setUniName(String UniName) {
        this.UniName = UniName;
    }

    public Intern Majors(String Majors) {
        setMajors(Majors);
        return this;
    }

    public Intern Semester(int Semester) {
        setSemester(Semester);
        return this;
    }

    public Intern UniName(String UniName) {
        setUniName(UniName);
        return this;
    }


    public String showMe() {
        return "{" + super.showInfo() + 
            " Majors='" + getMajors() + "'" +
            ", Semester='" + getSemester() + "'" +
            ", UniName='" + getUniName() + "'" +
            "}";
    }
   
}
