package Employee_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

class Emp {
    private int emp_Id;
    private String emp_Name;
    private double basicSalary;
    private double hra;
    private double da;
    public Emp(int id,String name,double bs, double hra, double da){
        this.emp_Id = id;
        this.emp_Name = name;
        this.basicSalary = bs;
        this.hra = hra;
        this.da = da;
    }
    public void setEmp_Id(int id){
        this.emp_Id = id;
    }
    private int getEmp_Id(){
        return emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getDa() {
        return da;
    }

    public void setDa(double da) {
        this.da = da;
    }
    public static double calculateGrossSalary(Emp obj){
        return obj.getBasicSalary() + obj.getHra()+obj.getDa();
    }
    public static double calculateNetSalary(Emp obj){
        double total = calculateGrossSalary(obj) ;
        return total - (total*0.1);
    }
}
 class solution_0{
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter id: ");
         int id = s.nextInt();
         System.out.println("Enter Name: ");
         String name = s.next();
         System.out.println("Enter Basic salary: ");
         double bs = s.nextDouble();
         System.out.println("Enter HRA: ");
         double hra = s.nextDouble();
         System.out.println("Enter DA: ");
         double da = s.nextDouble();
         Emp obj = new Emp(id,name,bs,hra,da);
         DecimalFormat df = new DecimalFormat("0.00");
         System.out.println("Gross Salary: " + df.format(Emp.calculateGrossSalary(obj)));
         System.out.println( "Net Salary: " + df.format(Emp.calculateNetSalary(obj)));
     }
 }

