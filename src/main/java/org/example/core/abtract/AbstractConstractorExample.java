package org.example.core.abtract;


abstract class EmployeeAb {
    private String name;
    private int age;

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + "" + this.age);
    }

    public EmployeeAb(String name, int age) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.age = age;
    }

    //    abstract void sendSalary();
//
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Salary extends EmployeeAb {

    private double salary;

    public Salary(String name, int age, double salary) {

        super(name, age);
        System.out.println("salary Class");
        this.salary = salary;
    }

    public void mailCheck() {
        System.out.println("within mailcheck of salary class");
        System.out.println("Mailing a check to " + getName() + " " + getAge());
    }

    public double getSalary() {
        return salary;
    }
}

public class AbstractConstractorExample {
    public static void main(String[] args) {
       Salary salary = new Salary("Harkesh",30,5000);
       EmployeeAb emp = new Salary("Suman",28,3000);
       salary.mailCheck();
       emp.mailCheck();
    }


}
