import java.util.ArrayList;

public class Fresher extends Employee{
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher() {
    }

    public Fresher(int Id, String FullName, String BirthDay, String Emai, String Phone, String Employee_type, int Employee_count, ArrayList<Certificate> lsCertificate,String Graduation_date, String Graduation_rank, String Education) {
        super(Id, FullName, BirthDay, Emai, Phone, Employee_type, Employee_count, lsCertificate);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public String getGraduation_date() {
        return this.Graduation_date;
    }

    public void setGraduation_date(String Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return this.Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return this.Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    public Fresher Graduation_date(String Graduation_date) {
        setGraduation_date(Graduation_date);
        return this;
    }

    public Fresher Graduation_rank(String Graduation_rank) {
        setGraduation_rank(Graduation_rank);
        return this;
    }

    public Fresher Education(String Education) {
        setEducation(Education);
        return this;
    }


    public String showMe() {
        return "{" + super.showInfo() + 
            " Graduation_date='" + getGraduation_date() + "'" +
            ", Graduation_rank='" + getGraduation_rank() + "'" +
            ", Education='" + getEducation() + "'" +
            "}";
    }
}
