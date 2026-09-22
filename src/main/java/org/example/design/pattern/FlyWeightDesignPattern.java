package org.example.design.pattern;

/*
    Properties
        - Structure design pattern
        - Used when we need to create many object of class. we use it to reduce creation of object
        - Intrinsic property : which are same for object
        - Extrinsic property : which are different for object

   Impl
        - Interface  which contain common methods :Employee
        - Object individual class : Developer and Tester
        - Intrinsic Property (Developer -Fix the Issue, Tester - Tester the issue)
        - Extrinsic Property skill
* */


import java.util.HashMap;
import java.util.Random;

interface Employee {
    public void assignSkill(String skill);

    public void task();
}

class Developer implements Employee {

    private final String job;
    private String skill;

    Developer() {
        job = "Fix the Issue !";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Developer with skill " + this.skill + " with job " + job);
    }
}

class Tester implements Employee {

    private final String job;
    private String skill;

    Tester() {
        job = "Tester job";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Tester job with skill " + this.skill + "with job " + job);
    }
}

class EmployeeFactory {
    private static HashMap<String, Employee> m = new HashMap<>();

    public static Employee getInstance(String type) {
        Employee employee = null;
        if (m.get(type) != null) {
            employee = m.get(type);
        } else {
            switch (type) {
                case "Developer":
                    System.out.println("Developer Created");
                    employee = new Developer();
                    break;
                case "Tester":
                    System.out.println("Tester Created");
                    employee = new Tester();
                    break;
                default:
                    System.out.println("no Such Employee");
            }
            m.put(type, employee);
        }
        return employee;
    }
}

public class FlyWeightDesignPattern {

    private static String employee[] = {"Developer", "Tester"};
    private static String skills[] = {"Java", "C++", "Angular", "Python"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Employee em = EmployeeFactory.getInstance(getRandEmployee());

            em.assignSkill(getRandSkill());
            em.task();
        }
    }

    private static String getRandSkill() {
        Random random = new Random();
        int rantInt = random.nextInt(skills.length);
        return skills[rantInt];
    }

    private static String getRandEmployee() {
        Random random = new Random();
        int rantInt = random.nextInt(employee.length);
        return employee[rantInt];
    }

}
