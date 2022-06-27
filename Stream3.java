//program for Incrementing the salary of Employee whose age in Greater then 25 by 10%.

import java.util.*;
import java.util.stream.*;

class Employee{
    private String name;
    private int age;
    private double salary;

    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    void setName(String N){
        this.name=N;
    }   
    String getName(){
        return name;
    }
    
    void setAge(int age){
        this.age=age;
    }   
    int getAge(){
        return age;
    }
     
    void setSalary(double sal){
        this.salary=sal;
    }   
    double getSalary(){
        return salary;
    }

    public String toString(){
        return name+" : "+age+" : "+salary;
    }
 }

public class Stream3{
    public static void main(String args[]){
        List<Employee>employee=new ArrayList<Employee>();
        
        Employee e1=new Employee("Ram",21,10000);
        Employee e2=new Employee("Mohan",41,40000);
        Employee e3=new Employee("Anuj",29,17000);
        Employee e4=new Employee("Arun",48,50000);
        Employee e5=new Employee("Yas",32,22000);
        Employee e6=new Employee("Sanu",52,60000);
        
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
        employee.add(e6);
        
        System.out.println(employee);

        List<Employee>incrementSalary=employee.stream().map(e ->{
            if(e.getAge()>25){
                e.setSalary(e.getSalary()*1.10);
            }
            return e;
        }).collect(Collectors.toList());

        System.out.println(incrementSalary);
    }
}