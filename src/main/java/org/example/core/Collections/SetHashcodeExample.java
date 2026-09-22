package org.example.core.Collections;


import java.util.HashSet;
import java.util.Set;

class Emp {
    private Long id;
    private String name;

    public Emp(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Emp emp = (Emp) o;
//
//        if (id != null ? !id.equals(emp.id) : emp.id != null) return false;
//        return name != null ? name.equals(emp.name) : emp.name == null;
//    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class SetHashcodeExample {

    public static void main(String[] args) {
        Set<Emp> empSet = new HashSet<>();
        empSet.add(new Emp(1l, "harkesh"));
        empSet.add(new Emp(1l, "harkesh"));

        System.out.println(empSet.size());
    }
}
