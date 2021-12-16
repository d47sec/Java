import java.util.ArrayList;

public class Experience extends Employee{
   private int ExpInYear;
   private String ProSkill;

    public Experience() {
    }

    public Experience(int Id, String FullName, String BirthDay, String Emai, String Phone, String Employee_type, int Employee_count, ArrayList<Certificate> lsCertificate, int ExpInYear, String ProSkill) {
        super(Id, FullName, BirthDay, Emai, Phone, Employee_type, Employee_count, lsCertificate);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return this.ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return this.ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }

    public Experience ExpInYear(int ExpInYear) {
        setExpInYear(ExpInYear);
        return this;
    }

    public Experience ProSkill(String ProSkill) {
        setProSkill(ProSkill);
        return this;
    }


    public String showMe() {
        return "{" + super.showInfo() + 
            " ExpInYear='" + getExpInYear() + "'" +
            ", ProSkill='" + getProSkill() + "'" +
            "}";
    }

}
