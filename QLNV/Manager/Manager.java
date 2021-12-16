public class Manager extends absFunction{
    @Override
    public void addEmp(Employee e) {
        this.listEmp.add(e);
        for (Employee employee : listEmp) {
            if(employee.getEmployee_type() == e.getEmployee_type() && employee.getId() == e.getId()){
                employee.setEmployee_count(employee.getEmployee_count()+1);
            }
        }
        System.out.println("Add employee success");        
    }

    @Override
    public void updateEmp(Employee e) {
        boolean found = false;
        for (Employee employee : listEmp) {
            if(employee.getId() == e.getId()){
                employee.setPhone(e.getPhone());
                employee.setBirthDay(e.getBirthDay());
                employee.setEmai(e.getEmai());
                employee.setEmployee_type(e.getEmployee_type());
                employee.setFullName(e.getFullName());
                employee.setLsCertificate(e.getLsCertificate());
                System.out.println("Update employee success");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found employee");
        }
    }

    @Override
    public void deleteEmp(int id) {
        boolean found = false;
        for (Employee employee : listEmp) {
            if(employee.getId() == id){
                this.listEmp.remove(employee);
                System.out.println("Delete employee success");
                found = true;
                break;
            }
        }        
        if(!found){System.out.println("Not found employee");}
    }

    @Override
    public void showAllEmp(String type) {
        System.out.println("============== Display all employee type " + type + " ================");
        int i = 1;
        for (Employee employee : listEmp) {
            if(employee.getEmployee_type() == type){
                System.out.println(i + ": " + employee.showMe());
                i ++;
            }
        }        
    }

    @Override
    public void countEmp(){
        int count = 0;
        for (Employee employee : listEmp) {
            count += employee.getEmployee_count();
        }
        System.out.println("Total number of employees: " + count);
    }
    
    
}
