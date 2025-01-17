public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.setName("Taro Yamada");
        manager1.setId(101);
        manager1.setSalary(80000.0);
        manager1.setDepartment("Sales");
    
        Manager manager2 = new Manager();
        manager2.setName("Hanako Suzuki");
        manager2.setId(102);
        manager2.setSalary(90000.0);
        manager2.setDepartment("Marketing");
    
        Manager manager3 = new Manager();
        manager3.setName("Ichiro Tanaka");
        manager3.setId(103);
        manager3.setSalary(85000.0);
        manager3.setDepartment("HR");
    
          
        Manager[] managers = { manager1, manager2, manager3 };
    
         
        for (Manager manager : managers) {
            System.out.println("Name: " + manager.getName());
            System.out.println("ID: " + manager.getId());
            System.out.println("Salary: " + manager.getSalary());
            System.out.println("Department: " + manager.getDepartment());
            System.out.println();

            System.out.println();
        }
    }

}
    
    


