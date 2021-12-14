package app;
import entities.Employeee;
import entities.Person;

class App{
    public static void main(String[] args) {
        Person per1 = new Person("d47", "hcm");
        Employeee em1 = new Employeee("ThanhDat", "HCM", 1000);
        Employeee em2 = new Employeee("D47sec", "HN", 5000);
        System.out.println(per1.toString());
        System.out.println(em1.toString());
        System.out.println(em2.getName() + " " + em2.getAddr() + " " + em2.getSalary());
    }
}