public class App {
public static void main(String[] args) {
    Manager manager = new Manager();
    Intern intern1 = new Intern();
    intern1.setId(1);
    intern1.setFullName("ThanhDat");
    intern1.setBirthDay("3/2/2001");
    intern1.setEmai("dat@gmail.com");
    intern1.setEmployee_count(0);
    intern1.setEmployee_type("Intern");
    intern1.Majors("ATTT");
    intern1.setPhone("098483433");
    intern1.setSemester(3);
    intern1.setUniName("KMP");
    Certificate intern1Cert = new Certificate("C1", "OSCP", "Gold", "20/2/2021");
    intern1.getLsCertificate().add(intern1Cert);

    Intern intern2 = new Intern();
    intern2.setId(2);
    intern2.setFullName("d47sec");
    intern2.setBirthDay("13/9/2001");
    intern2.setEmai("lizzz@gmail.com");
    intern2.setEmployee_count(0);
    intern2.setEmployee_type("Intern");
    intern2.Majors("ATTT");
    intern2.setPhone("94939943");
    intern2.setSemester(3);
    intern2.setUniName("KMP");
    Certificate intern2Cert = new Certificate("C2", "CEH", "Gold", "9/9/2021");
    intern2.getLsCertificate().add(intern2Cert);


    Fresher fresher1 = new Fresher();
    fresher1.setId(3);
    fresher1.setFullName("d47KMA");
    fresher1.setBirthDay("13/4/2001");
    fresher1.setEmai("d47@gmail.com");
    fresher1.setEmployee_count(0);
    fresher1.setEmployee_type("Fresher");
    fresher1.setEducation("Engineer");
    fresher1.setPhone("08439384");
    fresher1.setGraduation_date("22/11/2024");
    fresher1.setGraduation_rank("Good");
    Certificate fresher1Cert = new Certificate("C3", "OSWE", "Gold", "9/6/2021");
    fresher1.getLsCertificate().add(fresher1Cert);

    Fresher fresher2 = new Fresher();
    fresher2.setId(3); // update employe co id la 3
    fresher2.setFullName("lizzzzz");
    fresher2.setBirthDay("4/4/2001");
    fresher2.setEmai("lizz@gmail.com");
    fresher2.setEmployee_count(0);
    fresher2.setEmployee_type("Fresher");
    fresher2.setEducation("Engineer");
    fresher2.setPhone("094949434");
    fresher2.setGraduation_date("24/5/2025");
    fresher2.setGraduation_rank("Execlent");
    Certificate fresher2Cert = new Certificate("C3", "OSWE", "Silver", "19/6/2021");
    fresher2.getLsCertificate().add(fresher2Cert);

    manager.addEmp(intern1); // them moi mot employee
    manager.addEmp(intern2); // them moi mot employee
    manager.addEmp(fresher1); // them moi mot employee

    manager.showAllEmp("Intern"); // hien thi tat ca employee co loai la intern 
    manager.deleteEmp(2); // xoa employee co id = 2
    manager.showAllEmp("Intern"); // hien thi tat ca employee co loai la intern 
    manager.showAllEmp("Fresher"); // hien thi tat employee co loai la fresher 

    manager.updateEmp(fresher2); // update fresher 1 lay thong tin tu fresher2
    manager.showAllEmp("Fresher");

 }   
}
