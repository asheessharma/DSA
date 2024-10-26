package Interfaces;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

interface Sortable{
    void sortBy(String criteria);
}

public class Student implements Sortable, Comparable<Student>{
    int age;
    String name;
    int grade;
    public Student(int age, String name, int grade){
        this.age = age;
        this.name = name;
        this.grade = grade;
    }
    private ArrayList<Student> students = new ArrayList<Student>();
    public  void addElements(Student obj){
        students.add(obj);
    }
    @Override
    public int compareTo(Student that){
        return this.name.compareToIgnoreCase(that.name);

    }
    @Override
    public void sortBy(String str){

        if(str.equalsIgnoreCase("age")){
            Comparator<Student> std = new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.age > o2.age){
                        return 1;
                    }
                    else if(o1.age < o2.age) return -1;
                    else return 0;
                }
            };
            students.sort(std);
        }else if(str.equalsIgnoreCase("grade")){
            Comparator<Student> cmp = new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.grade > o2.grade){
                        return 1;
                    }
                    else if(o1.grade < o2.grade) return -1;
                    else return 0;
                }
            };
            students.sort(cmp);
        }
    }

    public void display(){
        for(Student obj : students){
            System.out.println("Name: " + obj.name + ", Age: " + obj.age + ", Grade: " + obj
                    .grade);
        }
    }

    public static void main(String[] args) {
        Student obj1 = new Student(20,"ajay" , 10);
        Student obj2 = new Student(19,"Ashish" , 9);
        Student obj3 = new Student(21,"Lucky", 11);
        Student obj4 = new Student(24, "john" ,9);


        Student manager  = new Student(0,"" ,0);
        manager.addElements(obj1);
        manager.addElements(obj2);
        manager.addElements(obj3);
        manager.addElements(obj4);

        System.out.println("=======> Sorting by Name: ");
        manager.students.sort(null);
        manager.display();
        System.out.println();
        System.out.println("=======> Sorting by Age: ");
        manager.sortBy("age");
        manager.display();
        System.out.println();
        System.out.println("=======> Sorting by Grade: ");
        manager.sortBy("grade");
        manager.display();






    }

}
