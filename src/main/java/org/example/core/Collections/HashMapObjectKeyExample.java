package org.example.core.Collections;


import java.util.HashMap;
import java.util.Map;


public class HashMapObjectKeyExample {
    public static void main(String[] args) {



        Employees employees = Employees.EmployeeBuilder.anEmployee()
                .withId(1)
                .withName("harkesh")
                .build();
        Employees employees1 = Employees.EmployeeBuilder.anEmployee()
                .withId(1)
                .withName("harkesh")
                .build();

        Map<Employees, String> map = new HashMap<>();
        map.put(employees, "Gurgaon");
        Employees suman = Employees.EmployeeBuilder.anEmployee(employees).withName("Suman").build();

        for (Map.Entry<Employees, String> emp : map.entrySet()) {
            System.out.println(emp.getKey().hashCode());
        }

        map.put(suman, "Kolkata");
        System.out.println( map.get(employees1));

    }
}

class Employees {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employees(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees employees = (Employees) o;

        if (id != employees.id) return false;
        return name != null ? name.equals(employees.name) : employees.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static final class EmployeeBuilder {
        private int id;
        private String name;

        private EmployeeBuilder() {
        }

        public static EmployeeBuilder anEmployee() {
            return new EmployeeBuilder();
        }

        public static EmployeeBuilder anEmployee(Employees employees) {

            return anEmployee().withId(employees.getId()).withName(employees.getName());
        }

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public Employees build() {
            return new Employees(this);
        }

    }

}