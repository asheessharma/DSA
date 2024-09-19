package Employee_Java;
//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
class Employee {
    private int id;
    private String Name;
    private String jobTitle;
    private int salary;

    public Employee(int id,String name, String title, int salary){
        this.id = id;
        this.Name = name;
        this.jobTitle = title;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name){
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
    public void setTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return "id = "+id + " ,salary= "+salary+", name= "+Name+", department= "+jobTitle+" ";
    }

    public static void updateSalary(Employee[] employees ,int id, int newSalary){
        for(Employee emp : employees){
            if(emp.id == id){
                emp.salary = newSalary;
                break;
            }
        }
        System.out.println("Salary Updated Successfully...." );
    }
    public static void updateName(Employee[] employees ,int id, String newName){
        for(Employee emp : employees){
            if(emp.id == id){
                emp.Name = newName;
                System.out.println("Name Updated Successfully....");
                break;
            }
        }
    }
    public static void showDetails(Employee [] employees,int id){
        for(Employee emp : employees){
            if(emp.id == id){
                System.out.println(emp.toString());
                break;
            }
        }
    }




}
