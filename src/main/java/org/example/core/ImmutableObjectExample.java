package org.example.core;


import java.io.Serializable;

class Age {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

 class ImmutableObject implements Serializable {
    private final Age age;

    ImmutableObject(Age age) {
        Age cloneAge = new Age();
        cloneAge.setAge(age.getAge());
        cloneAge.setName(age.getName());
        this.age = cloneAge;
    }

    public Age getAge() {
        return age;
    }
}

public class ImmutableObjectExample {

    public static void main(String[] args) {
        Age age = new Age();
        age.setAge(20);
        age.setName("harkesh");
        ImmutableObject object = new ImmutableObject(age);

        System.out.println("Age of harkesh " + object.getAge().getAge());
        age.setAge(33);
        System.out.println("Age of harkesh after update " + object.getAge().getAge());
        System.out.println();
    }

}


