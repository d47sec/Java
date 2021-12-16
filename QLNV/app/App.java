public class App {
public static void main(String[] args) {
    Manager manager = new Manager();
    Intern intern = new Intern();
    intern.setId(1);
    intern.setFullName("ThanhDat");
    intern.setBirthDay("3/2/2001");
    intern.setEmai("dat@gmail.com");
    intern.setEmployee_count(0);
    intern.setEmployee_type("Intern");
    intern.Majors("ATTT");
    intern.setPhone("098483433");
    intern.setSemester(3);
    intern.setUniName("KMP");
    Certificate internCert = new Certificate("C1", "OSCP", "Gold", "20/2/2021");
    intern.getLsCertificate().add(internCert);

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
    Certificate intern2Cert = new Certificate("C2", "CEP", "Gold", "9/9/2021");
    intern.getLsCertificate().add(intern2Cert);


    Intern fresher1 = new Intern();
    fresher1.setId(2);
    fresher1.setFullName("d47KMA");
    fresher1.setBirthDay("13/4/2001");
    fresher1.setEmai("d47@gmail.com");
    fresher1.setEmployee_count(0);
    fresher1.setEmployee_type("Fresher");
    fresher1.Majors("ATTT");
    fresher1.setPhone("08439384");
    fresher1.setSemester(5);
    fresher1.setUniName("KMP");
    Certificate fresher1Cert = new Certificate("C3", "OSWE", "Gold", "9/6/2021");
    intern.getLsCertificate().add(fresher1Cert);

    manager.addEmp(intern); // them moi mot employee
    manager.addEmp(intern2); // them moi mot employee
    manager.addEmp(fresher1); // them moi mot employee

    manager.showAllEmp("Intern"); // hien thi tat ca employee co loai la intern 
    manager.deleteEmp(2); // xoa employee co id = 2
    manager.showAllEmp("Intern"); // hien thi tat ca employee co loai la intern 
    manager.showAllEmp("Fresher"); // hien thi tat employee co loai la fresher 

 }   
}
