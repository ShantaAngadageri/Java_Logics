
class Employee {
    String name;
    int age;
    char gender;

    public Employee(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class EmpDetails {
    Employee[] emp = new Employee[5];

    public void addDetails(int index, Employee employee) { // = new Employee("abc1", 18, 'M')
        emp[index] = employee;
    }

    public void print() {
        for (Employee emp1 : emp) {
            //System.out.println(emp1);
            System.out.println(emp1.name);
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        EmpDetails ed = new EmpDetails();
        ed.addDetails(0, new Employee("abc1", 18, 'M'));
        ed.addDetails(1, new Employee("abc2", 18, 'F'));
        ed.addDetails(2, new Employee("abc3", 18, 'O'));
        ed.addDetails(3, new Employee("abc4", 18, 'M'));
        ed.addDetails(4, new Employee("abc5", 18, 'F'));
        
        ed.print();
    }
}
