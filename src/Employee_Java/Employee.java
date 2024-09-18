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
        return "Employee[id = "+id + " ,salary= "+salary+", name= "+Name+", department= "+jobTitle+"]";
    }
//    public void increment(int salary, int percentage){
//        int newSalary = 0;
//        newSalary = salary + (salary * (percentage / 100));
//        System.out.println("Salary after increment of "+ percentage + "% is: " + newSalary);
//    }
    public void updateSalary(Employee[] employees ,int id, int newSalary){
        for(Employee emp : employees){
            if(emp.id == id){
                emp.salary = newSalary;
            }
        }
        System.out.println("Salary Updated Successfully...." );
    }
    public void updateName(Employee[] employees ,int id, String newName){
        for(Employee emp : employees){
            if(emp.id == id){
                emp.Name = newName;
                System.out.println("Name Updated Successfully...." + emp.getName());
            }
        }

    }



}
