package Employee_Java;

public class main {
    public static void main(String[] args) {

        Employee [] employees = new Employee[4];

        Employee emp1 = new Employee(1, "ashees" , "IT" , 21000);
        Employee emp2 = new Employee(2, "jay" , "HR" , 25000);
        Employee emp3 = new Employee(3, "amit" , "Support" , 11000);
        Employee emp4 = new Employee(4, "lucky" , "IT" , 22000);
        employees[0] =emp1;
        employees[1] = emp2;
        employees[2] =emp3;
        employees[3] = emp4;

        for(Employee employee : employees){
            System.out.println(employee.toString());
        }


    }
}
