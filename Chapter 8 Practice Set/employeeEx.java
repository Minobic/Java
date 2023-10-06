class employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class employeeEx {
    public static void main(String[] args) {
  
        employee mayank = new employee();
        mayank.salary = 5000;
        
        mayank.setName("Minobic");
        System.out.println(mayank.getName()); 
        System.out.println(mayank.getSalary());
    }
}