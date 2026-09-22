package org.example.core.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Set<HashEqual> set = new HashSet<>();
        set.add(new HashEqual("Harkesh"));
        set.add(new HashEqual("Harkesh"));
        System.out.println("Size of set " + set.size());
    }


}

class HashEqual {
    private String name;

    public HashEqual(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashEqual hashEqual = (HashEqual) o;

        return name != null ? name.equals(hashEqual.name) : hashEqual.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}